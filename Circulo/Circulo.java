package Circulo;

public class Circulo {
    /*public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        System.out.println(circulo1.getAreaCir());
        System.out.println(circulo1.getPerimetroCir());
        
    }*/
    private static double radio;
    private static double AreaCir;
    private static double PerimetroCir;

    public Circulo(){
        this.radio = 0;
        this.AreaCir = 0;
        this.PerimetroCir = 0;
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
        AreaCir = ((Math.PI)*(radio*radio));
    }

    public void Perimetro() {
        PerimetroCir = 2*((Math.PI)*(radio));
    }
    public double getAreaCir(){
        Area();
        return this.AreaCir;
    }
    public double getPerimetroCir(){
        Perimetro();
        return this.PerimetroCir;
    }
}
