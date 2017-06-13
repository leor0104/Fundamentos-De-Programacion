/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones.arreglos;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Arreglos {
    private int[][] matriz;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        Arreglos ma = new Arreglos();
        ma.leerMatriz();
        System.out.println("Selección la acción a realizar.\n 1 Martiz Principal\n 2 Martiz Secundaria\n 3 Martiz Principal Superiorn");
        System.out.println("4 Martiz Principal Inferior\n 5 Martiz Secundaria Superior\n 6 Martiz Secundaria Inferior\n 7 Matriz en Zig Zag");
        op = ma.input.nextInt();
        switch(op) {
            case(1):
                ma.diagonalPrincipal();
                break;
            case(2):
                ma.diagonalSecundaria();
                break;
            case(3):
                ma.superiorPrincipal();
                break;
            case(4):
                ma.inferiorPrincipal();
                break;
            case(5):
                ma.superiorSecundaria();
                break;
            case(6):
                ma.inferiorSecundaria();
                break;
            case(7):
                ma.zigzag();
                break;
        } 
    }
    
    public int[][] leerMatriz() {
        
        int n;
        
        System.out.print("Ingrese el tamaño de la matriz: ");
        n = input.nextInt();

        matriz = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese un valor: ");
                matriz[i][j] = input.nextInt();
            }
        }
        return matriz;
    }
    
    public void diagonalPrincipal() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                   System.out.print(matriz[i][j]);
                } else {
                   System.out.print(" ");
                }
                System.out.print(" ");               
            }
            System.out.println();
        }
    }
   
    public void diagonalSecundaria() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j == matriz.length - 1) {
                   System.out.print(matriz[i][j]);
                } else {
                   System.out.print(" ");
                }
                System.out.print(" ");                
            }
            System.out.println();
        }
    }
     
    public void superiorPrincipal() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i < j) {
                   System.out.print(matriz[i][j]);
                } else {
                   System.out.print(" ");
                }
                System.out.print(" ");                
            }
            System.out.println();
        }
    }
    
    public void inferiorPrincipal() {
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
    
    public void superiorSecundaria() {
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
    
    public void inferiorSecundaria() {
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
    
    public void zigzag() {
        int j = 0;
        int i = 0;
        System.out.print(" Zig-Zag : ");
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
