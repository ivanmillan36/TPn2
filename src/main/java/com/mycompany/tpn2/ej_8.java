/*
8- Reemplaza todas las a del String anterior por una e. (aplique replace)
 */
package com.mycompany.tpn2;

import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_8 {
    public static void main(String[] args) {
        
        String cadena;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena: ");
        cadena = sc.nextLine();
       
        
        System.out.println("La nueva cadena es: ");
        System.out.println(cadena.replace('a', 'e'));
             
    }

}