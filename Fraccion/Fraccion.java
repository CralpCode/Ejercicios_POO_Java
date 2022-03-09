package Fraccion;

public class Fraccion {
    
    static int numerador;
    static int denominador;
    static int numerador2;
    static int denominador2;
    static int suma;
    static int resta;
    static int multiplicacion;
    static int division;


    public Fraccion(){
        this.numerador = 0;
        this.denominador = 0;
        this.numerador2 = 0;
        this.denominador2 = 0;
    }

    public Fraccion(int Numerador, int Denominador, int Numerador2,int Denominador2 ){
        this.numerador = Numerador;
        this.denominador = Denominador;
        this.numerador2 = Numerador2;
        this.denominador2 = Denominador2;
    }

   
    public static void Sumar() {
        suma = (numerador/denominador)+(numerador2/denominador2);
    }

    public static void Restar() {
        resta = (numerador/denominador)-(numerador2/denominador2);
    }

    public static void Multiplicar() {
        multiplicacion = (numerador/denominador)*(numerador2/denominador2);
    }

    public static void Dividir(){
        division = (numerador/denominador)/(numerador2/denominador2);
    }
}
