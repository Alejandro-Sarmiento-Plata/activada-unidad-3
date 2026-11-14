package ejercicio1;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("=== TALLER 13 - EJERCICIO 1: FIGURAS (CLASE ABSTRACTA) ===");

        Figura rectangulo = new Rectangulo(6.0, 4.0);
        Figura triangulo = new Triangulo(5.0, 8.0);

        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
    }
}