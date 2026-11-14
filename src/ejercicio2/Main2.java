package ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 2: EMPLEADOS (Clases separadas) ===");

        Empleado gerente = new Gerente("Carlos Mendoza", 3500000, 800000);
        Empleado vendedor = new Vendedor("Laura Gómez", 1500000, 500000);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}