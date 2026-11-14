package ejercicio1;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1: FIGURAS (Clases separadas) ===");

        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);

        System.out.print("Círculo -> ");
        circulo.mostrarArea();

        System.out.print("Rectángulo -> ");
        rectangulo.mostrarArea();
    }
}