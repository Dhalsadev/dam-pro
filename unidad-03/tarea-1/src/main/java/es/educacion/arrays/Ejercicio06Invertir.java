package es.educacion.arrays;

import java.sql.Array;
import java.util.Arrays;

/**
 * Clase que preserva el array original crea otro array y asigna cada valor en su posición simétrica.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio06Invertir {
    private Ejercicio06Invertir() { }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] resultado = invertir(numeros);
        System.out.println("El array invertido es " + Arrays.toString(resultado));
    }

    /**
     * Devuelve un array nuevo con los elementos en orden inverso. No modifica el original.
     *
     * @param numeros int[] de enteros
     * @return int[] con el array original inveritdo.
     */
    public static int[] invertir(int[] numeros) {

        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        if (numeros.length == 0) {
            return numeros;
        }

        int[] numerosInverso = new int [numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            numerosInverso[i] = numeros[numeros.length -1 -i];
        }
        return numerosInverso;
    }
}
