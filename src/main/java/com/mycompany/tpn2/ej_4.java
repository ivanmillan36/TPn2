/*
4- Desarrolle un programa que ayude a una cajera a determinar el número de
billetes y monedas que se necesitan de cada una de las siguientes
denominaciones 200, 100, 50, 20, 10, 5, 2 y 1, y monedas de 0.50, 0.25, 0.10 y
0.05 centavos para una cantidad de dinero dada. Ejemplo si la cantidad es
1390,55 se necesitan 6 billetes de 200, 1 billete de 100, 1 billete de 50, 2
billetes de 20, 1 moneda de 0.50 y una moneda de 0.05 centavos.
 */
package com.mycompany.tpn2;

/**
 *
 * @author ivanmillan36
 */

public class ej_4 {
    
    public static void main(String[] args) {
        
        float dinero = (float) 0.75;
        
        cantBilletesYMonedas(dinero);
        
    }
    
    public static void cantBilletesYMonedas(float dinero){
       
        int parte_decimal = 0, parte_entera;
        int[] cant_dinero = new int[12]; 
        
        parte_decimal = (int)((dinero % 1) * 100);
        parte_entera = (int)dinero;
        
        if(parte_entera >= 200){
            cant_dinero[0] = parte_entera / 200;
            parte_entera = parte_entera % 200;
        }
       
        if(parte_entera >= 100){
            cant_dinero[1] = parte_entera / 100;
            parte_entera = parte_entera % 100;
        }
        
        if(parte_entera >= 50){
            cant_dinero[2] = parte_entera / 50;
            parte_entera = parte_entera % 50;
        }
        
        if(parte_entera >= 20){
            cant_dinero[3] = parte_entera / 20;
            parte_entera = parte_entera % 20;
        }
        
        if(parte_entera >= 10){
            cant_dinero[4] = parte_entera / 10;
            parte_entera = parte_entera % 10;
        }
        
        if(parte_entera >= 5){
            cant_dinero[5] = parte_entera / 5;
            parte_entera = parte_entera % 5;
        }
        
        if(parte_entera >= 2){
            cant_dinero[6] = parte_entera / 2;
            parte_entera = parte_entera % 2;
        }
        
        if(parte_entera >= 1){
            cant_dinero[7] = parte_entera / 1;
            parte_entera = parte_entera % 1;
        }
        
        if(parte_decimal >= 50){
            cant_dinero[8] = parte_decimal / 50;
            parte_decimal = parte_decimal % 50;
        }
        
        if(parte_decimal >= 25){
            cant_dinero[9] = parte_decimal / 25;
            parte_decimal = parte_decimal % 25;
        }
        
        if(parte_decimal >= 10){
            cant_dinero[10] = parte_decimal / 10;
            parte_decimal = parte_decimal % 10;
        }
        
        if(parte_decimal >= 5){
            cant_dinero[11] = parte_decimal / 5;
            parte_decimal = parte_decimal % 5;
        }
        
        
        
        System.out.print("Se necesitan " );
        if(cant_dinero[0] > 0) {
            System.out.print(cant_dinero[0] + ((cant_dinero[0]==1)?" billete de 200 ":" billetes de 200 "));
            cant_dinero[0] = 0;
            if(dineroRestante(cant_dinero) == 0){
                System.out.println(".");
            }else if(dineroRestante(cant_dinero) == 1){
                System.out.print("y ");
            }else{
                System.out.print(", ");
            }
        }
        
        if(cant_dinero[1] > 0) {
            System.out.print(cant_dinero[1] + ((cant_dinero[1]==1)?" billete de 100 ":" billetes de 100 "));
            cant_dinero[1] = 0;
            if(dineroRestante(cant_dinero) == 0){
                System.out.println(".");
            }else if(dineroRestante(cant_dinero) == 1){
                System.out.print("y ");
            }else{
                System.out.print(", ");
            }
        }
        
        if(cant_dinero[2] > 0) {
            System.out.print(cant_dinero[2] + ((cant_dinero[2]==1)?" billete de 50 ":" billetes de 50 "));
            cant_dinero[2] = 0;
            if(dineroRestante(cant_dinero) == 0){
                System.out.println(".");
            }else if(dineroRestante(cant_dinero) == 1){
                System.out.print("y ");
            }else{
                System.out.print(", ");
            }
        }
        
        if(cant_dinero[3] > 0) {
            System.out.print(cant_dinero[3] + ((cant_dinero[3]==1)?" billete de 20 ":" billetes de 20 "));
            cant_dinero[3] = 0;
            if(dineroRestante(cant_dinero) == 0){
                System.out.println(".");
            }else if(dineroRestante(cant_dinero) == 1){
                System.out.print("y ");
            }else{
                System.out.print(", ");
            }
        }
        
        if(cant_dinero[4] > 0) {
            System.out.print(cant_dinero[4] + ((cant_dinero[4]==1)?" billete de 10 ":" billetes de 10 "));
            cant_dinero[4] = 0;
            if(dineroRestante(cant_dinero) == 0){
                System.out.println(".");
            }else if(dineroRestante(cant_dinero) == 1){
                System.out.print("y ");
            }else{
                System.out.print(", ");
            }
        }
        
        if(cant_dinero[5] > 0) {
            System.out.print(cant_dinero[5] + ((cant_dinero[5]==1)?" billete de 5 ":" billetes de 5 "));
            cant_dinero[5] = 0;
            if(dineroRestante(cant_dinero) == 0){
                System.out.println(".");
            }else if(dineroRestante(cant_dinero) == 1){
                System.out.print("y ");
            }else{
                System.out.print(", ");
            }
        }
        
        if(cant_dinero[6] > 0) {
            System.out.print(cant_dinero[6] + ((cant_dinero[6]==1)?" billete de 2 ":" billetes de 2 "));
            cant_dinero[6] = 0;
            if(dineroRestante(cant_dinero) == 0){
                System.out.println(".");
            }else if(dineroRestante(cant_dinero) == 1){
                System.out.print("y ");
            }else{
                System.out.print(", ");
            }
        }
        
        if(cant_dinero[7] > 0) {
            System.out.print(cant_dinero[7] + ((cant_dinero[7]==1)?" billete de 1 ":" billetes de 1 "));
            cant_dinero[7] = 0;
            if(dineroRestante(cant_dinero) == 0){
                System.out.println(".");
            }else if(dineroRestante(cant_dinero) == 1){
                System.out.print("y ");
            }else{
                System.out.print(", ");
            }
        }
        
        if(cant_dinero[8] > 0) {
            System.out.print(cant_dinero[8] + ((cant_dinero[8]==1)?" moneda de 0.50 ":" monedas de 0.50 "));
            cant_dinero[8] = 0;
            if(dineroRestante(cant_dinero) == 0){
                System.out.println("centavos.");
            }else if(dineroRestante(cant_dinero) == 1){
                System.out.print("y ");
            }else{
                System.out.print(", ");
            }
        }
        
        if(cant_dinero[9] > 0) {
            System.out.print(cant_dinero[9] + ((cant_dinero[9]==1)?" moneda de 0.25 ":" monedas de 0.25 "));
            cant_dinero[9] = 0;
            if(dineroRestante(cant_dinero) == 0){
                System.out.println("centavos.");
            }else if(dineroRestante(cant_dinero) == 1){
                System.out.print("y ");
            }else{
                System.out.print(", ");
            }
        }
        
        if(cant_dinero[10] > 0) {
            System.out.print(cant_dinero[10] + ((cant_dinero[10]==1)?" moneda de 0.10 ":" monedas de 0.10 "));
            cant_dinero[10] = 0;
            if(dineroRestante(cant_dinero) == 0){
                System.out.println("centavos.");
            }else if(dineroRestante(cant_dinero) == 1){
                System.out.print("y ");
            }else{
                System.out.print(", ");
            }
        }
        
        if(cant_dinero[11] > 0) {
            System.out.print(cant_dinero[11] + ((cant_dinero[11]==1)?" moneda de 0.05 ":" monedas de 0.05 "));
            cant_dinero[11] = 0;
            if(dineroRestante(cant_dinero) == 0){
                System.out.println("centavos.");
            }
        }
        
        
        
    }
   
    public static int dineroRestante(int dinero[] ){
        int sumatoria = 0;
        for(int i=0 ; i<dinero.length; i++){
            if(dinero[i] > 0){
                sumatoria ++;
            }  
        }
        
        return sumatoria;
    }
}

