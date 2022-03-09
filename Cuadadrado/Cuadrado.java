package Cuadadrado;

public class Cuadrado {

    private static int lado;
    private static int AreaC;
    private static int PerimetroC;

    public Cuadrado(){
        this.lado = 0;
        this.AreaC = 0;
        this.PerimetroC = 0;
    }

    public Cuadrado(int LadoC){
        this.lado = LadoC;
    }

    public Cuadrado(Cuadrado objCuadrado){
        this.lado = objCuadrado.lado;
    }

    public int getLado(){
        return this.lado;
    }

    public int setLado(int lad){
        return this.lado = lad;
    }

    public static void Area() {
        AreaC = lado * lado;
    }

    public static void Perimetro() {
        PerimetroC = 4*lado;
    }

    public int getArea(){
        Area();
        return this.AreaC;
    }

    public int getPerimetro(){
        Perimetro();
        return this.PerimetroC;
    }

}
