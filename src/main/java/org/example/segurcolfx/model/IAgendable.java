package org.example.segurcolfx.model;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IAgendable {
    String programar (LocalDate fecha, String descripcion);
    ArrayList<AgendaItem> getAgenda();
}
