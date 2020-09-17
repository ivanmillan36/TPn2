/*
11- Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
compareToIgnoreCase)
 */
package com.mycompany.tpn2;

import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_11 {
    public static void main(String[] args) {
        String palabra1, palabra2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra: ");
        palabra1 = sc.nextLine();
        
        System.out.println("Ingrese otra palabra: ");
        palabra2 = sc.nextLine();
        
        
        if (palabra1.compareTo(palabra2) == 0){
            System.out.println("(compareTo)Las palabras ingresadas son iguales");
        }else{
            System.out.println("(compareTo)Las palabras ingresadas son distintas");
        }
        
        if (palabra1.equals(palabra2)){
            System.out.println("(equals)Las palabras ingresadas son iguales");
        }else{
            System.out.println("(equals)Las palabras ingresadas son distintas");
        }
        
        if (palabra1.compareToIgnoreCase(palabra2)==0){
            System.out.println("(compareToIgnoreCase)Las palabras ingresadas son iguales");
        }else{
            System.out.println("(compareToIgnoreCase)Las palabras ingresadas son distintas");
        }
        
    }
}
