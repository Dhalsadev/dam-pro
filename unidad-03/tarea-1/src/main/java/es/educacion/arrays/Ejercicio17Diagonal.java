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

        int sumaDiagonal = 0;
        int filas = matriz.length;

        for (int i = 0; i < filas; i++) {
            // int[] fila = matriz[i]; de esta forma gastas más recursos
            if (matriz[i] == null || matriz[i].length != filas) {
                throw new IllegalArgumentException();
            }
            sumaDiagonal += matriz[i][i];
        }

        return sumaDiagonal;
    }
}

// Ejemplo de como funciona un for dentro del otro con los int[][] para no liarme
// i 0 = matriz[0] = {1, 2} -> j 0 = 1, j 1 = 2
// i 1 = matriz[1] = {4, 5} -> j 0 = 4, j 1 = 5