package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase que devuelve un array con la suma de cada fila. Admite matriz rectangular o irregular y filas vacías.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio16SumaFilas {
    private Ejercicio16SumaFilas() { }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5}, {}, {-1, -2}};
        int[] resultado = sumarFilas(matriz);
        System.out.println("La suma de las filas es " + Arrays.toString(resultado));
    }

    /**
     * Devuelve un array con la suma de cada fila. Admite matriz rectangular o irregular y filas vacías.
     *
     * @param matriz int[][] de enteros
     * @return int[] con la suma de las filas
     */
    public static int[] sumarFilas(int[][] matriz) {

        if (matriz == null) {
            throw new IllegalArgumentException();
        }

        int[] resultado = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            int[] fila = matriz[i];

            if (fila == null) {
                throw new IllegalArgumentException();
            }
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += fila[j];
           }
            resultado[i] = sumaFila;

            /*
            for (int columna:fila) {
                sumaFila += columna;
            }
            */
        }
        return resultado;
    }
}
