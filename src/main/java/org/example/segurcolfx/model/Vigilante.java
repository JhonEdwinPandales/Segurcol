package org.example.segurcolfx.model;


public class Vigilante extends Empleado {
    private int numeroPuesto;
    private TipoArma tipoArma;

    public Vigilante(String nombre, String documento, Turno turno, double salarioBase, int numeroPuesto, TipoArma tipoArma) {
        super(nombre, documento, turno, salarioBase);
        this.numeroPuesto = numeroPuesto;
        this.tipoArma = tipoArma;
    }

    public int getNumeroPuesto() { return numeroPuesto; }
    public void setNumeroPuesto(int numeroPuesto) { this.numeroPuesto = numeroPuesto; }

    public TipoArma getTipoArma() { return tipoArma; }
    public void setTipoArma(TipoArma tipoArma) { this.tipoArma = tipoArma; }

    @Override
    public double calcularSalarioTotal() { return 0; }
}
