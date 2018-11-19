/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.caballoajedrez;

import javax.naming.OperationNotSupportedException;

/**
 *
 * @author Jaime
 */
public class Caballo 
{
    private Color color;
    private Posicion posicion;
    private static final String ERROR_MOVIMIENTO = "Movimiento no permitido: ";
    
    
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
    
    
    /*Crea el método mover que dependiendo del movimiento modificará la
    posición del mismo o si no puede realizar dicho movimiento debe lanzar una
    excepción del tipo OperationNotSupportedException con un mensaje adecuado
    y no modificará la posición del caballo.*/
     public void moverCaballo(Direccion direccion, int x, char y) throws OperationNotSupportedException 
     { 
        if (direccion == null) {
			throw new IllegalArgumentException(" La dirección no puede ser nula. ");
		}
		if ((posicion.getFila()) <= 0 && posicion.getColumna()<=0) {
			throw new IllegalArgumentException(" El número de pasos debe ser mayor que cero. ");
		}
		switch (direccion) {
			case ARRIBA_DERECHA:
                              
                                try {
                                        posicion.setFila(posicion.getFila()+2);
                                        posicion.setColumna((char) (posicion.getColumna()+1));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO);
				}
				break;
			case ARRIBA_IZQUIERDA:
				try {
					posicion.setFila(posicion.getFila()+2);
                                        posicion.setColumna((char) (posicion.getColumna()-1));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO);
				}
				break;
			case DERECHA_ARRIBA:
				try {
                                        posicion.setColumna((char) (posicion.getColumna()+2));
                                        posicion.setFila(posicion.getFila()+1);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO);
				}
				break;
                        case DERECHA_ABAJO:
				try {
					posicion.setColumna((char) (posicion.getColumna()+2));
                                        posicion.setFila(posicion.getFila()-1);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO);
				}
				break;
			case IZQUIERDA_ARRIBA:
				try {
					posicion.setColumna((char) (posicion.getColumna()-2));
                                        posicion.setFila(posicion.getFila()+1);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO);
				}
				break;
                        case IZQUIERDA_ABAJO:
				try {
					posicion.setColumna((char) (posicion.getColumna()-2));
                                        posicion.setFila(posicion.getFila()-1);
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO);
				}
				break;
                        case ABAJO_IZQUIERDA:
				try {
					posicion.setFila(posicion.getFila()-2);
                                        posicion.setColumna((char) (posicion.getColumna()-1));
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO);
				}
				break;
                        case ABAJO_DERECHA:
				try {
					posicion.setFila(posicion.getFila()-2);
                                        posicion.setColumna((char) (posicion.getColumna()+1));;
				} catch (IllegalArgumentException e) {
					throw new OperationNotSupportedException(ERROR_MOVIMIENTO);
				}
				break;
                                
			default:
				break;
		}
     }
     
}
