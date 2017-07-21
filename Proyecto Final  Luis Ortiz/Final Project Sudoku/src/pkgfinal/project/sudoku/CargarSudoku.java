/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project.sudoku;

import java.io.*;

/**
 *
 * @author DELL
 */
public class CargarSudoku {
    
    //Constructor
    public CargarSudoku(){
        
    }

    public int[][] desdeTxt(String nombreArchivo, int tam) { //Direccion del archivo
        //Creamos la matriz vacia
        int[][] matriz = new int[tam][tam];
        try {
            //Abrimos el archivo
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(nombreArchivo)));
            //Leemos la primera linea
            String linea = in.readLine();
            //Contador
            int contador = 0;
            while (linea != null) {
                String[] values = linea.split(" ");
                //Recorremos el array de string
                for (int i = 0; i < values.length; i++) {
                    //Se obtiene el primer caracter de el arreglo de strings
                    matriz[contador][i] = Integer.parseInt(values[i]);
                }
                contador++;
                linea = in.readLine();
            }
        } catch (IOException  e) {
            System.err.println("Sudoku no encontrado");
        }
        return matriz;
    }
}
