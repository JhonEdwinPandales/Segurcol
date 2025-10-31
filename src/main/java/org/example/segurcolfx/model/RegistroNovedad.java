package org.example.segurcolfx.model;

import java.time.LocalDateTime;

public record RegistroNovedad(LocalDateTime fechaHora, String descripcion, String autor) { }
