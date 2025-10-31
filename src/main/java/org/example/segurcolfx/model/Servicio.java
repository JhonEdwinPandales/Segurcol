package org.example.segurcolfx.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Servicio implements IAgendable, IAuditable {
    protected String codigoContrato;
    protected String cliente;
    protected double tarifaMensual;
    protected Estado estado;
    protected TipoServicio tipoServicio;

    private List<Empleado> empleados = new ArrayList<>();
    private List<RegistroNovedad> novedades = new ArrayList<>();
    private List<AgendaItem> agenda = new ArrayList<>();

    public Servicio(String codigoContrato, String cliente, double tarifaMensual, Estado estado, TipoServicio tipoServicio) {
        this.codigoContrato = codigoContrato;
        this.cliente = cliente;
        this.tarifaMensual = tarifaMensual;
        this.estado = estado;
        this.tipoServicio = tipoServicio;
    }

    // Getters y Setters
    public String getCodigoContrato() { return codigoContrato; }
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public double getTarifaMensual() { return tarifaMensual; }
    public void setTarifaMensual(double tarifaMensual) { this.tarifaMensual = tarifaMensual; }

    public Estado getEstado() { return estado; }
    public void setEstado(Estado estado) { this.estado = estado; }

    public TipoServicio getTipoServicio() { return tipoServicio; }

    // CRUD empleados
    public void agregarEmpleado(Empleado e) { empleados.add(e); }
    public void eliminarEmpleado(Empleado e) { empleados.remove(e); }
    public List<Empleado> listarEmpleados() { return empleados; }

    // IAgendable
    @Override
    public void programar(LocalDate fecha, String descripcion) {
        agenda.add(new AgendaItem(fecha, descripcion));
    }

    @Override
    public ArrayList<AgendaItem> getAgenda() {
        return new ArrayList<>(agenda);
    }

    // IAuditable
    @Override
    public void registrarNovedad(RegistroNovedad novedad) {
        novedades.add(novedad);
    }

    @Override
    public ArrayList<RegistroNovedad> getNovedades(LocalDateTime desde, LocalDateTime hasta) {
        return novedades.stream()
                .filter(n -> n.fechaHora().isAfter(desde) && n.fechaHora().isBefore(hasta))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<RegistroNovedad> getNovedades() {
        return new ArrayList<>(novedades);
    }

    // Método abstracto
    public abstract double calcularCostoMensual();
}
