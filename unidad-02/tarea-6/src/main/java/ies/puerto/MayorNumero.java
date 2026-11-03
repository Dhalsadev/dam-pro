package ies.puerto;

/**
 * Clase que obtiene el mayor numero de una lista de enteros.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public class MayorNumero {

    /**
     * Extrae el mayor entero de una lista separada por comas y
     * admite numeros negativos y espacios alrededor de cada numero.
     *
     * @param numeros String con los enteros separados por comas
     * @return int con el mayor de los numeros de la lista
     * @throws IllegalArgumentException si la cadena es nula o esta vacia.
     */
    static int obtenerMayor(String numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("Los numeros no pueden ser nulos");
        }

        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("Los numeros no pueden estar vacios");
        }

        char finDeNumero = ',';
        numeros = numeros + finDeNumero;
        String numeroActual = "";
        int mayor = 0;
        boolean primerNumero = true;

        for (int i = 0; i < numeros.length(); i++) {
            char caracter = numeros.charAt(i);

            if (caracter != finDeNumero && caracter != ' ') {
                numeroActual = numeroActual + caracter;
            }

            if (caracter == finDeNumero) {
                int numero = Integer.parseInt(numeroActual);
                if (primerNumero || numero > mayor) {
                    mayor = numero;
                    primerNumero = false;
                }
                numeroActual = "";
            }
        }

        return mayor;
    }
}