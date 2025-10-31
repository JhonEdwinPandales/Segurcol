package org.example.segurcolfx.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface IAuditable {
    void registrarNovedad(RegistroNovedad novedad);
    ArrayList<RegistroNovedad> getNovedades(LocalDateTime desde, LocalDateTime hasta);
}
