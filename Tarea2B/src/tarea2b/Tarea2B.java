/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2b;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Tarea2B {
    private static int[][] matriz;
    public static int opc;
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
    //Variables
    Tarea2B ma = new Tarea2B();
    int tipo;
        tipo = EscogerMatriz();
        LlenarMatriz(tipo);
        
    //Lamado de las funciones
    Tarea2B.PresentarMatriz();  
    Tarea2B.sobreSecundaria();
    Tarea2B.debajoPrincipal();
    Tarea2B.debajoSecundaria();
    }
    
     public static int EscogerMatriz (){
        System.out.print("Seleccione el tipo de Matriz\n 1-Matriz Cuadrada\n 2-Matriz Rectangular\nIngrese el número de la opción: ");
        opc = input.nextInt();
        return opc;
    }
    public static int[][] LlenarMatriz (int tipo){
        // Variables
        int columnas = 0, filas = 0;
        if (tipo == 1){
            System.out.print("Ingrese el tamaño de la Matriz: ");
            filas = input.nextInt();
            columnas = filas;
        } else if (tipo == 2){
            System.out.print("Ingrese el número de Filas: ");
            filas = input.nextInt();
            System.out.print("Ingrese el número de Columnas: ");
            columnas = input.nextInt();
        }
        matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese un valor: ");
                matriz[i][j] = input.nextInt();
            }
        }
        return matriz;
    }
    public static void PresentarMatriz() {
        System.out.println("Presentacion de Matriz");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz1[j]);
                System.out.print(" ");               
            }
            System.out.println();
        }
    }
    public static void sobreSecundaria() {
        System.out.println("Elementos sobre D. Secundaria");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j < matriz.length - 1) {
                   System.out.print(matriz[i][j]);
                } else {
                   System.out.print(" ");
                }
                System.out.print(" ");        
            }
            System.out.println();
        }
    }
    public static void debajoPrincipal() {
        System.out.println("Elementos debajo de la D. Principal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i > j) {
                   System.out.print(matriz[i][j]);
                } else {
                   System.out.print(" ");
                }
                System.out.print(" ");           
            }
            System.out.println();
        }
    }
    public static void debajoSecundaria() {
        System.out.println("Elementos debajo de la D. Secundaria");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j >= matriz.length) {
                   System.out.print(matriz[i][j]);
                } else {
                   System.out.print(" ");
                }
                System.out.print(" ");               
            }
            System.out.println();
        }
    }
}
