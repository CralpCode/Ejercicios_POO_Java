package Principal;

import Circulo.Circulo;
import Contador.Contador;
import Contador2.Contador2;
import Cuadadrado.Cuadrado;
import Fraccion.Fraccion;
import Libro.Libro;
import Rectangulo.Rectangulo;

public class Principal {

    public static void main(String[] args) {
        Principal fin = new Principal();
    }

    public Principal(){
        Contador cont = new Contador(5);
        Contador cont2 = cont;
        cont2.setContador(6);
        System.out.println("*******************Contador****************");
        System.out.println("Contador incrementa " + cont.getIncremento());
        System.out.println("Contador decrementa " + cont.getDecremento());
        System.out.println("*******************************************\n");

        Cuadrado cuadrado1 = new Cuadrado(5);
        Cuadrado c2 = cuadrado1;
        c2.setLado(6);
        System.out.println("*******************Cuadrado****************");
        System.out.println("Area del cuadrado " + cuadrado1.getArea());
        System.out.println("Perimetro del cuadrado " + cuadrado1.getPerimetro());
        System.out.println("*******************************************\n");

        Circulo circulo1 = new Circulo(5);
        Circulo cir2 = circulo1;
        cir2.setCirculo(6);
        System.out.println("*******************Circulo****************");
        System.out.println("Area del circulo " + circulo1.getAreaCir());
        System.out.println("Perimetro del circulo " + circulo1.getPerimetroCir());
        System.out.println("*******************************************\n");

        Rectangulo rectangulo1 = new Rectangulo(5,4);
        Rectangulo rec2 = rectangulo1;
        rec2.setAncho(6);
        System.out.println("*******************Rectangulo ****************");
        System.out.println("Area del rectangulo " + rectangulo1.getAreaR());
        System.out.println("Perimetro del rectangulo  " + rectangulo1.getPerimetro());
        System.out.println("*******************************************\n");

        Contador2 contt = new Contador2(5);
        Contador2 contt2 = contt;
        contt2.setContador2(6);
        System.out.println("*******************Contador2****************");
        System.out.println("Contador incrementa " + contt.getIncremento());
        System.out.println("Contador decrementa " + contt.getDecremento());
        System.out.println("*******************************************\n");
        
        Fraccion fraccion1 = new Fraccion(5,4,7,10);
        Fraccion frac2 = fraccion1;
        frac2.setDenominador(6);
        System.out.println("*******************Fracciones****************");
        System.out.println("La suma de fracciones es " + fraccion1.getSuma());
        System.out.println("La resta de fracciones es  " + fraccion1.getResta());
        System.out.println("La multiplicacion de fracciones es  " + fraccion1.getMultiplicar());
        System.out.println("La division de fracciones es  " + fraccion1.getDividir());
        System.out.println("*******************************************\n");
    
        Libro libro1 = new Libro(2);
        Libro Lib2 = libro1;
        Lib2.setMes(1);
        System.out.println("*******************Libro****************");
        System.out.println("Estado de prestamo:");
        libro1.Prestamo();
        System.out.println("Informacion del libro:");
        libro1.mostrarInformacion();
        System.out.println("Estado de devolucion:");
        libro1.Devolucion();
        System.out.println("*******************************************\n");
    }
}
