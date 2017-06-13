/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        //Creacion de variables
        int n;
        int [][]matriz;
        
        //Solicitud de datos al usuario
        System.out.print("Ingrese el tamaño de la matriz: ");
        n = datos.nextInt();
        matriz = new int[n][n];
        //Llenado de matriz
        System.out.println("Llenar la matriz: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
              matriz[i][j] = datos.nextInt();
            }
        }
        
        //Presentacion de la matriz 
        System.out.println("Presentacion de la matriz: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
              System.out.print(matriz[i][j]+" ");
            }
          System.out.println(" ");
        }
        
        //Presentar fila anterior
        System.out.println("Presentacion de la fila inferiror de la matriz: ");
        for (int j=0; j<n; j++){
              System.out.print(matriz[n-1][j]+" ");
        }
        
        //Presentar diagonal principal
         System.out.println("\nPresentacion de la diagonal principal de la matriz: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i==j){
                    System.out.print(matriz[i][j]+" ");
                }else{
                    System.out.print("   ");
                }
            }
          System.out.println(" ");
        }
        //Presentar diagonal secundaria
         System.out.println("\nPresentacion de la diaganol secundaria de la matriz: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i+j==n-1){
                    System.out.print(matriz[i][j]+" ");
                }else{
                    System.out.print("   ");
                }
            }
          System.out.println(" ");
        }
        //Elementos sobre la diagonal principal
         System.out.println("\nElementos sobre la diagonal principal de la matriz: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i<j){
                    System.out.print(matriz[i][j]+" ");
                }else{
                    System.out.print("  ");
                }
            }
          System.out.println(" ");
        }
        //Elementos sobre la diagonal principal
         System.out.println("\nElementos sobre la diagonal secundaria de la matriz: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i+j<n-1){
                    System.out.print(matriz[i][j]+" ");
                }else{
                    System.out.print("   ");
                }
            }
          System.out.println(" ");
        }
        //Elementos debajo la diagonal principal
         System.out.println("\nElementos debajo la diagonal principal de la matriz: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i>j){
                    System.out.print(matriz[i][j]+" ");
                }else{
                    System.out.print("   ");
                }
            }
          System.out.println(" ");
        }
        //Elementos debajo la diagonal secundaria
         System.out.println("\nElementos debajo la diagonal secundaria de la matriz: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i+j>n-1){
                    System.out.print(matriz[i][j]+" ");
                }else{
                    System.out.print("  ");
                }
            }
          System.out.println(" ");
        }
        //Matriz Sig-Sag
        System.out.println("\nMatriz Zig-Zag: ");
        int j=0;
        int i=0;
        for (int x = 0; x < matriz.length; x++){
            if (x % 2 == 0){
                for (i = 0; i < matriz.length; i++){
                    System.out.print(" "+matriz[i][j]+" ");
                }        
            } else{
                for (i = matriz.length - 1 ; i >= 0; i--){
                    System.out.print(" "+matriz[i][j]+" ");
            } 
        }
        j++;
        }
    }
    
}
