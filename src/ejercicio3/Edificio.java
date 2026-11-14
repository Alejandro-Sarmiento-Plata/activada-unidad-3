package ejercicio3;

public class Edificio implements Corredor {
    @Override
    public void correr() {
        System.out.println("[Mala Práctica] Un edificio implementa la interfaz Corredor, pero las estructuras estáticas no se mueven.");
    }
}