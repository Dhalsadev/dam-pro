package es.educacion.arrays;

/**
 * Clase que busca la posicicion de un valor entre unos numeros
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio05Buscar {
    private Ejercicio05Buscar() { }

    /**
     * Calcula la suma de un array
     *
     * @param numeros int[] de enteros
     * @param objetivo int con el objetivo
     * @return int con la suma de todos los numeros
     * @exception IllegalArgumentException
     */
    public static int buscar(int[] numeros, int objetivo) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El array es nulo o vacio");
        }

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            if (numero == objetivo) {
                return i;
            }
        }

        return -1;
    }
}
