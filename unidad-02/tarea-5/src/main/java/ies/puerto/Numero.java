package ies.puerto;

import java.util.Scanner;

public class Numero {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int numero2 = teclado.nextInt();

        if (igual(numero1, numero2) == true) {
            System.out.println("Son iguales");
            return;
        }
        int mayor = mayor(numero1, numero2);
        System.out.println("El mayor es: " + mayor);
        int menor = mayor(numero1, numero2);
        System.out.println("El menor es: " + menor);
    }

    static int mayor (int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        }
        return numero2;
    }

    static int menor (int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero2;
        }
        return numero1;
    }

    static boolean igual (int numero1, int numero2) {
        if (numero1 == numero2) {
            return true;
        }
        return false;
    }
}
