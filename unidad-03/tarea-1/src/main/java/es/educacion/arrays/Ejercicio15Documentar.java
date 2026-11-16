package es.educacion.arrays;

// Ejercicio 15: documentación Javadoc. Añade Javadoc descriptivo a la clase y ambos métodos.
// Describe su finalidad y documenta cada parámetro y valor de retorno.

/**
 *
 *
 * @author DHalsadev
 * @version 1.0.0
 */
public final class Ejercicio15Documentar {
    private Ejercicio15Documentar() { }

    /**
     * Devuelve la longitud de un array si no es nulo.
     *
     * @param numeros int[] de enteros
     * @return int con la longitud del array
     */
    public static int longitud(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("Array nulo");
        }

        return numeros.length;
    }

    /**
     * Indica si el array contiene algún elemento (un array nulo no está permitido).
     *
     * @param numeros int[] de enteros
     * @return boolean
     */
    public static boolean tieneElementos(int[] numeros) {

        return longitud(numeros) > 0;
    }
}
