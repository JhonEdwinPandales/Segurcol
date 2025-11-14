package org.example.segurcolfx.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.segurcolfx.App;
import org.example.segurcolfx.model.*;

public class RegistrarOperadorController {

    @FXML private TextField txtNombre;
    @FXML private TextField txtDocumento;
    @FXML private ComboBox<String> cbTurno;
    @FXML private TextField txtSalario;
    @FXML private TextField txtZonas;

    @FXML
    public void initialize() {
        cbTurno.getItems().addAll("DIA", "NOCHE");
    }

    @FXML
    private void registrar() {
        var op = new OperadorMonitoreo(
                txtNombre.getText(),
                txtDocumento.getText(),
                Turno.valueOf(cbTurno.getValue()),
                Double.parseDouble(txtSalario.getText()),
                Integer.parseInt(txtZonas.getText())
        );

        App.getSegurcol().agregarEmpleado(op);
    }

    @FXML
    private void volver() {
        try { App.setRoot("dashboard"); }
        catch (Exception e) { e.printStackTrace(); }
    }
}
