package org.example.segurcolfx.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.segurcolfx.App;
import org.example.segurcolfx.model.*;

public class RegistrarMonitoreoController {

    @FXML private TextField txtCodigo;
    @FXML private TextField txtCliente;
    @FXML private TextField txtTarifa;
    @FXML private ComboBox<String> cbEstado;
    @FXML private TextField txtDispositivos;

    @FXML
    public void initialize() {
        cbEstado.getItems().addAll("ACTIVO", "SUSPENDIDO", "FINALIZADO");
    }

    @FXML
    private void registrar() {
        var s = new MonitoreoRemoto(
                txtCodigo.getText(),
                txtCliente.getText(),
                Double.parseDouble(txtTarifa.getText()),
                EstadoServicio.valueOf(cbEstado.getValue()),
                Integer.parseInt(txtDispositivos.getText())
        );

        App.getSegurcol().agregarServicio(s);
    }

    @FXML
    private void volver() {
        try { App.setRoot("dashboard"); }
        catch (Exception e) { e.printStackTrace(); }
    }
}
