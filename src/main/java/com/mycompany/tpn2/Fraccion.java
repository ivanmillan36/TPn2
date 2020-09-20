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
public class Fraccion {
    int numerador, denominador;
    
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
        int var_denominador = mcm(f1.denominador, f2.denominador);
        int numerador1 = (var_denominador / f1.getDenominador()) * f1.getNumerador();
        int numerador2 = (var_denominador / f2.getDenominador()) * f2.getNumerador();
        
        Fraccion resultado = new Fraccion(numerador1 + numerador2, var_denominador);
        resultado.simplificarFraccion();
        return resultado;
    }
    
    public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
        int var_denominador = mcm(f1.denominador, f2.denominador);
        int numerador1 = (var_denominador / f1.getDenominador()) * f1.getNumerador();
        int numerador2 = (var_denominador / f2.getDenominador()) * f2.getNumerador();
        
        Fraccion resultado = new Fraccion(numerador1 - numerador2, var_denominador);
        return resultado;
    }
    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
        
        int var_numerador = f1.getNumerador() * f2.getNumerador();
        int var_denominador = f1.getDenominador() * f2.getDenominador();
        
        Fraccion resultado = new Fraccion(var_numerador, var_denominador);
        resultado.simplificarFraccion();
        
        return resultado;

    }
    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
        int var_numerador = f1.getNumerador() * f2.getDenominador();
        int var_denominador = f1.getDenominador() * f2.getNumerador();
        
        Fraccion resultado = new Fraccion(var_numerador, var_denominador);
        resultado.simplificarFraccion();
        
        return resultado;
        
    }
    
    private int mcm(int num1, int num2){   // Minimo comun multiplo
        int mcm = 1;
        int i = 2;
        while(i <= num1 || i <= num2)
        {
            if(num1 % i == 0 || num2 % i == 0)
            {
                mcm = mcm * i;
                if(num1 % i == 0) num1 = num1/i;
                if(num2 % i == 0) num2 = num2/i;
            }else{
                i = i+1;
            }
        }  
        return mcm;
    }
    
    int mcd(int num , int den){    // maximo comun divisor
        
        int u = Math.abs(num);
        int v = Math.abs(den);
        if(v == 0){
            return u;
        }
        int r;
        while(v!=0){
            r=u%v;
            u=v;
            v=r;
        }
        return u;
    }
    
    void simplificarFraccion(){
        int mcd = mcd(this.numerador, this.denominador);
        this.numerador = this.numerador / mcd;
        this.denominador = this.denominador / mcd;
    }
    
    String getStringFraccion(){

        if (this.numerador == this.denominador){
            return "1";
        }else{
            return this.numerador + "/" + this.denominador;
        }
    }
    
}
