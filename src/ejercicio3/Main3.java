package ejercicio3;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("=== TALLER 13 - EJERCICIO 3: VALIDACIÓN DE REGLAS ===");

        System.out.println("1. Si una clase concreta implementa 'Jugador' sin sobrescribir 'jugar()', Java lanza error de compilación.");
        System.out.println("2. Las clases abstractas no admiten el modificador 'default' en sus métodos; usan métodos concretos estándar.\n");

        PartidoFutbol partido = new PartidoFutbol();
        partido.iniciarPartido();
        partido.jugar();
    }
}