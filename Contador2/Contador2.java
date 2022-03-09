package Contador2;

public class Contador2 {

    private static int Conteo;
    private static int Incremento;
    private static int Decremento;


    public Contador2(){
        this.Conteo = 0;
        this.Incremento = 0;
        this.Decremento = 0;
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
        if (Conteo > 0) {
            for (int i = 1; i <=Conteo; i++) {
                Incremento = Incremento + 1;
            }
            Conteo = 0;
        }
        else{
            if (Decremento > 0) {
                Incremento = Decremento + 1;
            }
            Incremento = Incremento + 1;
        }
    }

    public static void Disminucion() {
        if (Conteo > 0) {
            for (int i = 0; i <= Conteo; i++) {
                Decremento = Decremento - 1;
            }
            Conteo = 0;
        }
        else{
            if (Incremento > 0) {
                Decremento = Incremento - 1;
            }
            else{
                Decremento = Decremento - 1;
            }
        }
    }

    public int getIncremento() {
        Incrementacion();
        return this.Incremento;
    }

    public int getDecremento() {
        Disminucion();
        return this.Decremento;
    }

}


