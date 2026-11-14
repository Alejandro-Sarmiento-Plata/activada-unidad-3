package ejercicio1;

public class Ave implements Volador, Cantante {
    @Override
    public void volar() {
        System.out.println("El ave vuela desplegando sus alas.");
    }

    @Override
    public void cantar() {
        System.out.println("El ave entona un hermoso cantar al amanecer.");
    }
}