package org.example.segurcolfx.model;

import java.util.ArrayList;

public class CustodiaFija extends Servicio {
    public CustodiaFija(String codigoContrato, String cliente, double tarifaMensual, Estado estado) {
        super(codigoContrato, cliente, tarifaMensual, estado, TipoServicio.CUSTODIA_FIJA);
    }

    @Override
    public double calcularCostoMensual() { return 0; }
}