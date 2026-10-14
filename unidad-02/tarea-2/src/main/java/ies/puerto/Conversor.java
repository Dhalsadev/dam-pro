package ies.puerto;
import java.util.Scanner;

/**
 * @authot dhalsadev
 * @version 1.0.0
 */
public class Conversor {
    /**
     * Funcion que realiza el cambio de kilometros a metros
     * @param valor en kilometros
     * @return resultado en metros
     */
    public static double kmAMetros(double valor) {
        double resultadoMetros = valor * 1000;
        return resultadoMetros;
    }
    /**
     * Funcion que realiza el cambio de metros a centimetros
     * @param valor en metros
     * @return resultado en centimetrod
     */
    public static double metrosACentimetros(double valor) {
        double resultadoCentimetros = valor * 100;
        return resultadoCentimetros;
    }
    /**
     * Funcion que realiza el cambio de kilometros a millas
     * @param valor en kilometros
     * @return resultado en millas
     */
    public static double kmAMetros(double valor) {
        double resultadoMillas = valor * 1,60934;
        return resultadoMillas;
    }

    static void main() {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0
        int conversiones = 0;
        float resultado = 0;
        boolean salida = false
        System.out.println("====================================");
        System.out.println("         CONVERSOR DAM-PRO");
        System.out.println("====================================");
        System.out.println("Introduzca su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Bienvenida/o, " + nombre + ".");

        while (salida != false) {
            System.out.println("1. Kilómetros a metros");
            System.out.println("2. Metros a centímetros");
            System.out.println("3. Kilómetros a millas");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opción: ");
            opcion = teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce los kilómetros: ");
                    double valor = scanner.nextDouble();
                    resultado = kmAMetros(valor);
                    System.out.println("Resultado: " + resultado);
                    System.out.println("Conversión realizada correctamente.");
                case 2:
                    System.out.println("Introduce los metros: ");
                    double valor = scanner.nextDouble();
                    resultado = metrosACentimetros(valor);
                    System.out.println("Resultado: " + resultado)
                    System.out.println("Conversión realizada correctamente.");
                case 3:
                    System.out.println("Introduce los kilómetros: ");
                    double valor = scanner.nextDouble();
                    resultado = kmAMillas(valor);
                    System.out.println("Resultado: " + resultado);
                    System.out.println("Conversión realizada correctamente.");
                case 4:
                    salida = false;
                default:
                    System.out.println("Error, seleccione una opcion valida.");
                    break;
            }
            converciones
        }
        System.out.println("====================================");
        System.out.println("Usuario: " + nombre);
        System.out.println("Conversiones realizadas: " + conversiones);
        System.out.println("Gracias por utilizar DAM-PRO.");
        System.out.println("====================================");
        teclado.close();
    }
}