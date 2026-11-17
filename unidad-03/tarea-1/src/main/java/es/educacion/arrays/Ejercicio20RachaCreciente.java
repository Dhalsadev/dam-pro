package es.educacion.arrays;

/**
 * Clase que devuelve longitud de la mayor secuencia contigua estrictamente creciente.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio20RachaCreciente {
    private Ejercicio20RachaCreciente() { }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 1, 2, 3, 4, 0};
        int resultado = longitudMayorRacha(numeros);
        System.out.println("La longitud de la racha es " + resultado);
    }

    /**
     * Devuelve longitud de la mayor secuencia contigua estrictamente creciente.
     *
     * @param numeros int[] de enteros
     * @return int con la longitud de la secuencia
     */
    public static int longitudMayorRacha(int[] numeros) {

        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        if (numeros.length == 0) {
            return 0;
        }

        int mejorRacha = 0;
        int rachaActual = 0;

        for (int i = 0; i < numeros.length - 1; i++) {
            int numeroActual = numeros[i];
            int siguienteNumero = numeros[i + 1];

            if (siguienteNumero > numeroActual) {
                rachaActual++;
            }

            if (siguienteNumero <= numeroActual) {
                rachaActual = 0;
            }

            mejorRacha = Math.max(mejorRacha, rachaActual);
        }

        return mejorRacha + 1;
    }
}
