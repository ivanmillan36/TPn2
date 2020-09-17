/*
10- Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el
usuario lo pida y mostraremos el resultado por pantalla.
 */
package com.mycompany.tpn2;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ivanmillan36
 */
public class ej_10 {
    public static void main(String[] args) {
        
        String cadena;
        
        cadena = JOptionPane.showInputDialog("Ingrese una cadena");
        
        String[] botones = {"Mayuscula", "Minuscula"};
	int ventana = JOptionPane.showOptionDialog( null, 
                                                    "Pulsa un boton:",
                                                    "Ventana de seleccion", 
                                                    JOptionPane.DEFAULT_OPTION, 
                                                    JOptionPane.QUESTION_MESSAGE, null, 
                                                    botones, botones[0]);
        if (ventana == 0){
            JOptionPane.showMessageDialog(null, cadena.toUpperCase());
        } else {
            JOptionPane.showMessageDialog(null, cadena.toLowerCase());
        }
        
    }
}
