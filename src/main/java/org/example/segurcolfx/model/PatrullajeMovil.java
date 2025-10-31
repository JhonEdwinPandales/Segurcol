package org.example.segurcolfx.model;

import java.util.ArrayList;


public class PatrullajeMovil extends Servicio {
    private int cantidadRutas;
    private double kilometrosRecorridos;

    public PatrullajeMovil(String codigoContrato, String cliente, double tarifaMensual, Estado estado, int cantidadRutas, double kilometrosRecorridos) {
        super(codigoContrato, cliente, tarifaMensual, estado, TipoServicio.PATRULLAJE_MOVIL);
        this.cantidadRutas = cantidadRutas;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public int getCantidadRutas() { return cantidadRutas; }
    public void setCantidadRutas(int cantidadRutas) { this.cantidadRutas = cantidadRutas; }

    public double getKilometrosRecorridos() { return kilometrosRecorridos; }
    public void setKilometrosRecorridos(double kilometrosRecorridos) { this.kilometrosRecorridos = kilometrosRecorridos; }

    @Override
    public double calcularCostoMensual() { return 0; }
}

