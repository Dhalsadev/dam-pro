package es.educacion.arrays;


/**
 * Clase que Devuelve la transpuesta de una matriz rectangular, sin modificarla. Matriz 0x0 devuelve 0x0.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio18Transponer {
    private Ejercicio18Transponer() { }

    /**
     * Devuelve la transpuesta de una matriz rectangular, sin modificarla. Matriz 0x0 devuelve 0x0.
     *
     * @param matriz int[][] de enteros con la matriz rectangular
     * @return int[][] con las filas intercambiadas por las columnas
     */
    public static int[][] transponer(int[][] matriz) {

        if (matriz == null) {
            throw new IllegalArgumentException("La matriz es nula");
        }

        if (matriz.length == 0) {
            return matriz;
        }

        //int[] primeraFila = matriz[0];

        for (int i = 0; i < matriz.length; i++) {
            //int[] fila = matriz[i];

            if (matriz[i] == null) {
                throw new IllegalArgumentException("Una fila es nula");
            }

            if (matriz[i].length != matriz[0].length) {
                throw new IllegalArgumentException("La matriz es irregular");
            }
        }

        int[][] resultado = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[j][i] = matriz[i][j];
            }
        }

        return resultado;
    }
}

// Ejemplo de como funciona un for dentro del otro con los int[][] para no liarme
// i 0 = matriz[0] = {1, 2, 3} -> j 0 = 1, j 1 = 2, j 2 = 3
// i 1 = matriz[1] = {4, 5, 6} -> j 0 = 4, j 1 = 5, j 2 = 6