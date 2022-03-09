package Libro;

public class Libro {

    private static int mes;
    
    public Libro(){
        this.mes = 0;
    }

    public Libro(int CMes){
        this.mes = CMes;
    }

    public int getMes(){
        return this.mes;
    }

    public int setMes(int mess){
        return this.mes = mess;
    }

    public static void Devolucion(){
        if (mes > 3) {
            System.out.println("Tienes que devolver el libro y pagar una multa de Q20\n");
        }
        else{
            System.out.println("Aun puedes devolver el libro a tiempo\n");
        }
    }

    public static void Prestamo() {
        System.out.println("Libro prestado");
        System.out.println("Puedes prestar el libro durante 3 meses\n");
    }

    public static void mostrarInformacion() {
        System.out.println("Libro");
        System.out.println("Meses prestado " + mes );
        System.out.println("Devolucion aun sin devolver\n");
    }


}
