package es.educacion.arrays;


import java.util.Arrays;

/**
 * Clase que elimina los valores repetidos de un array conservando la primera aparicion
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio09EliminarDuplicados {
    private Ejercicio09EliminarDuplicados() { }

    public static void main(String[] args) {

        int [] numeros = {7,8,8,8,2,3,414,280};

        int[] resultadoDuplicados = sinDuplicados(numeros);
        System.out.println("El array sin repetidos es " + Arrays.toString(resultadoDuplicados));
    }

    /**
     * Devuelve un nuevo array con una sola aparicion de cada valor, en el orden original
     *
     * @param numeros int[] de enteros que puede tener valores repetidos
     * @return int[] sin valores repetidos
     * @throws IllegalArgumentException si el array es nulo
     */
    public static int[] sinDuplicados(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        int[] unicos = new int[numeros.length];
        int cantidad = 0;

        for (int numero:numeros) {
            boolean repetido = false;

            for (int i = 0; i < cantidad && !repetido; i++) {
                if (unicos[i] == numero) {
                    repetido = true;
                }
            }

            if (!repetido) {
                unicos[cantidad] = numero;
                cantidad++;
            }
        }
        return Arrays.copyOf(unicos, cantidad);
    }
}
