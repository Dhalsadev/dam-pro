package es.educacion.arrays;

/**
 * Obtiene el maximo de una lista
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio03Maximo {
    private Ejercicio03Maximo() { }

    public static void main(String[] args) {

        int [] numeros = {7,8,2,3,414,280};

        int resultado = maximo(numeros);
        System.out.println("El maximo es: " + resultado);
    }

    /**
     * Busca el valor mas alto de un array de enteros
     *
     * @param numeros int[] de enteros
     * @return int con el maximo
     */
    public static int maximo(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El array es nulo o vacio");
        }

        int valorMaximo = numeros[0];
        for (int numero:numeros) {
            valorMaximo = Math.max(valorMaximo, numero);
        }
        return valorMaximo;
    }
}
