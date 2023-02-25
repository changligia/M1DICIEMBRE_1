import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var numVacas = ScannerManager.leerInteger(scanner, "Ingrese el numero de Vacas: ");
        final var numGallinas = ScannerManager.leerInteger(scanner, "Ingrese el numero de Gallinas: ");

        final var numeroCabezas =
                calcularNumCabezas(numVacas, numGallinas);
        final var numeroPatas = calcularNumPatas(numVacas, numGallinas);
        imprimirMensaje(numeroCabezas, numeroPatas, numVacas, numGallinas);

        scanner.close();
    }

    static int calcularNumCabezas(int numeroVacas, int numeroGallinas) {
        return numeroVacas + numeroGallinas;
    }

    static int calcularNumPatas(int numeroVacas, int numeroGallinas) {
        return (numeroVacas * 4) + (numeroGallinas * 2);
    }

    static void imprimirMensaje(int numeroCabezas, int numeroPatas, int numeroVacas, int numeroGallinas) {
        System.out.printf("En %d vacas & %d gallinas hay %d cabezas%n", numeroVacas, numeroGallinas, numeroCabezas);
        System.out.printf("En %d vacas & %d gallinas hay %d patas%n", numeroVacas, numeroGallinas, numeroPatas);
    }
}

