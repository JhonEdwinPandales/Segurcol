package org.example.segurcolfx.model;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Servicio implements IAuditable, IAgendable {
    protected String condigoContrato;
    protected String cliente;
    protected double tarifaMensual;
    protected Estado estado;
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

    public String getCondigoContrato() {
        return condigoContrato;
    }

    public void setCondigoContrato(String condigoContrato) {
        this.condigoContrato = condigoContrato;
    }
    public String getCliente() {
        return cliente;

    }
    public void setCliente(String cliente) {
        this.cliente = cliente;

    }
    public double getTarifaMensual() {
        return tarifaMensual;
    }
    public void setTarifaMensual(double tarifaMensual) {

        this.tarifaMensual = tarifaMensual;
    }

    public Estado getEstado() {



        return estado;

    }
    public void setEstado(Estado estado) {
        this.estado = estado;

    }
    public ArrayList<Equipo> getEquipo() {
        return equipo;

    }
    public void setEquipo(ArrayList<Equipo> equipo) {
        this.equipo = equipo;
    }
    public RegistroNovedad getRegistroNovedad() {
        return registroNovedad;
    }
    public void setRegistroNovedad(RegistroNovedad registroNovedad) {
        this.registroNovedad = registroNovedad;
    }

}

