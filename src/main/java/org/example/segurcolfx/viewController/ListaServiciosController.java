package org.example.segurcolfx.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.segurcolfx.App;
import org.example.segurcolfx.model.Servicio;

public class ListaServiciosController {

    @FXML private TableView<Servicio> tablaServicios;
    @FXML private TableColumn<Servicio, String> colCodigo;
    @FXML private TableColumn<Servicio, String> colCliente;
    @FXML private TableColumn<Servicio, String> colEstado;
    @FXML private TableColumn<Servicio, Double> colTarifa;

    @FXML
    public void initialize() {
        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigoContrato"));
        colCliente.setCellValueFactory(new PropertyValueFactory<>("cliente"));
        colEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
        colTarifa.setCellValueFactory(new PropertyValueFactory<>("tarifaMensual"));

        tablaServicios.getItems().setAll(App.getSegurcol().listarServicios());
    }

    @FXML
    private void volver() {
        try { App.setRoot("dashboard"); }
        catch (Exception e) { e.printStackTrace(); }
    }
}
