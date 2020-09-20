/*
21- Codifique un programa que solicite un número entero mayor a cero y que
mediante recursión sume todos los números números naturales desde el
número ingresado hasta 1.
Ejemplo: Ingreso 10
El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1
 */
package com.mycompany.tpn2;

import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_21 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        do{
           System.out.println("Ingrese un entero mayor a cero: ");
           num = sc.nextInt();
        }while(num <= 0);
        
        System.out.println("La sumatoria de todos los naturales hasta el 1 es: " + sumatoria(num));
        
    }
    
    public static int sumatoria (int n){
        
        if (n == 1){
            return 1;
        }else{
            return n + sumatoria(n-1);
        }
            
    }
}
