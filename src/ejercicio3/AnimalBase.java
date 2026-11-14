package ejercicio3;

public abstract class AnimalBase {
    public abstract void hacerSonido();

    public void dormir() {
        System.out.println("El animal está durmiendo (método concreto).");
    }
}