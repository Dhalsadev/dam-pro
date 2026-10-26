package ies.puerto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @autor Dhalsadev
 * @version 1.0.0
 */
public class GestorCalificaciones {

    static void main() {
        List<Double> notas = new ArrayList<>();
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        do {
            Double nota = solicitarNotaValida();
            notas.add(nota);
            System.out.println("¿Desea añadir otra nota?: true/false");
            String sSalir = teclado.nextLine();
            salir = Boolean.parseBoolean(sSalir);
        } while (salir);

        System.out.println("Lista de notas: " + notas);
        double media = calcularMedia(notas);
        System.out.println("Media: " + media);
        double minimo = obtenerMinimo(notas);
        System.out.println("El valor minimo es: " + minimo);
        double maximo = obtenerMaximo(notas);
        System.out.println("El valor maximo es: " + maximo);
    }

    /**
     * Funcion que convierte numeros a notas
     * @param sNumero String con el numero de la nota
     * @return int con la nota
     */
    static int convertirNumeroNotas(String sNumero) {
        int numero = 0;
        if (sNumero == null || sNumero.isEmpty()) {
            return 0;
        }
        numero = Integer.parseInt(sNumero);
        return numero;
    }

    /**
     * Funcion que convierte numeros a notas
     * @param sNumero String con el numero de la nota
     * @return double con la nota
     */
    static double convertirNota(String sNumero) {
        double numero = 0;
        if (sNumero == null || sNumero.isEmpty()) {
            return 0;
        }
        numero = Integer.parseInt(sNumero);
        return numero;
    }

    /**
     * Funcion que verifica si la nota es valida
     * @param dNumero double con la nota
     * @return booleano
     */
    static boolean esNotaValida(Double dNumero) {
        if (dNumero == null) {
                return false;
        }
        if (dNumero < 0 || dNumero > 10) {
            return false;
        }
        if (Double.isInfinite(dNumero) || Double.isNaN(dNumero)) {
            return false;
        }
        return true;
    }

    /**
     * Funcion que calcula la media de las notas
     * @param dNotas double con las notas
     * @return double con la media de las notas
     */
    static double calcularMedia(List<Double> dNotas) {
        double media = 0;
        double suma = 0;
        for (int i = 0; i < dNotas.size(); i++) {
            suma = suma + dNotas.get(i);
        }
        media = suma/dNotas.size();
        return media;
    }

    /**
     * Funcion que obtiene la nota maxima
     * @param lNotas double con la lista de notas
     * @return double con la nota maxima
     */
    static double obtenerMaximo(List<Double> lNotas) {
        double maximo = 0;
        for (int i = 0; i < lNotas.size(); i++) {
            if (lNotas.get(i) > maximo) {
                maximo = lNotas.get(i);
            }
            if (maximo == 10 ) {
                return maximo;
            }
        }
        return maximo;
    }

    /**
     * Funcion que obtiene la nota minima
     * @param lNotas double con la lista de notas
     * @return double con la nota minima
     */
    static double obtenerMinimo(List<Double> lNotas) {
        double minimo = 10;
        for (int i = 0; i < lNotas.size(); i++) {
            if (lNotas.get(i) < minimo) {
                minimo = lNotas.get(i);
            }
            if (minimo == 0) {
                return minimo;
            }
        }
        return minimo;
    }

//Sale en el examen

    /**
     * Funcion que solicita la nota
     * @return double que contiene la nota
     */
    static Double solicitarNotaValida() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la nota: ");
        String sNota = teclado.nextLine();

        Double dNumero = null;
        try {
            dNumero = convertirNota(sNota);
        } catch (NumberFormatException e) {
            throw new RuntimeException("El numero insertado es incorrecto");
        }
        boolean bValida = esNotaValida(dNumero);
        return dNumero;
    }
}
