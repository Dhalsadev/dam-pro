package es.educacion.arrays;


/**
 * Clase que cuenta las apariciones exactas de un valor objetivo.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio13Frecuencia {
    private Ejercicio13Frecuencia() { }

    public static void main(String[] args) {
        int[] numeros = {4, 8, 15, 8, 8, 8, 8};
        int resultado = frecuencia(numeros, 8);
        System.out.println("La frecuencia con la que aparece el objetivo es " + resultado);
    }

    /**
     * Recorre todos los elementos y lleva un contador de coincidencias.
     *
     * @param numeros int[] de enteros
     * @param objetivo int con el objetivo
     * @return int con la frecuencia en la que aparece el objetivo
     */
    public static int frecuencia(int[] numeros, int objetivo) {

        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        if (numeros.length == 0) {
            return 0;
        }

        int resultado = 0;
        for (int numero:numeros) {
            if (objetivo == numero) {
                resultado++;
            }
        }

        return resultado;
    }
}
