package ejercicio1;

public abstract class Figura {
    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("Área calculada: " + String.format("%.2f", calcularArea()));
    }
}