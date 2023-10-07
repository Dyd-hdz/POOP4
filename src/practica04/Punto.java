/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;

/**
 * Clase Punto, metodos y atributos de un Punto
 * @author alumno
 */
public class Punto {
    int x,y;//zona de atributos

    /**
     * Costructor lleno
     * @param x Un valor del punto en int
     * @param y Otro valor del punto en int
     */
    public Punto(int x, int y) {//zona de constructor, constructor con valores de sus parametros
        this.x = x;
        this.y = y;
    }
    
    /**
     * Cosntructor vacio
     */
    public Punto() {//constructor vacio
    }
    //la sobrecarga es tener dos metodos llamados igual, pero deben tener parametros diferentes
    
    /**
     * Metodo que imprime el valor de 'x' y 'y'
     */
    public void imprimirPunto(){//zona de metodo
        System.out.println("x="+x+", y="+y);
        
    }

    /**
     * Metodo toString/sobreescrito que ahora muestra los valores de los atributos 
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override//sobreescritura
    public String toString() {//con esto la variable punto muestra de forma de cadena los atributos de la clase Punto
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
