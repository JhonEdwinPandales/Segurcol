package org.example.segurcolfx.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.segurcolfx.App;
import org.example.segurcolfx.model.*;

public class RegistrarCustodiaController {

    @FXML private TextField txtCodigo;
    @FXML private TextField txtCliente;
    @FXML private TextField txtTarifa;
    @FXML private ComboBox<String> cbEstado;
    @FXML private TextField txtNumVigilantes;

    @FXML
    public void initialize() {
        cbEstado.getItems().addAll("ACTIVO", "SUSPENDIDO", "FINALIZADO");
    }

    @FXML
    private void registrar() {
        var s = new CustodiaFija(
                txtCodigo.getText(),
                txtCliente.getText(),
                Double.parseDouble(txtTarifa.getText()),
                EstadoServicio.valueOf(cbEstado.getValue()),
                Integer.parseInt(txtNumVigilantes.getText())
        );

        App.getSegurcol().agregarServicio(s);
    }

    @FXML
    private void volver() {
        try { App.setRoot("dashboard"); }
        catch (Exception e) { e.printStackTrace(); }
    }
}
