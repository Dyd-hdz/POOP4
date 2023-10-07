/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;

/**
 * Clase Perro, contiene los metodos y atributos de un Perro
 * @author alumno
 */
public class Perro {
    String nombre,raza,color;
    int edad;

    /**
     * Constructor vacio
     */
    public Perro() {
    }

    /**
     * Constructor lleno
     * @param nombre Nombre del perro en String
     * @param raza Raza del perro en String
     * @param color Color del perro en String
     * @param edad  Edad del perro en int
     */
    public Perro(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }
    
    /**
     * Metodo para sentar el perro
     */
    public void sentado(){
        System.out.println("Estoy sentado");
    }
    
    /**
     * Metodo para que ladre el perro
     * @param veces numero de veces
     */
    public void ladra(int veces){
        for (int i = 0; i <veces; i++) {
            System.out.println("Gau");
        }
    }
    
    /**
     * Metodo para que corra el perro
     * @param distancia Distancia que recorre
     */
    public void corre(int distancia){
        System.out.println("Corri "+distancia+" metros");
    }
    
    /**
     * Metodo que dice cuantas horas duerme el perro
     * @param horas Numero de horas
     */
    public void duerme(int horas){
        System.out.println("Dormi"+horas+" horas");
    }

    /**
     * Metodo toString/sobreescrito que ahora muestra los valores de los atributos 
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + '}';
    }
}
