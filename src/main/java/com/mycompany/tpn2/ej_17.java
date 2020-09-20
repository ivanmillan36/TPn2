/*
17- Cree una clase FuncionesPrograma y codifique una función estática que reciba
como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
..........
}
Cree una clase Principal que contenga un método main y haga uso de la función
getFechaString.
 */
package com.mycompany.tpn2;

import java.time.Instant;
import java.util.Date;
/**
 *
 * @author ivanmillan36
 */
public class ej_17 {
    public static void main(String[] args) {
        Date fecha_actual = Date.from(Instant.now());
        
        System.out.println(FuncionesPrograma.getFechaString(fecha_actual));
    }
}
