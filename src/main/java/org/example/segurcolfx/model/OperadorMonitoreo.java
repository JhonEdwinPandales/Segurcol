package org.example.segurcolfx.model;

public class OperadorMonitoreo extends Empleado {
    private int numeroZonasMonitoreadas;

    public OperadorMonitoreo(String nombre, String documento, Turno turno, double salarioBase, int numeroZonasMonitoreadas) {
        super(nombre, documento, turno, salarioBase);
        this.numeroZonasMonitoreadas = numeroZonasMonitoreadas;
    }

    public int getNumeroZonasMonitoreadas() { return numeroZonasMonitoreadas; }
    public void setNumeroZonasMonitoreadas(int numeroZonasMonitoreadas) { this.numeroZonasMonitoreadas = numeroZonasMonitoreadas; }

    @Override
    public double calcularSalarioTotal() { return 0; }
}
