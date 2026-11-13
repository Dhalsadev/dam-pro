package es.educacion.arrays;

/**
 * Clase que busca la posicicion de un valor entre unos numeros
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio05Buscar {
    private Ejercicio05Buscar() { }

    public static void main(String[] args) {
        int[] numeros = {4, 8, 15, 8, 23};
        int valorBuscado = 8;
        int resultado = buscar(numeros, valorBuscado);
        System.out.println("La primera posición del " + valorBuscado + " es " + resultado);
    }

    /**
     * Calcula la suma de un array
     *
     * @param numeros int[] de enteros
     * @param objetivo int con el objetivo
     * @return int con la suma de todos los numeros
     * @exception IllegalArgumentException
     */
    public static int buscar(int[] numeros, int objetivo) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        if (numeros.length == 0) {
            return -1;
        }

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            if (numero == objetivo) {
                return i;
            }
        }

        return -1;
    }
}
