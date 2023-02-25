import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var velocidad = ScannerManager.leerDouble(scanner, "Ingrese velocidad: ");
        final var tiempo = ScannerManager.leerInteger(scanner, "Ingrese tiempo: ");
        final var aceleracion = ScannerManager.leerDouble(scanner, "Ingrese aceleracion: ");

        final var posicion = calcularPosicion(velocidad, aceleracion, tiempo);
        imprimirMensaje(tiempo, velocidad, aceleracion, posicion);

        scanner.close();

    }

    static double calcularPosicion(double velocidadInicial, double aceleracion, int tiempo) {
        return velocidadInicial * tiempo + 0.5 * aceleracion * Math.pow(tiempo, 2);
    }

    static void imprimirMensaje(int tiempo, double velocidadInicial, double acelaracion, double posicion) {
        System.out.printf("En %ds, con una velocidad inicial\n" +
                "de %.3fm/s y aceleración de %.3fm/s2 su posición será %.3fm%n", tiempo, velocidadInicial, acelaracion, posicion);
    }
}

