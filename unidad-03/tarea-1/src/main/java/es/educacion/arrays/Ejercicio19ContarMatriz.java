package es.educacion.arrays;

/**
 * Clase que cuenta las apariciones de un valor en una matriz, incluso irregular.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio19ContarMatriz {
    private Ejercicio19ContarMatriz() { }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 3, 2}, {3, -2, -3}};
        int resultado = contar(matriz, 3);
        System.out.println("La suma de la diagonal es " + resultado);
    }

    /**
     * Cuenta las apariciones de un valor en una matriz, incluso irregular.
     *
     * @param matriz int[][] de enteros
     * @param objetivo int con el numero del que se cuentan las apariciones
     * @return int con el numero de apariciones del objetivo
     */
    public static int contar(int[][] matriz, int objetivo) {

        if (matriz == null) {
            throw new IllegalArgumentException("La matriz es nula");
        }

        int apariciones = 0;

        for (int i = 0; i < matriz.length; i++) {
            int[] fila = matriz[i];

            if (fila == null) {
                throw new IllegalArgumentException("Una fila es nula");
            }

            for (int j = 0; j < fila.length; j++) {
                int numero = fila[j];

                if (numero == objetivo) {
                    apariciones++;
                }
            }
        }

        return apariciones;
    }
}
