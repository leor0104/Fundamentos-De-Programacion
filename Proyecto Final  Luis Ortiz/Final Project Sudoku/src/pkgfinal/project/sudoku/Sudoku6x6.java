/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project.sudoku;

/**
 *
 * @author DELL
 */
public class Sudoku6x6 {
    
    //Constructor
    public Sudoku6x6(){
        
    }
    
        //Metodo para imprimir el vector
    public static void imprime_vector(int[][] matriz) {
        String linea = (char) 27 + "[36m+-----------------------+ ";
        System.out.println(" " + linea);
        for (int f = 0; f < matriz.length; f++) {
            System.out.print(" | ");
            for (int c = 0; c < matriz.length; c++) {
                if (matriz[f][c] != 0) {
                    System.out.print(matriz[f][c]);
                } else {
                    System.out.print(" ");
                }

                if (c == 2 || c == 5) {
                    System.out.print(" | ");
                } else {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (f != 1 && f != 3 && f != 5) {
                System.out.print(" +-----------+-----------+ ");
            } else {
                System.out.print(" " + linea);
            }
            System.out.println();
        }
    }

        //Metodo para colocar valores aleatoriamente
    public static int[][] inicio_sudoku(int[][] respuesta, int[][] sudoku) {
        int x, j, k, i = 0, f = 0;
        while (f < 18) {
            x = (int) (Math.random() * 2);
            while (x != 0) {
                k = (int) (Math.random() * 6);
                if (sudoku[i][k] != respuesta[i][k]) {
                    sudoku[i][k] = respuesta[i][k];
                    f++;
                    x--;
                }
            }
            i++;
            if (i == 6) {
                i = 0;
            }
        }
        return sudoku;
    }  
}

