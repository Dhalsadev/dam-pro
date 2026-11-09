package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que muestra la fecha del proximo cumpleaños de una persona.
 *
 * @author Nombre y apellidos
 * @version 1.0
 */
public final class ProximoCumpleanios {
    /**
     * Calcula el proximo cumpleaños, incluyendo la fecha actual y los bisiestos.
     *
     * @param nacimiento LocalDate con la fecha de nacimiento
     * @param hoy LocalDate con la fecha actual
     * @return LocalDate con la fecha del próximo cumpleaños
     */
    public static LocalDate calcularProximoCumpleanios(LocalDate nacimiento, LocalDate hoy) {
        if (nacimiento.isAfter(hoy)) {
            throw new IllegalArgumentException("El nacimiento no puede ser futuro");
        }

        int anios = hoy.getYear() - nacimiento.getYear();
        LocalDate cumple = nacimiento.plusYears(anios);

        if (cumple.isBefore(hoy)) {
            cumple = nacimiento.plusYears(anios + 1);
        }

        return cumple;
    }
}