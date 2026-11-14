package ejercicio3;

public class PartidoFutbol extends DeporteBase implements Jugador {
    @Override
    public void jugar() {
        System.out.println("Los futbolistas están cumpliendo el contrato de la interfaz Jugador.");
    }
}