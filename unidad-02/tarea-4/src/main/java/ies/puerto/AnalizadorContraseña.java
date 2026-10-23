package ies.puerto;

import java.util.Scanner;

/**
 * @author dhalsadev
 * @version 1.0.0
 */
public class AnalizadorContraseña {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cadena: ");
        String sCadena = teclado.nextLine();
        String resultado = generarInforme(sCadena);
        System.out.println(resultado);
    }

    /**
     * Funcion que cuenta el numero de mayusculas en una cadena
     * @param sCadena String cadena de texto
     * @return int con el numero de mayusculas
     */
    static int contarMayusculas(String sCadena) {
        int numero = 0;

        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (Character.isUpperCase(caracter) && Character.isAlphabetic(caracter)) {
                numero++;
            }
        }
        return numero;
    }

    /**
     * Funcion que cuenta el numero de minusculas en una cadena
     * @param sCadena String cadena de texto
     * @return int con el numero de minusculas
     */
    static int contarMinusculas(String sCadena) {
        int numero = 0;
        //return sCadena.length() - contarDigitos() - contarMayusculas() -contarSimbolos();
        // se podría hacer así, pero solo en uno y harías dos for más.
        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (!Character.isUpperCase(caracter) && Character.isAlphabetic(caracter)) {
                numero++;
            }
        }
        return numero;
    }

    /**
     * Funcion que cuenta el numero de digitos en una cadena
     * @param sCadena String cadena de texto
     * @return int con el numero de digitos
     */
    static int contarDigitos(String sCadena) {
        int numero = 0;

        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (Character.isDigit(caracter)) {
                numero++;
            }
        }
        return numero;
    }

    /**
     * Funcion que cuenta el numero de simbolos en una cadena
     * @param sCadena String cadena de texto
     * @return int con el numero de simbolos
     */
    static int contarSimbolos(String sCadena) {
        int numero = 0;

        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (!Character.isLetterOrDigit(caracter)) {
                numero++;
            }
        }
        return numero;
    }

    /**
     * Funcion que comprueba si la cadena tiene la longitud minima
     * @param sCadena String cadena de texto
     * @return booleano
     */
    static boolean tieneLongitudMinima(String sCadena) {
        return sCadena.length() >= 8;
    }

    /**
     * Funcion que comprueba si la contraseña es valida
     * @param sCadena String cadena de texto
     * @return booleano
     */
    static boolean esContrasennaValida(String sCadena) {
        if (!tieneLongitudMinima(sCadena)) {
            return false;
        }
        if (contarMayusculas(sCadena) < 1) {
            return false;
        }
        if (contarMinusculas(sCadena) < 1) {
            return false;
        }
        if (contarDigitos(sCadena) < 1) {
            return false;
        }
        return true;
    }

    /**
     * Funcion que genera un informe
     * @param sCadena String cadena de texto
     * @return String con el numero de digitos y el resultado
     */
    static String generarInforme(String sCadena) {
        return "Digitos: " + contarDigitos(sCadena)
                + ", Resultado: " + esContrasennaValida(sCadena);
    }
}
