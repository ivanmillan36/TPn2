/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tpn2;

/**
 *
 * @author ivanmillan36
 */
public class OperacionMatematica {
    double valor1, valor2;
    String nombre_operacion;

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getNombre_operacion() {
        return nombre_operacion;
    }

    public void setNombre_operacion(String nombre_operacion) {
        this.nombre_operacion = nombre_operacion;
    }
    
    
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
    
    public double aplicarOperacion(String operacion){
        setNombre_operacion(operacion);
        
        if (nombre_operacion.equals("+")){
            return sumarNumeros();
        }
        
        else if (nombre_operacion.equals("-")){
            return restarNumeros();
        }
        
        else if (nombre_operacion.equals("*")){
            return multiplicarNumeros();
        }
        
        else if (nombre_operacion.equals("/")){
            return dividirNumeros();
        }
        
        else{
            return 0;
        }

    }
}
