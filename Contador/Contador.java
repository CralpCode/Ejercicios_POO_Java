package Contador;

public class Contador {

    public static void main(String[] args) {
        Contador contar = new Contador(5);
        System.out.println(contar.getContador());
    }

    private static int Conteo;
    private static int Incremento;
    private static int Decremento;


    public Contador(){
        this.Conteo = 0;
        this.Incremento = 0;
        this.Decremento = 0;
    }

    public Contador(int Conteo){
        this.Conteo = Conteo;
    }

    public Contador(Contador objContador){
        this.Conteo = objContador.Conteo;
    }

    public int getContador() {
        return this.Conteo;
    }

    public void setContador(int Increm) {
        this.Conteo = Increm;
    }

    public int getIncremento() {
        return this.Incremento;
    }

    public int getDecremento() {
        return this.Incremento;
    }

    public static void Incrementacion() {
        Incremento = Conteo + 1;
    }

    public static void Disminucion() {
        Decremento = Conteo - 1;
    }
}


