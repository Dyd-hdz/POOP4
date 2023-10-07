/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica04;

/**
 * Clase TrianguloRectangulo, metodos y atributos de un triangulo rectangulo
 * @author Luis Hernández
 */
public class TrianguloRectangulo {
    float base,altura,alpha,beta;

    /**
     * Cosntructor vacio
     */
    public TrianguloRectangulo() {
    }

    /**
     * Cosntructor lleno
     * @param base Valor de la base del triangulo rectangulo en float
     * @param altura Valor de la altura del triangulo rectangulo en float
     * @param hipotesuna Valor de la hipotenusa del triangulo rectangulo en float
     * @param alpha Angulo alpha del triangulo rectangulo en float
     * @param beta Angulo beta del triangulo rectangulo en float
     */
    public TrianguloRectangulo(float base, float altura, float hipotesuna, float alpha, float beta) {
        this.base = base;
        this.altura = altura;
        this.alpha = alpha;
        this.beta = beta;
    }
    
    /**
     * Metodo que da el area del triangulo rectangulo, bxa/2
     * @param base 
     * @param altura 
     */
    public void area(float base, float altura){
        float area;
        area=base*altura/2;
        System.out.println("El area del triangulo rectangulo es: "+area);
    }
    
    /**
     * Metodo que imprime la distribucion del triangulo rectangulo
     */
    public void distribucion(){
        System.out.println("La distribucion del triangulo rectangulo es:");
        System.out.println("-La base esta relacionado con el angulo alpha");
        System.out.println("-La altura esta relacionado con el angulo beta");
    }
    
    /**
     * Metodo que encuentra la hipotenusa por medio del teorema de Pitagoras
     * @param base
     * @param altura 
     */
    public void encontrarHipotenusa(float base, float altura){
       float hip;
       hip=(float) Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
        System.out.println("La medida de la hipotenusa es: "+hip);
    }
    
    /**
     * Metodo que muestra informacion relevante sobre un triangulo rectangulo
     */
    public void informacion(){
        System.out.println("Un triangulo rectangulo es un triangulo especial ya");
        System.out.println("que con el podemos encontrar todas sus medidas tanto de");
        System.out.println("lados como de sus angulos por medio del teorema de pitagoras");
        System.out.println("o de las razones trigonometricas seno, coseno y tangente.");
    }

    /**
     * Metodo toString/sobreescrito que ahora muestra los valores de los atributos 
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "TrianguloRectangulo{" + "base=" + base + ", altura=" + altura + ", alpha=" + alpha + ", beta=" + beta + '}';
    }
}
