package Principal;

import Contador.Contador;

public class Principal {

    public static void main(String[] args) {
        Principal final = new Principal();
    }

    public Principal(){
        Contador cont = new Contador(5);
        Contador cont2 = cont;
        cont2.setContador(6);

        System.out.println("Contador incrementa" + cont.getIncrementacion());
        System.out.println("Contador incrementa" + cont.getDisminucion());
    }
}
