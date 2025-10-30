package org.example.segurcolfx.model;

import java.time.LocalDate;

public record RegistroNovedad(String id, LocalDate fechaHora, String tipoNovedad, String descripcion, Empleado empleado, Servicio servicio, IAuditable auditable) {
}
