package org.example.segurcolfx.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.segurcolfx.App;
import org.example.segurcolfx.model.*;

public class RegistrarVigilanteController {

    @FXML private TextField txtNombre;
    @FXML private TextField txtDocumento;
    @FXML private TextField txtPuesto;
    @FXML private ComboBox<String> cbTurno;
    @FXML private ComboBox<String> cbArma;
    @FXML private TextField txtSalario;

    @FXML
    public void initialize() {
        cbTurno.getItems().addAll("DIA", "NOCHE");
        cbArma.getItems().addAll("LETAL", "NO_LETAL", "SIN_ARMA");
    }

    @FXML
    private void registrar() {
        var v = new Vigilante(
                txtNombre.getText(),
                txtDocumento.getText(),
                Turno.valueOf(cbTurno.getValue()),
                Double.parseDouble(txtSalario.getText()),
                Integer.parseInt(txtPuesto.getText()),
                TipoArma.valueOf(cbArma.getValue())
        );

        App.getSegurcol().agregarEmpleado
