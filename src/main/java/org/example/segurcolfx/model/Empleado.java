package org.example.segurcolfx.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Empleado implements IAgendable, IAuditable {
    private String nombre;
    private String documento;
    private Turno turno;
    private double salarioBase;

    private List<AgendaItem> agenda = new ArrayList<>();
    private List<RegistroNovedad> novedades = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();

    public Empleado(String nombre, String documento, Turno turno, double salarioBase) {
        this.nombre = nombre;
        this.documento = documento;
        this.turno = turno;
        this.salarioBase = salarioBase;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDocumento() { return documento; }

    public Turno getTurno() { return turno; }
    public void setTurno(Turno turno) { this.turno = turno; }

    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }

    // CRUD Equipos
    public void agregarEquipo(Equipo e) { equipos.add(e); }
    public void eliminarEquipo(Equipo e) { equipos.remove(e); }
    public List<Equipo> listarEquipos() { return equipos; }

    // Métodos abstractos
    public abstract double calcularSalarioTotal();

    // IAgendable
    @Override
    public void programar(LocalDate fecha, String descripcion) {
        agenda.add(new AgendaItem(fecha, descripcion));
    }

    // Si tu IAgendable pidió getAgenda() como ArrayList, ajusta según corresponda
    @Override
    public ArrayList<AgendaItem> getAgenda() {
        return new ArrayList<>(agenda);
    }

    // IAuditable - implementación nueva (con rango)
    @Override
    public void registrarNovedad(RegistroNovedad novedad) {
        novedades.add(novedad);
    }

    // Firma requerida por IAuditable
    @Override
    public ArrayList<RegistroNovedad> getNovedades(LocalDateTime desde, LocalDateTime hasta) {
        return novedades.stream()
                .filter(n -> n.fechaHora().isAfter(desde) && n.fechaHora().isBefore(hasta))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // Sobrecarga (compatibilidad): devuelve todas las novedades si se necesita
    public ArrayList<RegistroNovedad> getNovedades() {
        return new ArrayList<>(novedades);
    }
}
