package Cuadadrado;

public class Cuadrado {

    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(5);
        cuadrado1.Area();
        System.out.println(cuadrado1.getLado());
        cuadrado1.setLado(5);        
        cuadrado1.Perimetro();
        System.out.println(cuadrado1.getLado());
    }

    private static int lado;

    public Cuadrado(){
        this.lado = 0;
    }

    public Cuadrado(int LadoC){
        this.lado = LadoC;
    }

    public int getLado(){
        return this.lado;
    }

    public int setLado(int lad){
        return this.lado = lad;
    }

    public static void Area() {
        lado = lado * lado;
        System.out.println("El area es " );
    }

    public static void Perimetro() {
        lado = 4*lado;
        System.out.println("El Perimetro es " );
    }

}
