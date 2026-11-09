package ies.puerto;

import static ies.puerto.BinarioDecimal.convertirBinario;
import static ies.puerto.ContadorVocales.contarVocales;
import static ies.puerto.EcuacionCuadratica.calcularDiscriminante;
import static ies.puerto.Factorial.calcularFactorial;
import static ies.puerto.InvertirCadena.invertir;
import static ies.puerto.MayorNumero.obtenerMayor;
import static ies.puerto.MediaNumeros.calcularMedia;
import static ies.puerto.NumeroPrimo.esPrimo;
import static ies.puerto.Palindromo.esPalindromo;
import static ies.puerto.SumaDigitos.sumarDigitos;

public class Main {

    static void main(String[] args) {
        String texto = "Anita lava la tina";
        String cadenaInvertida = invertir(texto);
        System.out.println("InvertirCadena: " + cadenaInvertida);

        boolean palindromo = esPalindromo(texto);
        System.out.println("Palindromo: " + palindromo);

        int vocales = contarVocales(texto);
        System.out.println("ContadorVocales: " + vocales);

        int suma = sumarDigitos("12345");
        System.out.println("SumaDigitos: " + suma);

        int mayor = obtenerMayor("3, 8, 2, 9, 5");
        System.out.println("MayorNumero: " + mayor);

        int binarioConvertido = convertirBinario("1010");
        System.out.println("BinarioDecimal: " + binarioConvertido);

        int factorial = calcularFactorial("5");
        System.out.println("Factorial: " + factorial);

        boolean primo = esPrimo("7");
        System.out.println("NumeroPrimo: " + primo);

        double discriminante = calcularDiscriminante("1", "5", "6");
        System.out.println("EcuacionCuadratica: " + discriminante);

        double media = calcularMedia("2, 4, 6, 8, 10");
        System.out.println("MediaNumeros: " + media);
    }
}
