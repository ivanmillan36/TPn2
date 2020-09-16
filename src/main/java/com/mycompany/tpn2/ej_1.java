/*
 1- CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y
asigne el mismo a una variable valorDecimal de tipo double, aplique las
operaciones de CASTING para convertir la variable a los siguientes tipos de
datos, short, int, long, String, float investigue las diferentes formas de lograr la
conversión. Muestre por pantalla el resultado de las conversiones.
 */
package com.mycompany.tpn2;
import java.util.Scanner;
/**
 *
 * @author ivanmillan36
 */
public class ej_1 {
    public static void main(String[] args) {
        
        double num;
        float float_num;
        short short_num;
        int int_num;
        long long_num;
        String string_num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero decimal: ");
        
        num = sc.nextDouble();
        
        
        float_num = (float)num;
        short_num = (short)num;
        int_num = (int)num;
        long_num = (long)num;
        string_num = Double.toString(num);
    
        System.out.println("Double a float: " + float_num);
        System.out.println("Double a short: " + short_num);
        System.out.println("Double a int: " + int_num);
        System.out.println("Double a long: " + long_num);
        System.out.println("Double a string: " + string_num);

    }
}
