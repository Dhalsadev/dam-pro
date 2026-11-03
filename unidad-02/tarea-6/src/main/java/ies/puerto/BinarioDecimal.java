package ies.puerto;

/**
 * Clase que convierte un numero binario a decimal.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public class BinarioDecimal {

    /**
     * Convierte una cadena formada por ceros y unos a su valor decimal y
     * rechaza cualquier otro caracter y los numeros que no caben en un int.
     *
     * @param binario String con el numero binario formado por ceros y unos
     * @return int con el valor decimal del numero binario
     * @throws IllegalArgumentException si el binario es nulo, esta vacio, contiene caracteres que no son biinarioss o no cabe en un int
     */
    static int convertirBinario(String binario) {
        if (binario == null) {
            throw new IllegalArgumentException("El binario no puede ser nulo");
        }

        if (binario.isEmpty()) {
            throw new IllegalArgumentException("El binario no puede estar vacio");
        }

        int limiteAntesDeDuplicar = 1073741823;
        int decimal = 0;

        for (int i = 0; i < binario.length(); i++) {
            char caracter = binario.charAt(i);

            if (caracter != '0' && caracter != '1') {
                throw new IllegalArgumentException("El binario solo puede contener ceros y unos");
            }

            if (decimal > limiteAntesDeDuplicar) {
                throw new IllegalArgumentException("El binario no cabe en un int");
            }

            int digito = Integer.parseInt(String.valueOf(caracter));
            decimal = decimal * 2 + digito;
        }

        return decimal;
    }
}