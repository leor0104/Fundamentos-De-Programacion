/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglossaltos;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ArreglosSaltos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in); 
         //Crear variables
         int [] lista;

         
         //Solicitud de datos al usuario
         System.out.print("Ingrese el tamaño del arreglo: ");
         int x = datos.nextInt();
         lista = new int [x];
         
         for (int i=0; i<lista.length; i++){
            System.out.print("Ingrese los valores al arreglo: ");
         lista[i]= datos.nextInt();
         }
         
         for (int i=0; i<lista.length; i=i+2){
            System.out.println("Lista: "+lista[i] );
         }
    }
    
}
