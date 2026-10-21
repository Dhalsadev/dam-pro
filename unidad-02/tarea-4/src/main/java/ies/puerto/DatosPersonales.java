package ies.puerto;

import java.util.Scanner;

/**
 * @autor Dhalsadev
 * @version 1.0.0
 */
public class DatosPersonales {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String sNombre = teclado.nextLine();
        System.out.println("Introduce la edad: ");
        String sEdad = teclado.nextLine();
        System.out.println("Introduce la altura: ");
        String sAltura = teclado.nextLine();
        System.out.println("Introduce la matricula: ");
        String sMatricula = teclado.nextLine();

        double dAltura = convertirAltura(sAltura);
        int iEdad = convertirEdad(sEdad);
        boolean bMatricula = convertirMatricula(sMatricula);
        boolean bMayorEdad = esMayorDeEdad(iEdad);
        String ficha = formatearFicha(sNombre, iEdad, dAltura, bMatricula, bMayorEdad);
        System.out.println(ficha);
    }

    /**
     * Funcion que transforma la edad en string a entero
     * @param sEdad
     * @return
     */
    static int convertirEdad(String sEdad) {
        if (sEdad == null || sEdad.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(sEdad);
    }

    /**
     * Funcion que transforma la altura en string a decimal
     * @param sAltura
     * @return
     */
    static double convertirAltura(String sAltura) {
        if (sAltura == null || sAltura.isEmpty()) {
            return 0;
        }
        return Double.valueOf(sAltura);
    }

    /**
     * Funcion que transforma la matricula en string a booleano
     * @param sMatricula
     * @return
     */
    static boolean convertirMatricula(String sMatricula) {
        if (sMatricula == null || sMatricula.isEmpty()) {
            return false;
        }
        return Boolean.parseBoolean(sMatricula);
    }

    /**
     * Funcion que comprueba si la persona es mayor de edad
     * @param iEdad Interger con la edad de la persona
     * @return boolean
     */
    static boolean esMayorDeEdad(Integer iEdad) {
        return iEdad <= 18;
    }

    /**
     * Funcion que transforma la edad en int a Integer
     * @param iEdad int con la edad de la persona
     * @return
     */
    static Integer convertirEdadAEnvolvente(int iEdad) {
        return Integer.valueOf(iEdad);
    }

    /**
     * Funcion que transforma la edad en Integer a int
     * @param iEdad
     * @return
     */
    static int convertirEdad(Integer iEdad) {
        if (iEdad == null) {
            return 0;
        }
        return iEdad.intValue();
    }

    /**
     * Funcion que formatea la ficha
     * @param sNombre String nombre de la ficha
     * @param iEdad Integer edad  de la ficha
     * @param dAltura Double altura de la ficha
     * @param bMatricula Boolean matricula  de la ficha
     * @param bMayorEdad Boolean mayor de edad  de la ficha
     * @return
     */
    static String formatearFicha(String sNombre, int iEdad, double dAltura
                ,Boolean bMatricula, boolean bMayorEdad) {
        return "Ficha: " + sNombre + ", edad: " + iEdad + ", altura: " + dAltura
                + ", matricula: " + bMatricula + ", mayor de edad: " + bMayorEdad;
    }
}