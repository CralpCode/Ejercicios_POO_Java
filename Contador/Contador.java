package Contador;

public class Contador {

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


