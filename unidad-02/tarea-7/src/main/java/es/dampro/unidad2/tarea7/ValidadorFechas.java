package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Valida y convierte textos con formato dd/MM/uuuu a fechas.
 *
 * @author Dhalsadev
 * @version 1.0.0
 */
public final class ValidadorFechas {

    /**
     * Interpreta estrictamente un texto dd/MM/uuuu con dos dígitos de día y mes y cuatro de año.
     *
     * @param texto String con la fecha
     * @return LocalDate con la fecha del texto
     */
    public static LocalDate validarFecha(String texto) {
        if (texto == null || texto.length() != 10) {
            throw new DateTimeParseException("Formato incorrecto", String.valueOf(texto), 0);
        }

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        formato = formato.withResolverStyle(ResolverStyle.STRICT);

        return LocalDate.parse(texto, formato);
    }
}
