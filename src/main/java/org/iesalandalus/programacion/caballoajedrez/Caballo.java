/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.caballoajedrez;

/**
 *
 * @author Jaime
 */
public class Caballo 
{
    private Color color;
    private Posicion posicion;

    //Creados geters y seters
    public Color getColorCaballo() {
        return color;
    }

    public void setColorCaballo(Color colorCaballo) {
        this.color = colorCaballo;
    }

    public Posicion getPosicionCaballo() {
        return posicion;
    }

    public void setPosicionCaballo(Posicion posicionCaballo) {
        this.posicion = posicionCaballo;
    }
    
    //Creamos un constructor por defecto para la clase Caballo que cree un caballo negro en la posición '8b'
    public Caballo()
    {
        color = Color.NEGRO;
        posicion = new Posicion(8,'b');
    }
    
}
