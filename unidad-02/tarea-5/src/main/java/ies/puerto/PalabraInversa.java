package ies.puerto;

import java.util.Scanner;

public class PalabraInversa {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la palabra o frase que desea invertir: ");
        String sPalabra = teclado.nextLine();
        String sReversa = reverse(sPalabra);
        System.out.println("La palabra o frase inversa es: " + sReversa);
    }

    /**
     * Crea una palabra o texto invertida a la original
     * @param sPalabra String con la palabra o texto original
     * @return String con la cadena invertida
     */
    static String reverse(String sPalabra) {
        StringBuilder resultado = new StringBuilder();
        if (sPalabra == null || sPalabra.isEmpty()) {
            return resultado.toString();
        }
        // palabra = almendra -> ardnemla
        for (int i = sPalabra.length()-1 ; i >= 0; i--) {
            //resultado = resultado + sPalabra.charAt(i);
            char caracter = sPalabra.charAt(i);
            resultado.append(caracter);
        }
        return resultado.toString();
    }
}
