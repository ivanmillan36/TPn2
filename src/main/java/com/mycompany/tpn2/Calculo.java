/*
19- Cree una clase OperacionMatematica con dos atributos numéricos decimales,
valor1 y valor2 y un atributo String de nombre operación. Cree los
correspondientes métodos get/set.

Agregue a la clase los siguientes 5 métodos:
private double sumarNumeros(){
return valor1 + valor2;
}
private double restarNumeros(){
return valor1 - valor2;
}
private double multiplicarNumeros(){
return valor1 * valor2;
}
private double dividirNumeros(){
return valor1 / valor2;
}
El quinto método será el siguiente:
public double aplicarOperacion(String operacion){
.......................
}
Cree una clase Calculo que contenga un método main, donde cree una
instancia de la clase OperacionMatematica, asigne 2 valores para las variables
de la instancia y ejecute la función aplicarOperacion, pasando como parámetro
primero “+”, después “-”, a continuación “*” y finalmente “/”. Muestre por
pantalla el resultado de las operaciones.
 */
package com.mycompany.tpn2;

/**
 *
 * @author ivanmillan36
 */
public class Calculo {
    public static void main(String[] args) {
        
        OperacionMatematica op = new OperacionMatematica();
        
        op.setValor1(20);
        op.setValor2(2);
        
        System.out.println("La suma de los numeros es: " + op.aplicarOperacion("+"));
        System.out.println("La resta de los numeros es: " + op.aplicarOperacion("-"));
        System.out.println("La multiplicacion de los numeros es: " + op.aplicarOperacion("*"));
        System.out.println("La division de los numeros es: " + op.aplicarOperacion("/"));
        
    }
}
