package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase que fusiona dos arrays ya ordenados ascendentemente en un array nuevo que conserva los repetidos.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio10FusionarOrdenados {
    private Ejercicio10FusionarOrdenados() { }

    public static void main(String[] args) {
        int[] primero = {1, 3, 5};
        int[] segundo = {2, 4, 6};
        int[] resultado = fusionar(primero, segundo);
        System.out.println("El array fusionado es " + Arrays.toString(resultado));
    }

    /**
     * Fusiona dos arrays ya ordenados ascendentemente, conservando repetidos, en un array nuevo ordenado.
     *
     * @param primero int[] de enteros
     * @param segundo int[] de enteros
     * @return int[] de los dos arrays fusionados
     */
    public static int[] fusionar(int[] primero, int[] segundo) {

        if (primero == null || segundo == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        int[] resultado = new int[primero.length + segundo.length];
        int iPrimero = 0;
        int iSegundo = 0;
        int iResultado = 0;

        while (iPrimero < primero.length && iSegundo < segundo.length) {
            int valorPrimero = primero[iPrimero];
            int valorSegundo = segundo[iSegundo];

            if (valorPrimero <= valorSegundo) {
                resultado[iResultado] = valorPrimero;
                iPrimero++;
            }

            if (valorPrimero > valorSegundo) {
                resultado[iResultado] = valorSegundo;
                iSegundo++;
            }
            iResultado++;
        }

        while (iPrimero < primero.length) {
            resultado[iResultado] = primero[iPrimero];
            iResultado++;
            iPrimero++;
        }

        while (iSegundo < segundo.length) {
            resultado[iResultado] = segundo[iSegundo];
            iResultado++;
            iSegundo++;
        }

        return resultado;
    }
}