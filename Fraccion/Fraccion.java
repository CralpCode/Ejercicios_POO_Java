package Fraccion;

public class Fraccion {
    
    static double numerador;
    static double denominador;
    static double numerador2;
    static double denominador2;
    static double suma;
    static double resta;
    static double multiplicacion;
    static double division;


    public Fraccion(){
        this.suma = 0;
        this.resta = 0;
        this.multiplicacion = 0;
        this.division = 0;
        this.numerador = 0;
        this.denominador = 0;
        this.numerador2 = 0;
        this.denominador2 = 0;
    }

    public Fraccion(double Numerador, double Denominador, double Numerador2,double Denominador2 ){
        this.numerador = Numerador;
        this.denominador = Denominador;
        this.numerador2 = Numerador2;
        this.denominador2 = Denominador2;
    }

    public double getNumerador(){
        return this.numerador;
    }

    public double setNumerador(double num){
        return this.numerador = num;
    }

    public double getNumerador2(){
        return this.numerador2;
    }

    public double setNumerador2(double num2){
        return this.numerador = num2;
    }

    public double getDenominador(){
        return this.denominador;
    }

    public double setDenominador(double dem){
        return this.denominador = dem;
    }

    public double getDenominador2(){
        return this.denominador2;
    }

    public double setDenominador2(double dem2){
        return this.denominador2 = dem2;
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

    public double getSuma(){
        Sumar();
        return this.suma;
    }

    public double getResta(){
        Restar();
        return this.resta;
    }

    public double getMultiplicar(){
        Multiplicar();
        return this.multiplicacion;
    }

    public double getDividir(){
        Dividir();
        return this.division;
    }
}
