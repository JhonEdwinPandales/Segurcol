package org.example.segurcolfx.model;


public class MonitoreoRemoto extends Servicio {
    private int cantidadDispositivos;

    public MonitoreoRemoto(String codigoContrato, String cliente, double tarifaMensual, Estado estado, int cantidadDispositivos) {
        super(codigoContrato, cliente, tarifaMensual, estado, TipoServicio.MONITOREO_REMOTO);
        this.cantidadDispositivos = cantidadDispositivos;
    }

    public int getCantidadDispositivos() { return cantidadDispositivos; }
    public void setCantidadDispositivos(int cantidadDispositivos) { this.cantidadDispositivos = cantidadDispositivos; }

    @Override
    public double calcularCostoMensual() { return 0; }
}
