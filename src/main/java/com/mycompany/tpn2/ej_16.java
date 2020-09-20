/*
16- Como transformo una variable tipo Double a una variable tipo double.
 */
package com.mycompany.tpn2;

/**
 *
 * @author ivanmillan36
 */
public class ej_16 {
    public static void main(String[] args) {
        Double num = 100.50;
        double num2;
        
        num2 = num.doubleValue();
        
        System.out.println("El dato almacenado en la variable Double \"num\" es: " + num2);
    }
}
