package ies.puerto;

/**
 * Clase que cuenta las vocales de una cadena.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public class ContadorVocales {

    /**
     * Cuenta las vocales, incluyendo los acentos y la ü,
     * tanto en mayúsculas como en minúsculas.
     *
     * @param cadena String con las vocales que se contarán
     * @return int con el numero de vocales contadas
     * @throws IllegalArgumentException si la cadena es nula
     */
    static int contarVocales(String cadena) {
        if (cadena == null) {
            throw new IllegalArgumentException("La cadena no puede ser nula");
        }

        if (cadena.isEmpty()) {
            return 0;
        }

        cadena = cadena.toLowerCase();
        String vocales = "aeiouáéíóúü";
        int totalVocales = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (vocales.contains(String.valueOf(caracter))) {
                totalVocales++;
            }
        }

        return totalVocales;
    }
}

