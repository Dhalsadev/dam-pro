package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.DateTimeFormatter;

import static es.dampro.unidad2.tarea7.AnalizadorFecha.analizarFecha;
import static es.dampro.unidad2.tarea7.CalculadoraEdad.calcularEdad;
import static es.dampro.unidad2.tarea7.CalculadoraJornada.calcularTiempoTrabajado;
import static es.dampro.unidad2.tarea7.CalculadoraVencimientos.calcularVencimiento;
import static es.dampro.unidad2.tarea7.CalculadoraViaje.calcularLlegada;
import static es.dampro.unidad2.tarea7.ComprobadorReservas.haySolapamiento;
import static es.dampro.unidad2.tarea7.ConversorZonasHorarias.convertirZona;
import static es.dampro.unidad2.tarea7.CuentaAtrasEvento.calcularDiasRestantes;
import static es.dampro.unidad2.tarea7.ProximoCumpleanios.calcularProximoCumpleanios;
import static es.dampro.unidad2.tarea7.ValidadorFechas.validarFecha;

/**
 * Ejecuta ejemplos de los diez algoritmos de fechas.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public class Main {
    /**
     * Punto de entrada para las comprobaciones manuales.
     *
     * @param args
     */
    public static void main(String[] args) {

        String analisis = analizarFecha(LocalDate.of(2024, 2, 29));
        System.out.println("AnalizarFecha: " + analisis);

        Period edad = calcularEdad(LocalDate.of(2000, 5, 20), LocalDate.of(2026, 11, 6));
        System.out.println("CalcularEdad: " + edad);

        LocalDate vencimiento = calcularVencimiento(LocalDate.of(2026, 1, 31), 0, 1, 0);
        System.out.println("CalcularVencimiento: " + vencimiento);

        LocalDate fechaValida = validarFecha("29/02/2024");
        System.out.println("ValidarFecha: " + fechaValida);

        long diasRestantes = calcularDiasRestantes(LocalDate.of(2026, 12, 1), LocalDate.of(2026, 12, 25));
        System.out.println("CalcularDiasRestantes: " + diasRestantes);

        Duration trabajado = calcularTiempoTrabajado(LocalTime.of(8, 30), LocalTime.of(17, 0), 30);
        System.out.println("CalcularTiempoTrabajado: " + trabajado);

        LocalDateTime llegada = calcularLlegada(LocalDateTime.of(2026, 6, 15, 22, 30), 5, 45);
        System.out.println("CalcularLlegada: " + llegada);

        boolean solapan = haySolapamiento(LocalDateTime.of(2026, 6, 15, 10, 0), LocalDateTime.of(2026, 6, 15, 11, 30),
                LocalDateTime.of(2026, 6, 15, 11, 0), LocalDateTime.of(2026, 6, 15, 12, 0));
        System.out.println("HaySolapamiento: " + solapan);

        LocalDate proximo = calcularProximoCumpleanios(LocalDate.of(2000, 5, 20), LocalDate.of(2026, 11, 6));
        System.out.println("CalcularProximoCumpleanios: " + proximo);

        ZonedDateTime reunion = ZonedDateTime.of(2026, 1, 15, 12, 0, 0, 0, ZoneId.of("Atlantic/Canary"));
        ZonedDateTime reunionMadrid = convertirZona(reunion, ZoneId.of("Europe/Madrid"));
        System.out.println("ConvertirZona: " + reunionMadrid);
    }
}
