import javax.swing.text.Utilities;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var numero1 = ScannerManager.leerDouble(scanner, "Ingrese numero1: ");
        final var numero2 = ScannerManager.leerDouble(scanner, "Ingrese numero2: ");
        final var numero3 = ScannerManager.leerDouble(scanner, "Ingrese numero3: ");

        final var peso1 = Utilities.generarRandom(new Random(), 100, 200);
        final var peso2 = Utilities.generarRandom(new Random(), 100, 200);
        final var peso3 = Utilities.generarRandom(new Random(), 100, 200);

        final var promedioPonderado =
                calcularPromedioPonderado(numero1, numero2, numero3, peso1, peso2, peso3);
        imprimirMensaje(promedioPonderado);

        scanner.close();
    }

    static double calcularPromedioPonderado(double x, double y, double z, int p1, int p2, int p3) {
        return ((x * p1) + (y * p2) + (z * p3)) / 3.0;
    }

    static void imprimirMensaje(double decimal) {
        System.out.printf("El promedio ponderado es %.3f%n", decimal);
    }
}