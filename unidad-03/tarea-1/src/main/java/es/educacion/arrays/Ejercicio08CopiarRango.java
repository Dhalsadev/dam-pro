package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase que devuelve una copia de un intervalo con indices validos.
 *
 * @author DHalsadev
 * @version 1.0.0
 */
public final class Ejercicio08CopiarRango {
    private Ejercicio08CopiarRango() { }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int[] resultado = copiarRango(numeros, 1, 4);
        System.out.println("El rango copiado es " + Arrays.toString(resultado));
    }

    /**
     * Devuelve una copia desde inicio (incluido) hasta fin (excluido).
     * Usa índices válidos con 0 <= inicio <= fin <= length.
     *
     * @param numeros int[]
     * @param inicio int con el inicio del intervalo
     * @param fin int con el final del intervalo
     * @return int[] con el rango
     */
    public static int[] copiarRango(int[] numeros, int inicio, int fin) {

        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        if (numeros.length == 0) {
            return numeros;}

        if (inicio < 0 || inicio > fin || fin > numeros.length) {
            throw new IllegalArgumentException("Intervalo invalido");
        }

        return Arrays.copyOfRange(numeros, inicio, fin);
    }
}
