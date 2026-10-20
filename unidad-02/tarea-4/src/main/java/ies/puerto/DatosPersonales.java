package ies.puerto;

/**
 * @autor Dhalsadev
 * @version 1.0.0
 */
public class DatosPersonales {
    static void main() {

    }

    /**
     * Funcion que transforma la edad en string a entero
     * @param sEdad
     * @return
     */
    static int convertirEdad(String sEdad) {
        if (sEdad == null) {
            return 0;
        }
        return Integer.parseInt(sEdad);
    }
}
