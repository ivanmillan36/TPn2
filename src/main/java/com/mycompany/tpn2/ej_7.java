/*
7- Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas
vocales tiene en total (recorre el String con charAt)
 */
package com.mycompany.tpn2;
import java.util.Scanner;
/**
 *
 * @author ivanmillan36
 */
public class ej_7 {
    public static void main(String[] args) {
        
        String cadena;
        Scanner sc = new Scanner(System.in);
        int cantVocales = 0;
        int [] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        
        System.out.println("Ingrese una cadena: ");
        cadena = sc.nextLine();
        
        System.out.println("El tamaño de la cadena es: " + cadena.length());
        
        for (int i=0; i< cadena.length(); i++){
            for (int j=0; j < vocales.length; j++ ){
                if (cadena.charAt(i) == vocales[j]){
                    cantVocales += 1;
                }
            }  
        }
            
        System.out.println("La cadena tiene " + cantVocales + " vocales."); 
    }
}
