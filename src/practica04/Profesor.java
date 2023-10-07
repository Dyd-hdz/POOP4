/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;

import java.text.DecimalFormat;

/**
 * Clase Profesor, contiene los metodos y atributos de un Profesor
 * @author Luis Hernández
 */
public class Profesor {
    String nombre,materia;
    int edad, n_alumnos;
    float salario;

    /**
     * Cosntructor vacio
     */
    public Profesor() {
    }

    /**
     * Constructor lleno
     * @param nombre Nombre del profesor en String
     * @param materia Materia que da el profesor en String
     * @param edad Edad del profesor en int
     * @param n_alumnos Numero de alumnos que tiene el profesor en int
     * @param salario Salario que gana el profesor en float
     */
    public Profesor(String nombre, String materia, int edad, int n_alumnos, float salario) {
        this.nombre = nombre;
        this.materia = materia;
        this.edad = edad;
        this.n_alumnos = n_alumnos;
        this.salario = salario;
    }
    
    /**
     * Metodo que hace que enseñe el profesor
     * @param tema Tema que enseñara
     */
    public void enseñar(String tema){
        System.out.println("En la clase del dia de hoy vamos a ver el tema de: "+tema);
    }
    
    /**
     * Metodo que explica algun concepto
     */
    public void explicar(){
        System.out.println("Las clases son los moldes de los objetos, los objetos es una clase pero con atributos ya dados, a esto se le llama instancia");
    }
    
    /**
     * Metodo que hace que el profe asista
     */
    public void asistir(){
        System.out.println("Como el profesor debo de asistir a cada una de las clases o si no me descontaran de mi salario ($"+salario+")");
    }
    
    /**
     * Metodo que hace que el profesor califique
     * @param calificacion La calificacion que va a recibir el alumno
     */
    public void calificar(float calificacion){
        DecimalFormat df=new DecimalFormat("#.00");
        System.out.println("La calificacion en este semestre para Juanito es de:"+df.format(calificacion));
    }
    
    /**
     * Metodo para decidir quien aprueba y quien no
     * @param calificacion La calificacion que va a recibir el alumno
     */
    public void reprobar(float calificacion){
        if (calificacion>6) {
            System.out.println("Juanito aprobo este semestre");
        }else{
            System.out.println("Juanito no aprobo este semestre, por tanto debe de presentar el examen final");
        }
    }

    /**
     * Metodo toString/sobreescrito que ahora muestra los valores de los atributos 
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Profesor{" + "\n\tnombre=" + nombre + "\n\tmateria=" + materia + "\n\tedad=" + edad + "\n\tnumero de alumnos=" + n_alumnos + "\n\tsalario=$" + salario + '}';
    }
    
    
}
