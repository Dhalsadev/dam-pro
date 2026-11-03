package ies.puerto;

/**
 * Clase que comprueba si un numero es primo.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public class NumeroPrimo {

    /**
     * Decide si el numero recibido como texto es primo.
     * Los numeros menores que 2 no son primos.
     *
     * @param numero String con el entero que se comprobara
     * @return boolean con true si el numero es primo y false si no lo es
     * @throws IllegalArgumentException si el numero es nulo, esta vacio o no es un entero valido
     */
    static boolean esPrimo(String numero) {
        if (numero == null) {
            throw new IllegalArgumentException("El numero no puede ser nulo");
        }

        if (numero.isEmpty()) {
            throw new IllegalArgumentException("El numero no puede estar vacio");
        }

        int iNumero = Integer.parseInt(numero);

        if (iNumero < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= iNumero / divisor; divisor++) {
            if (iNumero % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}