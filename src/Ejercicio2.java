import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var string1 = ScannerManager.leerString(scanner, "Ingrese cadena1: ");
        final var string2 = ScannerManager.leerString(scanner, "Ingrese cadena2: ");
        final var string3 = ScannerManager.leerString(scanner, "Ingrese cadena3: ");

        final var concatenacion = concatenarCadenas(string1, string2, string3);
        imprimirMensaje(concatenacion, string1, string2, string3);
        scanner.close();
    }

    static String concatenarCadenas(String cad1, String cad2, String cad3) {
        return cad1 + " " + cad2 + " " + cad3 + " fin";
    }

    static void imprimirMensaje(String concatenacion, String cad1, String cad2, String cad3) {
        System.out.printf("Querido usuario, el resultado deseado es %s. El cual es resultado de " +
                "la concatenación de %s, %s & %s%n", concatenacion, cad1, cad2, cad3);
    }
}

