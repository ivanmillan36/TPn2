package com.mycompany.tpn2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ivanmillan36
 */
public class FuncionesPrograma {
    public static String getFechaString(Date fecha){
        
        return fecha.toString();
              
    }
    
    public static Date getFechaDate(int día, int mes, int anio) throws ParseException{
        
        String fecha = Integer.toString(día) + " " + Integer.toString(mes) + " " + Integer.toString(anio) ;
        DateFormat format = new SimpleDateFormat("dd mm yyyy");
        Date date = format.parse(fecha);
        
        return date;
    }
}
