package org.example.segurcolfx.model;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Empleado {
    private double bonoCoordinacion;
    private List<Vigilante> vigilantesSupervisados = new ArrayList<>();

    public Supervisor(String nombre, String documento, Turno turno, double salarioBase, double bonoCoordinacion) {
        super(nombre, documento, turno, salarioBase);
        this.bonoCoordinacion = bonoCoordinacion;
    }

    public double getBonoCoordinacion() { return bonoCoordinacion; }
    public void setBonoCoordinacion(double bonoCoordinacion) { this.bonoCoordinacion = bonoCoordinacion; }

    // CRUD vigilantes supervisados
    public void agregarVigilante(Vigilante v) { vigilantesSupervisados.add(v); }
    public void eliminarVigilante(Vigilante v) { vigilantesSupervisados.remove(v); }
    public List<Vigilante> listarVigilantes() { return vigilantesSupervisados; }

    @Override
    public double calcularSalarioTotal() { return 0; }
}