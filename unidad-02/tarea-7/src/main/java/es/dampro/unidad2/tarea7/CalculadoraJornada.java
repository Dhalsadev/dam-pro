package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que calcula el tiempo rabajado en una jornada quitando el descanso.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class CalculadoraJornada {
    private CalculadoraJornada() { }

    /**
     * Calcula lo que se ha trabajado entre la entrada y la salida del mismo día y le resta los minutos de descanso.
     * La salida tiene que ser despues de la jornada y el descanso no puede ser negativo ni más largo que la jornada.
     *
     * @param entrada LocalTime con la hora de entrada
     * @param salida LocalTime con la hora de salida
     * @param descansoMinutos int con los minutos de descanso que se restan
     * @return Duration con el tiempo trabajado
     */
    public static Duration calcularTiempoTrabajado(LocalTime entrada, LocalTime salida, int descansoMinutos) {
        if (!salida.isAfter(entrada)){
            throw new IllegalArgumentException("La salida tiene que ser despues de la entrada");
        }
        Duration jornada = Duration.between(entrada,salida);
        if (descansoMinutos < 0 || descansoMinutos > jornada.toMinutes()) {
            throw new IllegalArgumentException("El descanso no es valido.");
        }

        return jornada.minusMinutes(descansoMinutos);
    }
}