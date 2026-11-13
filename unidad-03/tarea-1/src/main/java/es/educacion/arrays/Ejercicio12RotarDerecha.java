package es.educacion.arrays;

/**
 * Devuelve una copia rotada a la derecha el número no negativo de posiciones.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio12RotarDerecha {
    private Ejercicio12RotarDerecha() { }

    /**
     * Devuelve una copia rotada a la derecha el número no negativo de posiciones.
     * Vacío devuelve vacío. No modifica el original.
     *
     * @param numeros int[] de enteros
     * @param posiciones int con el numero de posiciones
     * @return int[] rotado a la derecha l numero de posiciones
     */
    public static int[] rotar(int[] numeros, int posiciones) {

        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        if (numeros.length == 0) {
            return numeros;
        }

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
        }
    }
}
