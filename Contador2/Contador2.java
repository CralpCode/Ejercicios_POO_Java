package Contador2;

public class Contador2 {
    public static void main(String[] args) {
        Contador2 contar = new Contador2(5);
        System.out.println(contar.getContador2());
    }

    private static int Conteo;

    public Contador2(){
        this.Conteo = 0;
    }

    public Contador2(int Conteo){
        this.Conteo = Conteo;
    }

    public Contador2(Contador2 objContador2){
        this.Conteo = objContador2.Conteo;
    }

    public int getContador2() {
        return this.Conteo;
    }

    public void setContador2(int Increm) {
        this.Conteo = Increm;
    }

    public static void Incrementacion() {
        Conteo = Conteo + 1;
    }

    public static void Disminucion() {
        Conteo = Conteo - 1;
    }
}
