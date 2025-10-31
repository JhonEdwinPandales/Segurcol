package org.example.segurcolfx.model;

// Equipo.java
public class Equipo {
    private String codigo;
    private String tipo;
    private String estado;
    private double valorReposicion;

    public Equipo(String codigo, String tipo, String estado, double valorReposicion) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.estado = estado;
        this.valorReposicion = valorReposicion;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double getValorReposicion() { return valorReposicion; }
    public void setValorReposicion(double valorReposicion) { this.valorReposicion = valorReposicion; }
}
