/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;

/**
 * Clase Alumno, contiene los metodos y atributos de un alumno
 * @author Luis Hernández
 */
public class Alumno {
    String nombre;
    int nl,grupo,edad;
    float promedio;

    /**
     * Constructor vacio del alumno
     */
    public Alumno() {
    }

    /**
     * Constructor lleno
     * @param nombre Nombre del alumno en String
     * @param nl Numero de lista del alumno en int
     * @param grupo Grupo del alumno en int
     * @param edad Edad del alumno en int
     * @param promedio Promedio del alumno en float
     */
    public Alumno(String nombre, int nl, int grupo, int edad, float promedio) {
        this.nombre = nombre;
        this.nl = nl;
        this.grupo = grupo;
        this.edad = edad;
        this.promedio = promedio;
    }
    
    /**
     * Metodo que hace la tarea
     */
    public void tarea(){
        System.out.println("Hoy si hice la tarea del dia, espero obtener una buena calificacion");
    }
    
    /**
     * Metodo para estudiar
     */
    public void estudiar(){
        System.out.println("Hoy voy a tomar el libro de electricidad para estudiar sus conceptos");
    }
    
    /**
     * Metodo para exponer
     */
    public void exponer(){
        System.out.println("El tema que a mi y a mi equipo nos va tocar exponer son los Patrones de Diseño");
    }
    
    /**
     * Metodo que dice cuantas materias reprobo
     * @param numero El numero de materias que reprobo
     */
    public void reprobar(int numero){
        System.out.println("El numero de materias que reprobare este semestre son: "+numero);
    }
    /**
     * Metodo que dice cuantas veces asistio a clases
     * @param veces El numero de veces
     */
    public void asistir(int veces){
        System.out.println("El numero de asistencias en este mes es de: "+veces);
    }

    /**
     * Metodo toString/sobreescrito que ahora muestra los valores de los atributos 
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nl=" + nl + ", grupo=0" + grupo + ", edad=" + edad + ", promedio=" + promedio + '}';
    }
}
