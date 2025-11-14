package org.example.segurcolfx.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import org.example.segurcolfx.App;

public class ReportesController {

    @FXML private TextArea txtReporte;

    @FXML
    public void initialize() {
        txtReporte.setText("Generar reportes aquí.\nPendiente por implementar.");
    }

    @FXML
    private void volver() {
        try { App.setRoot("dashboard"); }
        catch (Exception e) { e.printStackTrace(); }
    }
}
