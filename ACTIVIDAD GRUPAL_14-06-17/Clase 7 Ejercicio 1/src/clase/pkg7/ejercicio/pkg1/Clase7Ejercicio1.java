/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg7.ejercicio.pkg1;
import java.util.Scanner;
public class Clase7Ejercicio1 {

    static double iva=0.12;
    
public static void main(String[] args) {
        // Variable para la entrada de datos
        Scanner datos = new Scanner(System.in);
        // Creacion de variables
        double ciclo=0, tronc=0, libre=0, beca=0;
        double resultado=0, tot=0, tot2=0,descbeca;
        // Datos de entrada
        System.out.println("Integrantes: ");
        System.out.println("Carlos Sarmiento ");
        System.out.println("Luis Ortiz ");
        System.out.println("Ingrese el ciclo a cursar: ");
        ciclo=datos.nextDouble();
        System.out.println("Ingrese el numero de materias troncales: ");
        tronc=datos.nextDouble();
        System.out.println("Ingrese el numero de materias de libre: ");
        libre=datos.nextDouble();
        System.out.println("Ingrese la beca que tiene: ");
        System.out.println("1. Meritos");
        System.out.println("2. Familiar");
        System.out.println("0. No tiene beca");
        beca=datos.nextDouble();
        // Presentación de resultados
        resultado=ciclo(ciclo)+materias(tronc,libre);
        tot=(calculoiva(resultado,iva));
        descbeca=(tot*beca(beca));
        tot2=tot-descbeca;
        System.out.println("El subtotal es: "+resultado); 
        System.out.println("El calculo con IVA: "+tot);
        System.out.println("El total con descuento de beca: "+tot2);
    }
    public static double ciclo(double opción){        
        if (opción==1){
            return 700;
        }
        if (opción==3){
            return 720;
        }
        if (opción==5){
            return 740;
        }
        if (opción==7){
            return 760;
        }
        if (opción==9){
            return 780;
        }
        return 0;
    }
    public static double materias(double mattronc, double matlibre){
        double total=0;
        total=(mattronc*4*35)+(matlibre*3*35);
        return total;
    }
    public static double beca(double opción){
        if (opción==1){
            return 0.15;
        }
        if (opción==2){
            return 0.08;
        }
        return 0;
    }
    public static double calculoiva(double subtotal, double iva){
        double total=0;
        total=subtotal+(subtotal*iva);
        return total;
    }
}