package ejercicio2;

public class Pez implements Nadador, Respirador {
    @Override
    public void nadar() {
        System.out.println("El pez se desplaza nadando ágilmente en el agua.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez procesa el oxígeno mediante branquias.");
    }
}