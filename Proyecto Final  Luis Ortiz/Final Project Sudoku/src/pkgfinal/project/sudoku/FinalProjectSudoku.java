/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project.sudoku;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class FinalProjectSudoku {

    public static String[] nombre_Jugador = new String[2];
    public static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    // Inicio del juego
    public static void main(String[] args) {

        //Creacion de objetos para llamar o invocar las clases
        Sudoku9x9 datos9 = new Sudoku9x9();
        Sudoku6x6 datos6 = new Sudoku6x6();

        // Saludo y presentacion  del juego
        System.out.println(" _____________BIENVENIDO_____________\n");
        System.out.println(" ___________SUDOKU (1 Vs 1)__________\n");
        int[][] respuesta = escoger_sudoku();
        int[] tiempo = new int[4];
        
        //Se ingresa el nombre del jugador  
        for (int j = 0; j < nombre_Jugador.length; j++) {
            int[][] sudoku = new int[respuesta.length][respuesta.length];
            if (j == 0) {
                System.out.print("Ingrese su Nickname Jugador 1: ");
            } else {
                System.out.print("Ingrese su Nickname Jugador 2: ");
            }
            nombre_Jugador[j] = input.next();
            System.out.println(" ______________Comienza______________");
            
        // A traves del condicional if & else se llama los objetos respectivamente de las Clases
            if (sudoku.length == 9) {

                sudoku = datos9.inicio_sudoku(respuesta, sudoku);
                boolean seguir = false, finalizar = true;
                long inicio = System.nanoTime();
                int i = 0;
                do {
                    datos9.imprime_vector(sudoku);
                    sudoku = accion_J1(sudoku);
                    seguir = finalizar(sudoku);
                    //Decidir limite de pasos o continuar normalmente
                    if (i==1) {
                        finalizar = false;
                    }
                    i++;
                } while (finalizar);
                long fin = System.nanoTime();
                double dif = (double) (fin - inicio) * 1.0e-9;
                tiempo[j] = (int) dif;

            } else if (sudoku.length == 6) {

                sudoku = datos6.inicio_sudoku(respuesta, sudoku);
                boolean seguir = false, finalizar = true;
                long inicio = System.nanoTime();
                int i = 0;
                do {
                    datos6.imprime_vector(sudoku);
                    sudoku = accion_J1(sudoku);
                    seguir = finalizar(sudoku);
                    //Decidir limite de pasos o continuar normalmente
                    if (seguir) {
                        finalizar = comprobacion(sudoku,respuesta);
                    }
                    i++;
                } while (finalizar);
                long fin = System.nanoTime();
                double dif = (double) (fin - inicio) * 1.0e-9;
                tiempo[j] = (int) dif;
            }
        }
        
        // El nombre de los jugadores y sus tiempos se almacenan en una lista
        System.out.println("\n___________Resultados___________\n");
        
        //Se determina un ganador
        if (tiempo[0] < tiempo[1]) {
            System.out.println("        Ganador: " + nombre_Jugador[0]);
        } else {
            System.out.println("        Ganador: " + nombre_Jugador[1]);
        }
        
        //Transformar Segundos en minutos 
        tiempo [2]=(int) (tiempo[0]/60);
        tiempo [0]=tiempo [0]-tiempo [2]*60;
        tiempo [3]=(int) (tiempo[1]/60);
        tiempo [1]=tiempo [1]-tiempo [3]*60;
        
        //Se presenta los resultados de tiempo
        System.out.println(nombre_Jugador[0] + "-->Puntaje tiempo empleado "+tiempo[2]+" min: "+ tiempo[0] + " seg");
        System.out.println(nombre_Jugador[1] + "-->Puntaje tiempo empleado "+tiempo[3]+" min: "+ tiempo[1] + " seg");

    }

    // Escoger sudoku (6x6) (9x9)
    public static int[][] escoger_sudoku() {
        CargarSudoku c_S = new CargarSudoku();
        int tam;
        System.out.println("Escoge el tipo de SUDOKU: \n 1. 9x9 \n 2. 6x6");
        do {
            System.out.print("Ingrese el número del literal: ");
            tam = input.nextInt();
        } while ((tam != 1) && (tam != 2));
        int x = 0;
        if (tam == 1) {
            tam = 9;
            x = (int) (Math.random() * 2 + 1);
            return c_S.desdeTxt("9x9." + x + ".txt", tam);
        } else {
            tam = 6;
            x = (int) (Math.random() * 2 + 1);
            return c_S.desdeTxt("6x6." + x + ".txt", tam);
        }
    }

    //Acciones del jugador
    public static int[][] accion_J1(int[][] sudoku) {
        int fila, columna, valor;
        System.out.println(" _____________________________________ ");
        
        //Solicitamos datos al Usuario
        System.out.println("Inserte las coordenadas (fila/columna): ");

        if (sudoku.length == 9) {
            //Fila
            do {
                System.out.print("[fila]: ");
                fila = input.nextInt();
                if ((fila > 9) || (fila == 0)) {
                    System.out.println("El valor [" + fila + "] de la fila es incorrecto");
                }
            } while ((fila > 9) || (fila == 0));

            //Columna
            do {
                System.out.print("[columna]: ");
                columna = input.nextInt();
                if ((fila > 9) || (fila == 0)) {
                    System.out.println("El valor [" + columna + "] de la columna es incorrecto");
                }
            } while ((columna > 9) || (columna == 0));

            //Valor
            do {
                System.out.print("[valor]: ");
                valor = input.nextInt();
                if ((fila > 9) || (fila == 0)) {
                    System.out.println("El valor introducido [" + valor + "] no es valido");
                }
            } while ((valor > 9) || (valor == 0));
            sudoku[fila - 1][columna - 1] = valor;

        }else if(sudoku.length == 6){
            //Fila
            do {
                System.out.print("[fila]: ");
                fila = input.nextInt();
                if ((fila > 6)||(fila == 0)){
                    System.out.println("El valor ["+fila+"] de la fila es incorrecto");
                }
            } while ((fila > 6)||(fila == 0));
        
            //Columna
            do {
                System.out.print("[columna]: ");
                columna = input.nextInt();
                if ((fila > 6)||(fila == 0)){
                    System.out.println("El valor ["+columna+"] de la columna es incorrecto");
                    }
            } while ((columna > 6)||(columna == 0));
        
            //Valor
            do {
                System.out.print("[valor]: ");
                valor = input.nextInt();
                if ((fila > 6)||(fila == 0)){
                System.out.println("El valor introducido ["+valor+"] no es valido");
            }
            } while ((valor > 6)||(valor==0));
             sudoku[fila - 1][columna - 1] = valor;
        }
            return sudoku;
        }

    //Metodo de Comprobacion (Comparar ambas matrices)
    public static boolean comprobacion(int[][] sudoku, int[][] resultado) {
        int k = 0;
        boolean seguir = true;
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                if (sudoku[i][j] == resultado[i][j]) {
                    k++;
                }
            }
        }
        if (k == (sudoku.length * sudoku.length)) {
            System.out.println("RESUELTO----------FELICITACIONES");
            seguir = false;
        } else {
            System.out.println("Hay " + ((sudoku.length * sudoku.length) - k) + " errores");
        }
        return seguir;
    }

    //Metodo para finalizar el juegp
    public static boolean finalizar(int[][] sudoku) {
        boolean finalizar = false;
        for (int[] sudoku1 : sudoku) {
            for (int j = 0; j < sudoku.length; j++) {
                if (sudoku1[j] != 0) {
                    finalizar = true;
                } else {
                    finalizar = false;
                    break;
                }
            }
        }
        return finalizar;
    }

}
