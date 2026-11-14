package ejercicio3;

public abstract class DeporteBase {
    // En clases abstractas los métodos con implementación son concretos normales;
    // no se usa la palabra clave 'default' (eso es exclusivo de interfaces en Java 8+).
    public void iniciarPartido() {
        System.out.println("El partido ha comenzado (método concreto en clase abstracta).");
    }
}