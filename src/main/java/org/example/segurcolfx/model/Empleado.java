package org.example.segurcolfx.model;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Empleado implements IAuditable, IAgendable {
    protected String nombre;
    protected String id;
    protected double salarioBase;
    protected Turno turno;
    protected ArrayList<Equipo> equipo;
    private RegistroNovedad registroNovedad;

    @Override
    public String registroNovedad(RegistroNovedad novedad) {
        return "";
    }

    @Override
    public ArrayList<RegistroNovedad> getNovedades() {
        return null;
    }

    @Override
    public String programar (LocalDate fecha, String descripcion){
        return "";
    }

    @Override
    public ArrayList<AgendaItem> getAgenda(){
        return null;
    }
}
