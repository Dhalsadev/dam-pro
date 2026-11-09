package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clas que convierte fechas y horas entre zonas horarias.
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class ConversorZonasHorarias {
    /**
     * Convierte una fecha con una zona horaria a otra conservando el mismo instante.
     *
     * @param fechaOrigen ZonedDateTime con la fecha y la hora de la zona de origen
     * @param zonaDestino ZoneId con la zona horaria del destino
     * @return ZonedDateTime con la fecha y hora equivalentes en la zona de destino
     */
    public static ZonedDateTime convertirZona(ZonedDateTime fechaOrigen, ZoneId zonaDestino) {
        return fechaOrigen.withZoneSameInstant(zonaDestino);
    }
}