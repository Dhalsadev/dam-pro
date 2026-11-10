package es.educacion.arrays;

/**
 * Clase que hace la media de unas notas
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio02Media {
    private Ejercicio02Media() { }

    public static void main(String[] args) {
        int[] notas = {8,7,3,3,10};
        double resultado = media(notas);
        System.out.println("La media es: " + resultado);
    }

    /**
     * Calcula la media de un array de notas
     *
     * @param notas int[] notas
     * @return double con el resultado
     * @exception IllegalArgumentException
     */
    public static double media(int[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException("El array es nulo o vacio");
        }

        double suma = 0;
        for (double nota:notas) {
            suma += nota;
        }
        return suma/notas.length;
    }
}
