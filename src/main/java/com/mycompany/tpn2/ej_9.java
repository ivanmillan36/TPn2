/*
9- Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII.
Muéstralos en línea recta, separados por un espacio entre cada carácter.
 */
package com.mycompany.tpn2;

/**
 *
 * @author ivanmillan36
 */
public class ej_9 {
    public static void main(String[] args) {
        
        String cadena = "La lluvia en Mendoza es escasa";
        
        for (int i=0; i < cadena.length(); i++){
            
            System.out.print((int)cadena.charAt(i) + " ");
        }   
    }
}
