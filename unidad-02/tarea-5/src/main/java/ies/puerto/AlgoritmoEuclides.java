package ies.puerto;

import java.util.Scanner;

public class AlgoritmoEuclides {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int numero2 = teclado.nextInt();
        int MCD = calcularMCD(numero1, numero2);
        System.out.println("El minimo comun divisor: " + MCD);
    }

    /**
     * Realiza el calculo del maximo comun divisor
     * @param numero1
     * @param numero2
     * @return
     */
    static int calcularMCD(int numero1, int numero2) {
        numero1 = Math.abs(numero1);
        numero2 = Math.abs(numero2);

        while (numero2 != 0) {
            int resto = numero1 % numero2;
            numero1 = numero2;
            numero2 = resto;
        }

        return numero1;
    }
}
