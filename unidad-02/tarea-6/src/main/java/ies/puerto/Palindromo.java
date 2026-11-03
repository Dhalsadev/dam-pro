package ies.puerto;

/**
 * Clase que comprueba si una palabra o frase es un palindromo.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public class Palindromo {

    /**
     * Comprueba si una palabra o frase es palindromo. Ignora los espacios y las mayusculas,
     * pero no los signos ni las tildes y un texto vacio no es palindromo.
     *
     * @param frase String con la palabra o frase a comprobar
     * @return boolean con true si es palindromo y false si no lo es
     * @throws IllegalArgumentException si la frase es nula
     */
    static boolean esPalindromo(String frase) {
        if (frase == null) {
            throw new IllegalArgumentException("La frase no puede ser nula");
        }

        if (frase.isEmpty()) {
            return false;
        }

        frase = frase.toLowerCase();
        frase = frase.replace(" ", "");

        if (frase.isEmpty()) {
            return false;
        }

        for (int i = 0; i < frase.length(); i++) {
            char letraIzquierda = frase.charAt(i);
            char letraDerecha = frase.charAt(frase.length() - 1 - i);
            if (letraIzquierda != letraDerecha) {
                return false;
            }
        }
        return true;
    }
}