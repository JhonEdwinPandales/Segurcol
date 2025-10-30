package org.example.segurcolfx.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Segurcol implements IAuditable {
    private String nombre;
    private String nit;

    public Segurcol(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;

    }

    @Override
    public String registroNovedad(RegistroNovedad novedad) {
        return "";
    }

    @Override
    public ArrayList<RegistroNovedad> getNovedades() {
        return null;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }


}
