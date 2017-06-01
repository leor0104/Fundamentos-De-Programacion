/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2bejercicio3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in); 
         //Crear variables
         int [] lista;
         int i, j;
         int n_veces=0;
         //Solicitud de datos al usuario
         System.out.print("Ingrese el tamaño de la lista: ");
         int x = datos.nextInt();
         lista = new int [x];
         
         for (i=0; i<lista.length; i++){
            System.out.print("Ingrese los valores: ");
         lista[i]= datos.nextInt();
         }
            System.out.println("Lista");
         for (i = 0; i < lista.length; i++){
            for (j = 0; j < lista.length; j++ ){
                if (lista[i] == lista[j]){
                    n_veces += 1 ; 
                }
            }
            System.out.println("Posicion -"+(i+1)+" : "+lista[i]+" se repite " + n_veces+" vez");
         }
    }
    
}
