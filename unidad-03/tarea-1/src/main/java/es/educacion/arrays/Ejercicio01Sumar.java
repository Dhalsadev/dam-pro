package es.educacion.arrays;

/**
 * Clase que suma numeros
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio01Sumar {
    private Ejercicio01Sumar() { }

    public static void main(String[] args) {
        int [] numeros = {7,8,2,3,414,280};

        int sumaElementos = sumar(numeros);
        System.out.println("La suma de elementos es: " + sumaElementos);
    }

    /**
     * Calcula la suma de un array
     *
     * @param numeros int[] de enteros
     * @return int con la suma de todos los numeros
     * @exception IllegalArgumentException
     */
    public static int sumar(int[] numeros) {

        if (numeros == null) {
            throw new IllegalArgumentException("El array es nulo o vacio");
        }

        if (numeros.length == 0) {
            return 0;
        }

        int suma = 0;
        for (int numero:numeros) {
            suma += numero;
        }
        return suma;
    }
}
