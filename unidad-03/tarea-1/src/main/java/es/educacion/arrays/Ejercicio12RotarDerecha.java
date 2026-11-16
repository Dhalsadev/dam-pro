package es.educacion.arrays;

import java.util.Arrays;

/**
 * Devuelve una copia rotada a la derecha el número no negativo de posiciones.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio12RotarDerecha {
    private Ejercicio12RotarDerecha() { }

    public static void main(String[] args) {
        int[] numeros = {4, 8, 15};
        int[] resultado = rotar(numeros, 10);
        System.out.println("Array rotado " + Arrays.toString(resultado));
    }

    /**
     * Devuelve una copia rotada a la derecha el número no negativo de posiciones.
     * Vacío devuelve vacío. No modifica el original.
     *
     * @param numeros int[] de enteros
     * @param posiciones int con el numero de posiciones
     * @return int[] rotado a la derecha el numero de posiciones
     */
    public static int[] rotar(int[] numeros, int posiciones) {

        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        if (posiciones < 0) {
            throw new IllegalArgumentException("Las posicioens son negativas");
        }

        if (numeros.length == 0 || posiciones == 0) {
            return numeros;
        }

        int[] resultado = new int[numeros.length];

        for (int i = 0; i < resultado.length; i++) {
            resultado[(i + posiciones) % numeros.length] = numeros[i];
        }

        return resultado;
    }
}
