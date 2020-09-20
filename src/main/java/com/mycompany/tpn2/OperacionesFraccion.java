/*
20- Cree una clase Fracción con dos atributos numéricos enteros, numerador y
denominador. Agregue un constructor sobrecargado (debe contener como
parámetros el numerador y el denominador) que cree el objeto Fracción
correspondiente.
Agregue a la clase los siguientes 4 métodos e implemente los mismos:
public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
..........
}
public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
..........
}
public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
..........
}
public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
..........
}
Cree una clase OperacionesFraccion que contenga un método main donde se
solicite al usuario el ingreso de 4 valores numéricos enteros con los cuales se
crearan 2 objetos Fracción y finalizada la creación de los mismos se ejecutaran
los 4 métodos implementados anteriormente asignando el resultado a una
nueva variable de tipo Fracción y mostrando por pantalla el resultado de las
operaciones realizadas.
 */
package com.mycompany.tpn2;

import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class OperacionesFraccion {
    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numerador: ");
        num1 = sc.nextInt();
        System.out.println("Ingrse un denominador: ");
        num2 = sc.nextInt();
        System.out.println("Ingrse un segundo numerador: ");
        num3 = sc.nextInt();
        System.out.println("Ingrse un segundo denominador: ");
        num4 = sc.nextInt();
        
        Fraccion fraccion1 = new Fraccion(num1, num2);
        Fraccion fraccion2 = new Fraccion(num3, num4);
        
        Fraccion resultado = fraccion1.sumarFracciones(fraccion1, fraccion2);
        System.out.println("La suma de las fracciones es: " + resultado.getStringFraccion());
        
        resultado = fraccion1.restarFracciones(fraccion1, fraccion2);
        System.out.println("La resta de las fracciones es: " + resultado.getStringFraccion());
       
        resultado = fraccion1.multiplicarFracciones(fraccion1, fraccion2);
        System.out.println("La multiplicacion de las fracciones es: " + resultado.getStringFraccion());
        
        resultado = fraccion1.dividirFracciones(fraccion1, fraccion2);
        System.out.println("La division de las fracciones es: " + resultado.getStringFraccion());
        
        
        
        
    }
}
