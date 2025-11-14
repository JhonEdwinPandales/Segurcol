package org.example.segurcolfx.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import org.example.segurcolfx.App;
import org.example.segurcolfx.model.AgendaItem;

public class AgendaController {

    @FXML private DatePicker dpDesde;
    @FXML private DatePicker dpHasta;
    @FXML private ListView<String> listaAgenda;

    @FXML
    public void initialize() {
        // Nada todavía
    }

    @FXML
    private void buscarAgenda() {
        listaAgenda.getItems().clear();

        var seg = App.getSegurcol();

        var desde = dpDesde.getValue();
        var hasta = dpHasta.getValue();

        if (desde == null || hasta == null) return;

        seg.obtenerAgenda(desde, hasta).forEach(item ->
                listaAgenda.getItems().add(item.fecha() + " - " + item.descripcion())
        );
    }

    @FXML
    private void volver() {
        try { App.setRoot("dashboard"); }
        catch (Exception e) { e.printStackTrace(); }
    }
}
