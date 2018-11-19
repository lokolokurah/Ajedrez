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

      //Creamos un constructor por defecto para la clase Caballo que cree un caballo negro en la posición '8b'
    public Caballo()
    {
        color = Color.NEGRO;
        posicion = new Posicion(8,'b');
    }
    
    /*Creamos un constructor para la clase Caballo que acepte como parámetro el color
    que creará un caballo de dicho color cuya posición será '1b' si es blanco 
    o '8b' si es negro*/
     public Caballo(Color color)
     {
       this.color=color;
            
             switch(color){
                 case BLANCO:
                     posicion=new Posicion(1,'b');
                     break;
                 case NEGRO:
                     posicion=new Posicion(8,'b');
                     break;
             }
     }
     
     //Creamos un Constructor para la clase Caballo que acepte como parámetros el color y la columna iniciales
     public Caballo(Color color, char columnaInicial)
        {
            this.color=color;
            
             switch(color){
                 case BLANCO:
                     posicion=new Posicion(1,'b');
                     break;
                 case NEGRO:
                     posicion=new Posicion(8,'b');
                     break;
             }
             
             if(columnaInicial!='b'& columnaInicial!='g')
        {
            throw new IllegalArgumentException ("ERROR: La columna introducida no es correcta");
        }
         
            if(columnaInicial=='b'& this.color==Color.BLANCO)
         {
             this.posicion= new Posicion(1,'b');
         }
         
            if(columnaInicial=='b'& this.color==Color.NEGRO)
         {
             this.posicion= new Posicion(8,'b');
         }
         
            if(columnaInicial=='g'& this.color==Color.BLANCO)
         {
             this.posicion= new Posicion(1,'g');
         }
         
            if(columnaInicial=='g'& this.color==Color.NEGRO)
         {
             this.posicion= new Posicion(8,'g');
         }
        }
     
     
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
    
    
}
