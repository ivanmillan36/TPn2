/*
 12-Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
 */
package com.mycompany.tpn2;

/**
 *
 * @author ivanmillan36
 */
public class ej_12 {
    public static void main(String[] args) {
        String cadena = "Laboratorio de computacion";
        String cadena_extraida;
        
        cadena_extraida = cadena.substring(4, 6);
        
        System.out.println(cadena_extraida);
        
    }
}
