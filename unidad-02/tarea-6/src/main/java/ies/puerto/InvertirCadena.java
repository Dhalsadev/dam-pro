package ies.puerto;

/**
 * Clase que invierte el orden de los caracteres de una cadena.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public class InvertirCadena {

    /**
     * Invierte todos los caracteres de una cadena, conservando
     * los espacios y las mayúsculas.
     *
     * @param cadena String con el texto original
     * @return String con el texto invertido
     * @throws IllegalArgumentException si la cadena es nula
     */
    static String invertir(String cadena) {
        if (cadena == null) {
            throw new IllegalArgumentException("La cadena no puede ser nula");
        }

        if (cadena.isEmpty()) {
            return "";
        }

        StringBuilder resultado = new StringBuilder();

        for (int i = cadena.length()-1; i >= 0; i--) {
            resultado.append(cadena.charAt(i));
        }

        return resultado.toString();
    }
}