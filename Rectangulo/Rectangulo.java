package Rectangulo;

public class Rectangulo {

    private static int ancho;
    private static int alto;
    private static int A = 0;
    private static int P = 0;

   /* public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5,2);

        System.out.println(rectangulo1.getAreaR());
        System.out.println(rectangulo1.getPerimetro());
    }*/

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

    public int getAncho(){
        return this.ancho;
    }

    public int setAncho(int anc) {
        return this.ancho = anc;
    }


    public static void Area() {
        A = alto * ancho;
    }

    public static void Perimetro() {
        P = (2*alto) +(2*ancho) ;
    }

    public int getAreaR(){
        Area();
        return this.A;
    }

    public int getPerimetro(){
        Perimetro();
        return this.P;
    }

}
