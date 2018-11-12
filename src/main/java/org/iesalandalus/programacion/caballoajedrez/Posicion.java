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
    
    
    //Creados geters y seters
    public int getFila() {
        return fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setFila(int fila) {
       if (fila>0 && fila<9) {
        this.fila=fila;
       }
       else {
           throw new IllegalArgumentException(" Los valores de la fila son erroneos ");
       }
    }

    public void setColumna(char columna) {
        if (columna == 'a' || columna == 'b' || columna == 'c' || columna == 'd' || columna == 'e' || columna == 'f' || columna == 'g' || columna == 'h') {
        this.columna = columna;
       }
       else {
           throw new IllegalArgumentException(" Los valores de la columna son erroneos ");
       }

        
    }
    
    
    //Creado el constructor, usare el Constructor que inicializa todos los atributos a través de parámetros
    public Posicion(int fila, char columna)
    {	
        //Comprobamos validez de datos
        //Cambiada a forma más simplificada llamando a metodos get y set
        setFila(fila);
        setColumna(columna);                            
    }
    
    
    //Creado el constructor copia para la clase Posicion
    public Posicion(Posicion copiaPosicion)
    {
        this.fila=copiaPosicion.fila;
        this.columna=copiaPosicion.columna;
    }
}
