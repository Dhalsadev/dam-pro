package ies.puerto;
import java.util.Scanner;

public class Ahorrador {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        boolean salida = false;
        float ahorroFinal = 0;
        int aportaciones = 0;

        System.out.println("====================================");
        System.out.println("       SIMULADOR DE AHORRO");
        System.out.println("====================================");
        System.out.println("Introduzca su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Hola, " + nombre + ".");
        System.out.println("Introduce una cantidad para ahorrar: ");
        float ahorroInicial = teclado.nextInt();

        while (ahorroInicial <= 0) {
            System.out.println("Porfavor introduzca una cantidad mayor a 0: ");
            ahorroInicial = teclado.nextInt();
        }
        System.out.println("Aportación registrada. Ahorro actual: " + ahorroInicial + " euros");

        do {
            String opcion = "s";
            teclado.nextLine();
            System.out.println("¿Deseas realizar otra aportación? (S/N): ");
            opcion = teclado.nextLine();
            if ("s".equalsIgnoreCase(opcion)) {
                System.out.println("Introduce una cantidad para ahorrar: ");
                float aportacion = teclado.nextInt();
                while (aportacion <= 0) {
                    System.out.println("Porfavor introduzca una cantidad mayor a 0: ");
                    aportacion = teclado.nextInt();
                }
                ahorroFinal = ahorroInicial + aportacion;
                System.out.println("Aportación registrada. Ahorro actual: " + ahorroFinal + " euros");
                aportaciones++;
            }
            if ("n".equalsIgnoreCase(opcion)) {
                salida = true;
            }
        } while (!salida);

        System.out.println("====================================");
        System.out.println("         RESUMEN DEL AHORRO");
        System.out.println("====================================");
        System.out.println("Usuario: " + nombre);
        System.out.println("Ahorro inicial: " + ahorroInicial + " euros");
        System.out.println("Aportaciones realizadas: " + aportaciones);
        System.out.println("Total aportado: " + ahorroFinal + " euros");

    }
}
