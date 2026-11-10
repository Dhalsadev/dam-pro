package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que comprueba conflictos entre reservas.
 *
 * @author DHalsadev
 * @version 1.0.0
 */
public final class ComprobadorReservas {
    /**
     * Indica si dos reservas se solapan.
     *
     * @param inicio1 LocalDateTime con el inicio de la primera reserva
     * @param fin1 LocalDateTime con el fin de la primera reserva
     * @param inicio2 LocalDateTime con el inicio de la segunda reserva
     * @param fin2 LocalDateTime con el fin de la segunda reserva
     * @return boolean
     */
    public static boolean haySolapamiento(LocalDateTime inicio1, LocalDateTime fin1, LocalDateTime inicio2, LocalDateTime fin2) {
        if (!fin1.isAfter(inicio1) || !fin2.isAfter(inicio2)) {
            throw new IllegalArgumentException("El fin debe ser posterior al inicio");
        }
        return inicio1.isBefore(fin2) && inicio2.isBefore(fin1);
    }
}