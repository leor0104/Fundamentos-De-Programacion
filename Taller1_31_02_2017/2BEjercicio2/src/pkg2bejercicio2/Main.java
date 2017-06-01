/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2bejercicio2;

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
         int menor=0;
         //Solicitud de datos al usuario
         System.out.print("Ingrese el tamaño de la lista: ");
         int x = datos.nextInt();
         lista = new int [x];
         
         for (int i=0; i<lista.length; i++){
            System.out.print("Ingrese los valores: ");
         lista[i]= datos.nextInt();
           //Calculo de menor  
            if (i==0){
             menor = lista[i];
            }else if(lista[i]<menor){
                 menor=lista[i];
            }
        }
         //Presentacion de resultados al usuario
        System.out.println("Menor: "+menor);
    }
    
}
