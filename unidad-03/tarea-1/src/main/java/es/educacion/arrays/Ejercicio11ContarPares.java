package es.educacion.arrays;

/**
 * Clase que cuenta los elementos pares, incluyendo ceros y negativos.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio11ContarPares {
    private Ejercicio11ContarPares() { }

    public static void main(String[] args) {
        int[] numeros = {4, 8, 15, 8, 23};
        int resultado = contarPares(numeros);
        System.out.println("La cantidad de pares es: " + resultado);
    }

    /**
     * Cuenta los elementos pares, incluyendo ceros y negativos
     *
     * @param numeros int[] de enteros
     * @return int con la catidad de pares
     */
    public static int contarPares(int[] numeros) {

        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        if (numeros.length == 0) {
            return 0;
        }
        int cantidad = 0;

        for (int numero:numeros) {
            if (numero % 2 == 0) {
                cantidad++;
            }
        }

        return cantidad;
    }
}
