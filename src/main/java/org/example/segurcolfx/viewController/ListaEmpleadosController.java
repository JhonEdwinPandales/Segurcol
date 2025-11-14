package org.example.segurcolfx.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.segurcolfx.App;
import org.example.segurcolfx.model.Empleado;

public class ListaEmpleadosController {

    @FXML private TableView<Empleado> tablaEmpleados;
    @FXML private TableColumn<Empleado, String> colNombre;
    @FXML private TableColumn<Empleado, String> colDocumento;
    @FXML private TableColumn<Empleado, String> colTurno;
    @FXML private TableColumn<Empleado, Double> colSalario;

    @FXML
    public void initialize() {
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colDocumento.setCellValueFactory(new PropertyValueFactory<>("documento"));
        colTurno.setCellValueFactory(new PropertyValueFactory<>("turno"));
        colSalario.setCellValueFactory(new PropertyValueFactory<>("salarioBase"));

        tablaEmpleados.getItems().setAll(App.getSegurcol().listarEmpleados());
    }

    @FXML
    private void volver() {
        try { App.setRoot("dashboard"); }
        catch (Exception e) { e.printStackTrace(); }
    }
}
