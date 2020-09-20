/*
13- Pedir el ingreso de dos cadenas por por teclado, indicar si la segunda cadena se
encuentra dentro de la primera (usar indexOf o contains).
 */
package com.mycompany.tpn2;
import java.util.Scanner;
/**
 *
 * @author ivanmillan36
 */
public class ej_13 {
    public static void main(String[] args) {
        String cadena1, cadena2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena: ");
        cadena1 = sc.nextLine();
        System.out.println("Ingrese otra cadena: ");
        cadena2 = sc.nextLine();
     
        if (cadena1.indexOf(cadena2) == -1){
            System.out.println("La segunda cadena no se encuentra dentro de la primera");
        }else{
            System.out.println("La segunda cadena esta contenida en la primer cadena.");
        }       
    }   
}
