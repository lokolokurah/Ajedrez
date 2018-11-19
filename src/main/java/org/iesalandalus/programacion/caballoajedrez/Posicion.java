/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.caballoajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

/**
 *
 * @author Jaime
 */
public class Posicion 
{
    //Declaración de Atributos
    private int fila;
    private char columna;

    
    //Creado el constructor, usare el Constructor que inicializa todos los atributos a través de parámetros
    public Posicion(int fila, char columna)
    {	
        //Comprobamos validez de datos
        setFila(fila);
        setColumna(columna);                            
    }
    
    //Creado el constructor copia para la clase Posicion
    public Posicion(Posicion copiaPosicion)
    {
        this.fila=copiaPosicion.fila;
        this.columna=copiaPosicion.columna;
    }
    
    //Creados geters y seters
    public int getFila() {
        return fila;
    }
    
    public void setFila(int fila) {
       if (fila>0 && fila<9) {
        this.fila=fila;
       }
       else {
           throw new IllegalArgumentException(" Los valores de la fila son erroneos ");
       }
    }
    
    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        if (columna == 'a' || columna == 'b' || columna == 'c' || columna == 'd' || columna == 'e' || columna == 'f' || columna == 'g' || columna == 'h') {
        this.columna = columna;
       }
       else {
           throw new IllegalArgumentException(" Los valores de la columna son erroneos ");
       }  
    }
    
    
    //Creado metodo equals 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.fila;
        hash = 17 * hash + this.columna;
        return hash;
    }
    
    @Override 
    public boolean equals (Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Posicion other = (Posicion) obj;
        if (this.fila != other.fila) {
            return false;
        }
        if (this.columna != other.columna) {
            return false;
        }
        return true;
    }
    
    //Creado metodo toString
    @Override
    public String toString() {
        return "Posicion{" + "fila=" + fila + ", columna=" + columna + '}';
    }
}
