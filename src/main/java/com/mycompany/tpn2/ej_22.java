/*
22- Suma los dígitos de un número ingresado por el usuario de forma recursiva.
Ejemplo: el usuario ingresa 1596
El programa debe sumar 1 + 5 + 9 + 6
 */
package com.mycompany.tpn2;

import static com.mycompany.tpn2.ej_21.sumatoria;
import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class ej_22 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        do{
           System.out.println("Ingrese un entero mayor a cero: ");
           num = sc.nextInt();
        }while(num <= 0);
        
        System.out.println("La sumatoria de los numeros que lo componen es: " + sumatoria(num));
        
    }
    
    
    public static int sumatoria(int num){
        if (num <= 10 ){
            return num;
        }
        
        int result = num / 10;
        return (num % 10) + sumatoria(result);
        
    }
}
