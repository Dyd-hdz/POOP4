/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica04;

import java.util.Scanner;

/**
 * Archivo principal, inicializacion de las clases.
 * @author Luis Hernandez
 */
public class Practica04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // TODO code application logic here
        Punto punto= new Punto();//como no tiene ningun parametro usara el cosntructor vacio y iniciala las variables con el dato default, el 0
        punto.imprimirPunto();//uso del metodo de la clase Punto para punto
        Punto punto2= new Punto(3,5);//aqui iniciara los parametros con estos datos en el constructor normal (el que no es vacio)
        punto2.imprimirPunto();//uso del metodo de la clase Punto para punto2
        System.out.println(punto);//sin la sobreescritura mientra la referencia, con la sobreescritura muestra los datos que contiene la la clase Punto en forma de cadena
        //se parsea a toString() para mostrar los datos y no la referencia
        
        Perro perro=new Perro("max","chihuhua","negro",2);//clase perro
        System.out.println(perro);
        
        Coche coche=new Coche("Rojo","Mazda","Disel","automatico","2019");//clase coche
        coche.girar("derecha");
        System.out.println(coche.toString());
        System.out.println(coche);
        
        System.out.println("\n\n");
        //Actividad extra
        float base,altura;//clase triangulo rectangulo
        TrianguloRectangulo triangulo=new TrianguloRectangulo();
        triangulo.informacion();
        System.out.println("El valor de la base y altura es:");
        base=sc.nextFloat();
        altura=sc.nextFloat();
        triangulo.encontrarHipotenusa(base,altura);
        triangulo.area(base, altura);
        System.out.println("\n");
        
        Alumno alumno=new Alumno("Luis",17,8,20,8.83f);//clase alumno
        System.out.println(alumno);
        alumno.asistir(12);
        alumno.exponer();
        System.out.println("\n");
        
        float calificacion;//clase profesor
        Profesor profesor=new Profesor("Eduardo","POO",35,40,8460.93f);
        System.out.println("Datos del profesor:\n"+profesor);
        calificacion=(float)Math.random()*10.1f;
        profesor.calificar(calificacion);
        profesor.reprobar(calificacion);
        profesor.asistir();
    }
}
