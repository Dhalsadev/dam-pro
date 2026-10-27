package ies.puerto;

import java.util.Scanner;

/**
 * @autor Dhalsadev
 * @version 1.0.0
 */
public class ClaveSecreta {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la palabra que desea transformar en clave:");
        String palabra = teclado.nextLine();
        String clave = generarClaveSegura(palabra);
        System.out.println("La clave es: " + clave);
    }

    /**
     * Remplaza las vocales por otros caracteres
     * @param sPalabra String
     * @return String
     */
    static String generarClaveSegura (String sPalabra) {
        String clave = "";

        if (sPalabra == null || sPalabra.isEmpty()) {
            return "";
        }

        sPalabra.replace("a|A", "4");
        sPalabra.replace("e|e", "$");
        sPalabra.replace("i|I", "1");
        sPalabra.replace("o|O", "0");
        sPalabra.replace("u|U", "c");

        return clave;
    }
}
