package ies.puerto;

/**
 * Clase que calcula el discriminante de una ecuacion cuadratica.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public class EcuacionCuadratica {

    /**
     * Calcula el  discriminante de la ecuacion cuadratica
     * a partir de los tres coeficientes finitos que se encuentran en las cadenas.
     *
     * @param a String con el coeficiente a
     * @param b String con el coeficiente b
     * @param c String con el termino independiente
     * @return double con el valor del discriminante
     * @throws IllegalArgumentException si algun coeficiente es nulo, esta vacio, no es un numero real finito, si a es cero o si el resultado no es finito
     */
    static double calcularDiscriminante(String a, String b, String c) {
        double coeficienteA = convertirCoeficiente(a);
        double coeficienteB = convertirCoeficiente(b);
        double coeficienteC = convertirCoeficiente(c);

        if (coeficienteA == 0) {
            throw new IllegalArgumentException("El coeficiente a debe ser distinto de cero");
        }

        double discriminante = coeficienteB * coeficienteB - 4 * coeficienteA * coeficienteC;

        if (Double.isNaN(discriminante) || Double.isInfinite(discriminante)) {
            throw new IllegalArgumentException("El discriminante no es un valor finito");
        }

        return discriminante;
    }

    /**
     * Convierte un coeficiente de texto a double comprobando que sea finito.
     *
     * @param coeficiente String con el coeficiente a convertir
     * @return double con el valor del coeficiente
     * @throws IllegalArgumentException si el coeficiente es nulo, esta vacio o no es un numero real finito
     */
    static double convertirCoeficiente(String coeficiente) {
        if (coeficiente == null) {
            throw new IllegalArgumentException("El coeficiente no puede ser nulo");
        }

        if (coeficiente.isEmpty()) {
            throw new IllegalArgumentException("El coeficiente no puede estar vacio");
        }

        double valor = Double.parseDouble(coeficiente);

        if (Double.isNaN(valor) || Double.isInfinite(valor)) {
            throw new IllegalArgumentException("El coeficiente debe ser un numero real finito");
        }

        return valor;
    }
}