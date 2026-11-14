package ejercicio3;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 3: RESTRICCIONES (Clases separadas) ===");

        System.out.println("-> Nota: Intentar instanciar 'new AnimalBase()' da error de compilación.");

        AnimalBase miPerro = new Perro();
        miPerro.hacerSonido();
        miPerro.dormir();
    }
}