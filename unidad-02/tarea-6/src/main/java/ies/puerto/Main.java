package ies.puerto;

import java.util.Scanner;

import static ies.puerto.BinarioDecimal.convertirBinario;
import static ies.puerto.ContadorVocales.contarVocales;
import static ies.puerto.EcuacionCuadratica.calcularDiscriminante;
import static ies.puerto.Factorial.calcularFactorial;
import static ies.puerto.InvertirCadena.invertir;
import static ies.puerto.MayorNumero.obtenerMayor;
import static ies.puerto.MediaNumeros.calcularMedia;
import static ies.puerto.NumeroPrimo.esPrimo;
import static ies.puerto.Palindromo.esPalindromo;
import static ies.puerto.SumarDigito.sumarDigitos;

public class Main {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra o frase:");
        String texto = teclado.nextLine();

        System.out.println("Introduce los digitos que quiera sumar:");
        String numeroSuma = teclado.nextLine();

        System.out.println("Introduce los digitos de los que quiera obtener el mayor:");
        String numeros = teclado.nextLine();

        System.out.println("Introduce el numero bianrio que desea convertir a decimal:");
        String binario = teclado.nextLine();

        System.out.println("Introduce el numero con el que quiere calcular el factorial");
        String numeroFactorial = teclado.nextLine();

        System.out.println("Introduce el numero que desea comprobar si es primo:");
        String numeroPrimo = teclado.nextLine();

        System.out.println("Introduce el termino cuadratico de la ecuacion cuadratica:");
        String numeroA = teclado.nextLine();

        System.out.println("Introduce el termino lineal de la ecuacion cuadratica:");
        String numeroB = teclado.nextLine();

        System.out.println("Introduce el termino independiente de la ecuacion cuadratica:");
        String numeroC = teclado.nextLine();

        System.out.println("Introduce los numeros con los que quieres calcular la media:");
        String numerosMedia = teclado.nextLine();


        String cadenaInvertida = invertir(texto);
        System.out.println("Palabra o frase invertida: " + cadenaInvertida);

        boolean palindromo = esPalindromo(texto);
        System.out.println("La palabra es un palindromo: " + palindromo);

        int vocales = contarVocales(texto);
        System.out.println("El numero de vocales es: " + vocales);

        int suma = sumarDigitos(numeroSuma);
        System.out.println("El total de la suma es: " + suma);

        int mayor = obtenerMayor(numeros);
        System.out.println("El mayor de los digitos es: " + mayor);

        int binarioConvertido = convertirBinario(binario);
        System.out.println("El numero en decimal es: " + binarioConvertido);

        int factorial = calcularFactorial(numeroFactorial);
        System.out.println("El factorial del numero es: " + factorial);

        boolean primo = esPrimo(numeroPrimo);
        System.out.println("El numero es primo: " + primo);

        double discriminante = calcularDiscriminante(numeroA, numeroB, numeroC);
        System.out.println("El resultado de calcular el discriminante es: " + discriminante);

        double media = calcularMedia(numerosMedia);
        System.out.println("La media de los numeros es: " + media);
    }
}
