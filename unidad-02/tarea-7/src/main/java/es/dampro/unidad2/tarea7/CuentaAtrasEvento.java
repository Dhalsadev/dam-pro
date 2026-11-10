package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que calcula los días que faltan para un evento.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class CuentaAtrasEvento {
    /**
     * Calcula los días entre la fecha actual y el evento.
     *
     * @param hoy LocalDate con la fecha actual
     * @param evento LocalDate con la fecha del evento
     * @return long con los días que faltan
     */
    public static long calcularDiasRestantes(LocalDate hoy, LocalDate evento) {
        return ChronoUnit.DAYS.between(hoy, evento);
    }
}