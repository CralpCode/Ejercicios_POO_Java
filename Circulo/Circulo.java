package Circulo;

public class Circulo {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        circulo1.Area();
        System.out.println(circulo1.getCirculo());
        circulo1.setCirculo(5);
        circulo1.Perimetro();
        System.out.println(circulo1.getCirculo());
        
    }
    private static double radio;

    public Circulo(){
        this.radio = 0;
    }

    public Circulo(double RadioC){
        this.radio = RadioC;
    }

    public double getCirculo(){
        return this.radio;
    }

    public double setCirculo(double rad){
        return this.radio = rad;
    }

    public void Area() {
        radio = ((Math.PI)*(radio*radio));
    }

    public void Perimetro() {
        radio = 2*((Math.PI)*(radio));
    }
}
