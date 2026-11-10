package ies.puerto;

/**
 * Clase que calcula el factorial de un numero.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public class Factorial {

    /**
     * Calcula el factorial de un entero entre 0 y 12, ambos incluidos.
     *
     * @param numero String con el entero con el que se calculará su factorial
     * @return int con el factorial del numero
     * @throws IllegalArgumentException si el numero es nulo, esta vacio o esta fuera del rango 0-12
     */
    static int calcularFactorial(String numero) {
        if (numero == null) {
            throw new IllegalArgumentException("El numero no puede ser nulo");
        }

        if (numero.isEmpty()) {
            throw new IllegalArgumentException("El numero no puede estar vacio");
        }

        int inumero = Integer.parseInt(numero);

        if (inumero < 0 || inumero > 12) {
            throw new IllegalArgumentException("El numero debe estar entre 0 y 12");
        }

        int resultado = 1;

        for (int i = 2; i <= inumero; i++) {
            resultado *= i;
        }

        return resultado;
    }
}