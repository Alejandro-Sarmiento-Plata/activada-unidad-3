package ejercicio2;

public class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato emprende el vuelo sobre el estanque.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato nada tranquilamente en el agua.");
    }
}