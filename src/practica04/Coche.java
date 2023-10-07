/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;

/**
 * Clases de Coche, contiene los metodos y atributos de un coche
 * @author Luis Hernàndez
 */
public class Coche {
    String color, marca, combustible, motor,modelo;

    /**
     * Constructor vacio
     */
    public Coche() {
    }

    
    /**
     * Constructor lleno
     * @param color Color del carro en String
     * @param marca Marca del carro en String
     * @param combustible Tipo de combustible del carro en String
     * @param motor Tipo de motor del carro en String
     * @param modelo Modelo del carro en String
     */
    public Coche(String color, String marca, String combustible, String motor, String modelo) {
        this.color = color;
        this.marca = marca;
        this.combustible = combustible;
        this.motor = motor;
        this.modelo = modelo;
    }
    
    /**
     * Metodo para avanzar el coche
     */
    public void avanzar(){
        System.out.println("El coche avanzó");
    }
    
    /**
     * Metodo para retroceder el coche
     */
    public void retroceder(){
        System.out.println("El coche retrocedió");
    }
    
    /**
     * Metodo para prender el coche
     */
    public void prender(){
        System.out.println("Prendido");
    }
    
    /**
     * Metodo para apagar el coche
     */
    public void apagar(){
        System.out.println("Apagado");
    }
    
    /**
     * Metodo para girar el cohe
     * @param lado Lado en el que girara el coche
     */
    public void girar(String lado){
        System.out.println("El coche gira a la "+lado);
    }

    /**
     * Metodo toString/sobreescrito que ahora muestra los valores de los atributos 
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", marca=" + marca + ", combustible=" + combustible + ", motor=" + motor + ", modelo=" + modelo + '}';
    }
}
