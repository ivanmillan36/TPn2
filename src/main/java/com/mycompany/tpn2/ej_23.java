/*
23- Crea un programa donde se pida el ingreso de una cadena y por medio de
recursión mostrar la cadena de forma inversa.
Ejemplo: Ingreso “computadora de escritorio”
Invertir cadena “oirotircse ed arodatupmoc”
 */
package com.mycompany.tpn2;

/**
 *
 * @author ivanmillan36
 */
public class ej_23 {
    public static void main(String[] args) {
        String cadena = "Laboratorio de computacion";
        
        System.out.println(funcion(cadena, cadena.length()));
    }
    
    public static String funcion(String s, int indice){
        
        if (indice == 0){
            return "";
        }else{
            return s.substring(indice - 1, indice) + funcion(s, indice -1 );
        }
        
    }
}
