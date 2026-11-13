package es.educacion.arrays;

/**
 * Clase cuenta la cantidad de aprobados en unas notas
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class Ejercicio04ContarAprobados {
    private Ejercicio04ContarAprobados() { }

    public static void main(String[] args) {
        int[] notas = {5,2,1,10,8};
        int aprobados = contarAprobados(notas);
        System.out.println("Numero de aprobados: " + aprobados);

        int suspensos = contarSuspensosTop(notas);
        System.out.println("Numero de aprobados: " + suspensos);
    }

    /**
     * Cuenta la cantidad de aprobados
     *
     * @param notas int[] notas
     * @return int con la cantidad de aprobados
     * @exception IllegalArgumentException
     */
    public static int contarAprobados(int[] notas) {
        if (notas == null) {
            throw new IllegalArgumentException("El array es nulo");
        }

        if (notas.length == 0) {
            return 0;
        }

        int cantidad = 0;
        for (int nota:notas) {
            if (nota >= 5) {
                cantidad++;
            }
        }
        return cantidad;
    }

    /**
     * Cuenta la cantidad de suspensos
     *
     * @param notas int[] notas
     * @return int con la cantidad de suspensos
     */
    public static  int contarSuspensosTop(int[] notas) {
        return -contarAprobados(notas) + notas.length;
    }
}
