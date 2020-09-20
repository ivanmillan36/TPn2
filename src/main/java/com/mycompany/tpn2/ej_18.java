/*
18- En la clase FuncionesPrograma codifique una función estática que reciba como
parámetro 3 valores enteros, día, mes, anio y retorne la fecha de tipo Date
correspondiente.
public static Date getFechaDate(int día, int mes, int anio){
..........
}
En la clase Principal creada en el punto anterior haga uso de la función
getFechaDate.
 */
package com.mycompany.tpn2;

import java.text.ParseException;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author ivanmillan36
 */
public class ej_18 {
    public static void main(String[] args) throws ParseException {
        
        Date fecha_actual = Date.from(Instant.now());
        String fecha_string = FuncionesPrograma.getFechaString(fecha_actual);
        System.out.println(fecha_string);
        
        System.out.println(FuncionesPrograma.getFechaDate(24, 06, 1989));
        
    }
}
