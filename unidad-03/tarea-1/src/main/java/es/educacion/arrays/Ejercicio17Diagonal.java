package es.educacion.arrays;

/**
 * Clase que Suma diagonal principal de una matriz cuadrada, incluida la matriz 0x0.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio17Diagonal {
    private Ejercicio17Diagonal() { }

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 2}, {-1, -2, -3}};
        int resultado = sumarDiagonal(matriz);
        System.out.println("La suma de la diagonal es " + resultado);
    }

    /**
     * Suma diagonal principal de una matriz cuadrada, incluida la matriz 0x0.
     *
     * @param matriz int[][] de enteros
     * @return int con la suma de la diagonal principal de una matriz cuadrada
     */
    public static int sumarDiagonal(int[][] matriz) {

        if (matriz == null) {
            throw new IllegalArgumentException("La matriz es nula");
        }

        for (int i = 0; i < matriz.length; i++) {
            int[] fila = matriz[i];

            if (fila == null) {
                throw new IllegalArgumentException("Una fila es nula");
            }

            if (fila.length != matriz.length) {
                throw new IllegalArgumentException("La matriz no es cuadrada");
            }
        }

        int sumaDiagonal = 0;

        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }

        return sumaDiagonal;
    }
}
