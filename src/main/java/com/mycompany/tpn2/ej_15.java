/*
15- Indique que sucede si realizo la siguiente declaración de variable:
int numero = null;
¿Qué debo modificar para poder asignar null a la variable?
 */
package com.mycompany.tpn2;

/**
 *
 * @author ivanmillan36
 */
public class ej_15 {
    public static void main(String[] args) {
        
        Integer num = null;
        
    }
}

/*

Si le asignamos "null" a una variable "int" el ide nos muestra que hay un error de incompatibilidad de tipos , y si intentamos ejecutar obtenemos lo siguiente:

Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - Erroneous tree type: <any>
	at com.mycompany.tpn2.ej_15.main(ej_15.java:15)
Command execution failed.

Para solucionar esto debemos cambiar el "int" por "Integer".

*/