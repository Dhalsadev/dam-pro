package es.educacion.arrays;

import java.util.Arrays;


/**
 * Clase que extrae los valores que aparecen en dos arrays sin duplicados.
 *
 * @author DHalsadev
 * @version 1.0.0
 */
public final class Ejercicio14Interseccion {
    private Ejercicio14Interseccion() { }

    public static void main(String[] args) {
        int[] a = {4, 5, 8, 8, 8, 8, 7, 10};
        int[] b = {7, 8, 8, 9, 10, 11, 11};
        int[] resultado = interseccion(a, b);
        System.out.println("La intersección entre los dos arrays es " + Arrays.toString(resultado));
    }

    /**
     * Sigue el orden de la primera entrada, busca si cada candidato
     * figura en la segunda y evita añadirlo si ya se incorporó.
     *
     * @param a primer int[] de enteros
     * @param b segundo int[] de enteros
     * @return int[] con el resultado de la interseccion de los dos arrays
     */
    public static int[] interseccion(int[] a, int[] b) {

        if (a == null || b == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        int[] resultado = new int[a.length + b.length];
        int cantidad = 0;

        for (int i = 0; i < a.length; i++) {
            int numero = a[i];
            boolean yaIncluido = false;

            for (int j = 0; j < cantidad; j++) {
                if (resultado[j] == numero) {
                    yaIncluido = true;
                    break;
                }
            }

            if (!yaIncluido) {
                for (int j = 0; j < b.length; j++) {
                    if (b[j] == numero) {
                        resultado[cantidad] = numero;
                        cantidad++;
                        break;
                    }
                }
            }
        }

        return Arrays.copyOf(resultado, cantidad);
    }
}
