package ies.puerto;

/**
 * Clase que calcula la media de una lista de enteros.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public class MediaNumeros {



    /**
     * Calcula la media de una lista no vacia de enteros separados por comas,
     * con espacios opcionales alrededor de cada numero y no redondea el resultado.
     *
     * @param numeros String con los enteros separados por comas
     * @return double con la media de los numeros de la lista
     * @throws IllegalArgumentException si la cadena es nula, esta vacia o algun elemento no es un entero valido
     */
    static double calcularMedia(String numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("Los numeros no pueden ser nulos");
        }

        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("Los numeros no pueden estar vacios");
        }

        char finDeNumero = ',';
        numeros = numeros + finDeNumero;
        String numeroActual = "";
        double suma = 0;
        int cantidad = 0;

        for (int i = 0; i < numeros.length(); i++) {
            char caracter = numeros.charAt(i);

            if (caracter != finDeNumero && caracter != ' ') {
                numeroActual = numeroActual + caracter;

                int numero = Integer.parseInt(numeroActual);
                suma = suma + numero;
                cantidad++;
                numeroActual = "";
            }
        }

        return suma / cantidad;
    }
}