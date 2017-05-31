/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion1preunta2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Leccion1Preunta2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner datos = new Scanner(System.in); 
         //Crear variables
         int [] lista;
         lista = new int [5];
         
         lista[0]=2;
         lista[1]=3;
         lista[2]=21;
         lista[3]=7;
         lista[4]=83;
         //lista[5]=2;
         
         for (int i=0; i<=4; i++){
            System.out.println("Lista: "+lista[i] );
         }
    }
    
}
