package org.example.segurcolfx.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.segurcolfx.App;
import org.example.segurcolfx.model.RegistroNovedad;

import java.time.LocalDateTime;

public class RegistrarNovedadController {

    @FXML private TextArea txtDescripcion;

    @FXML
    private void registrar() {
        RegistroNovedad nov = new RegistroNovedad(
                LocalDateTime.now(),
                txtDescripcion.getText()
        );

        App.getSegurcol().registrarNovedad(nov);
        txtDescripcion.clear();
    }

    @FXML
    private void volver() {
        try { App.setRoot("dashboard"); }
        catch (Exception e) { e.printStackTrace(); }
    }
}
