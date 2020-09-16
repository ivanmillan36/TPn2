/*
5- Solicite el ingreso de un número y conviértalo a un String mediante
String.valueOf
 */
package com.mycompany.tpn2;
import java.util.Scanner;
/**
 *
 * @author ivanmillan36
 */
public class ej_5 {
    public static void main(String[] args) {
        
        float num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:" );
        
        num = sc.nextFloat();
        
        System.out.println("El numero ingresado es: " + String.valueOf(num));
        
        
    }
    
}
