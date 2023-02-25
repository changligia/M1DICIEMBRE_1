import javax.swing.text.Utilities;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var random = new Random();
        final var numeroAleatorio = Utilities.generarRandom(random, 5, 500);
        final var perimetro = calcularPerimetro(numeroAleatorio);
        final var area = calcularArea(numeroAleatorio);
        imprimirMensaje(numeroAleatorio, perimetro, area);
    }

    static double calcularPerimetro(double lado) {
        return 3 * lado;
    }

    static double calcularArea(double lado) {
        final var ladoCuadrado = Math.pow(lado, 2);
        final var raizCuadrada = Math.sqrt(3);
        return (raizCuadrada / 4) * ladoCuadrado;
    }

    static void imprimirMensaje(double lado, double perimetro, double area) {
        System.out.printf("El perímetro de un triángulo equilátero de lado %.2f es %.2f%n", lado, perimetro);
        System.out.printf("El área de un triángulo equilátero de lado %.2f es %.2f%n", lado, area);
    }
}