package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase que ordena de menor a mayor los numeros de un array sin modificar el original
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio07Ordenar {
    private Ejercicio07Ordenar() { }

    public static void main(String[] args) {

        int [] numeros = {7,8,2,3,414,280};
        int [] resultado = ordenar(numeros);
        System.out.println("El array ordenado: " + Arrays.toString(resultado));
    }

    /**
     * Devuelve una copia del array con sus elementos ordenados de menor a mayor
     *
     * @param numeros int[] de enteros
     * @return int[] nuevo y ordenado
     * @throws IllegalArgumentException si el array es nulo
     */
    public static int[] ordenar(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        int[] ordenado = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(ordenado);
        return ordenado;
    }
}
