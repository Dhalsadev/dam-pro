package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Calcula las fechas de vencimiento aplicando desplazamientos de calendario.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class CalculadoraVencimientos {
    /**
     * Suma primero los años, despues meses y por ultimo los días a una fecha.
     *
     * @param fecha LocalDate con la fecha de partida
     * @param dias int con los días que se van a sumar
     * @param meses int con los meses que se van a sumar
     * @param anios int con los años que se van a sumar
     * @return LocalDate con la fecha del vencimiento
     */
    public static LocalDate calcularVencimiento(LocalDate fecha, int dias, int meses, int anios) {
        return fecha.plusYears(anios).plusMonths(meses).plusDays(dias);
    }
}
