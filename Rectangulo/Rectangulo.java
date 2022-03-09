package Rectangulo;

public class Rectangulo {

    private static int ancho;
    private static int alto;
    static int A = 0;
    static int P = 0;

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5,2);
        rectangulo1.Area();
        System.out.println(A);
        rectangulo1.Perimetro();
        System.out.println(P);
    }

    public Rectangulo(){
        this.ancho = 0;
        this.alto = 0;
    }

    public Rectangulo(int Altura, int Anchura){

        if (Altura != Anchura) {
            this.alto = Altura;
            this.ancho = Anchura;
        }
        else{
            System.out.println("El ancho y el alto deben ser distintos");
        }
    }

    public int getAlto(){
        return this.alto;
    }

    public int setAlto(int alt) {
        return this.alto = alt;
    }

    public static void Area() {
        A = 0;
        A = alto * ancho;
    }

    public static void Perimetro() {
        P = 0;
        P = (2*alto) +(2*ancho) ;
    }

}
