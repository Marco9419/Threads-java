package clases;

public class ClasePrincipal {

    public static void main(String args[]) {

        Proceso1 hilo1 = new Proceso1();
        Proceso2 hilo2 = new Proceso2();

        hilo1.start();
        hilo2.start();

    }

}
