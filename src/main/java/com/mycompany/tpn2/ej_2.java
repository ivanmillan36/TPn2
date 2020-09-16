/*
  2- Si se asigna un valor a una variable fuera de rango (mayor de lo establecido)
¿Qué ocurre? ¿Existe alguna forma de resolverlo? Ejemplifique.
 */
package com.mycompany.tpn2;

/**
 *
 * @author ivanmillan36
 */
public class ej_2 {
    public static void main(String[] args) {
        int num;
        
        num = 123456789;
        

        //Si intentamos asignar un valor mayor al permitido el IDE nos muestra un error indicandonos que el numero
        //es demasiado grande.
        //Podemos solucionarlo usando el tipo de dato long en lugar de int, con lo cual podriamos asignarle a la variable
        //un valor maximo de 9,223,372,036,854,775,807.
        //Si tampoco nos sirve el tipo de dato long porque necesitamos trabajar con un numero mayor al maximo permitido
        //entonces podriamos usar la clase ava.math.BigInteger que no tiene un numero maximo establecido.
        //Fuente de la informacion: https://es.stackoverflow.com/questions/262853/java-numeros-grandes-obtenidos-del-factorial-de-17-en-adelante
        
        
    }
}
