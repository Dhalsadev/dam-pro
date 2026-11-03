package ies.puerto;

public class SumarDigito {

    /**
     * Suma los digitos de un entero positivo indicado como texto.
     *
     * @param numero String con el entero positivo del que se sumaran los digitos
     * @return int con la suma de los digitos
     * @throws IllegalArgumentException si el numero es nulo, esta vacio o contiene algo que no sean digitos
     */
    static int sumarDigitos(String numero) {
        if (numero == null) {
            throw new IllegalArgumentException("El numero no puede ser nulo");
        }

        if (numero.isEmpty()) {
            throw new IllegalArgumentException("El numero no puede estar vacio");
        }

        int suma = 0;

        for (int i = 0; i < numero.length(); i++) {
            char caracter = numero.charAt(i);

            if (caracter < '0' || caracter > '9') {
                throw new IllegalArgumentException("El numero solo puede contener digitos");
            }

            int digito = Integer.parseInt(String.valueOf(caracter));
            suma = suma + digito;
        }

        return suma;
    }
}
