/*
3- Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -
999) y por medio del uso de las operaciones matemáticas módulo 10 y división
por 10 efectué la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida
del algoritmo 14.
 */
package com.mycompany.tpn2;
import java.util.Scanner;
/**
 *
 * @author ivanmillan36
 */
public class ej_3 {
    
    public static int suma(int num){
        
        if(num/10 == 0){
            return (num % 10);
        }else{
            return (num % 10) + suma(num/10);
        }
    }
    
    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ngreso de un numero de 3 dígitos (100 - 999)");
        num = sc.nextInt();
        
        System.out.println("La suma de los numeros es: " + suma(num));
        
    }
    
    
    
}
