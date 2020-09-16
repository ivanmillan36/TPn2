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
        
        float dinero = (float) 200;
        
        cantBilletesYMonedas(dinero);
        
    }
    
    public static void cantBilletesYMonedas(float dinero){
        int cant_200 = 0 , cant_100 = 0, cant_50 = 0, cant_20 = 0, cant_10 = 0, cant_5 = 0, cant_2 = 0, cant_1 = 0, cant_mon_50, cant_mon25, cant_mon10, cant_mon_05;
        int parte_decimal, parte_entera;
        
        parte_decimal = (int)((dinero % 1) * 100);
        parte_entera = (int)dinero;
        
        if(parte_entera >= 200){
            cant_200 = parte_entera / 200;
            parte_entera = parte_entera % 200;
        }
        
        if(parte_entera >= 100){
            cant_100 = parte_entera / 100;
            parte_entera = parte_entera % 100;
        }
        
        if(parte_entera >= 50){
            cant_50 = parte_entera / 50;
            parte_entera = parte_entera % 50;
        }
        
        if(parte_entera >= 5){
            cant_5 = parte_entera / 5;
            parte_entera = parte_entera % 5;
        }
        
        if(parte_entera >= 2){
            cant_2 = parte_entera / 2;
            parte_entera = parte_entera % 2;
        }
        
        if(parte_entera >= 1){
            cant_1 = parte_entera / 1;
            parte_entera = parte_entera % 1;
        }
        
        System.out.print("Se necesitan " );
        if(cant_200 > 0) System.out.print(cant_200 + ((cant_200==1)?" billete de 200, ":" billetes de 200, "));
        if(cant_100 > 0) System.out.print(cant_100 + ((cant_100==1)?" billete de 100, ":" billetes de 100, "));
        if(cant_50 > 0) System.out.print(cant_50 + ((cant_50==1)?" billete de 50, ":" billetes de 50, "));
        if(cant_20 > 0) System.out.print(cant_20 + ((cant_20==1)?" billete de 20, ":" billetes de 20, "));
        if(cant_10 > 0) System.out.print(cant_10 + ((cant_10==1)?" billete de 10, ":" billetes de 10, "));
        if(cant_5 > 0) System.out.print(cant_5 + ((cant_5==1)?" billete de 5, ":" billetes de 5, "));
        if(cant_2 > 0) System.out.print(cant_2 + ((cant_2==1)?" billete de 2, ":" billetes de 2, "));
        if(cant_1 > 0) System.out.print(cant_1 + ((cant_1==1)?" billete de 1, ":" billetes de 1, "));
        
    }
   
    
}
