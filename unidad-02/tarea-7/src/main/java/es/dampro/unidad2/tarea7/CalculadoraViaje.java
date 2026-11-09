package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que calcula la hora de llegada de un viaje.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class CalculadoraViaje {
    /**
     * Suma la duracion del viaje a la fecha y hora de salida.
     *
     * @param salida LocalDate fecha y hora de salida
     * @param horas long con las horas de duración, no negativas
     * @param minutos long con los minutos de duración, no negativos
     * @return LocalDate con la fecha y hora de llegada
     */
    public static LocalDateTime calcularLlegada(LocalDateTime salida, long horas, long minutos) {
        if (horas < 0 || minutos < 0) {
            throw new IllegalArgumentException("La duración no puede ser negativa");
        }
        return salida.plusHours(horas).plusMinutes(minutos);
    }
}
