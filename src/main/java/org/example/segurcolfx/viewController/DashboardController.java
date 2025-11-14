package org.example.segurcolfx.viewController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {

    @FXML private Button btnRegistrarVigilante;
    @FXML private Button btnRegistrarSupervisor;
    @FXML private Button btnRegistrarOperador;

    @FXML private Button btnRegistrarServicio;
    @FXML private Button btnRegistrarEquipo;

    @FXML private Button btnListaEmpleados;
    @FXML private Button btnListaServicios;
    @FXML private Button btnListaEquipos;

    // ------------------ MÉTODO GENERAL PARA CAMBIAR DE VENTANA ------------------ //
    private void abrirVentana(String nombreFXML, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/segurcolfx/" + nombreFXML));
            Stage stage = new Stage();
            stage.setTitle(titulo);
            stage.setScene(new Scene(loader.load(), 800, 500));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ------------------ HANDLERS DE BOTONES ------------------ //

    @FXML
    private void initialize() {
        btnRegistrarVigilante.setOnAction(e ->
                abrirVentana("registrarVigilante.fxml", "Registrar Vigilante"));

        btnRegistrarSupervisor.setOnAction(e ->
                abrirVentana("registrarSupervisor.fxml", "Registrar Supervisor"));

        btnRegistrarOperador.setOnAction(e ->
                abrirVentana("registrarOperador.fxml", "Registrar Operador de Monitoreo"));

        btnRegistrarServicio.setOnAction(e ->
                abrirVentana("registrarServicio.fxml", "Registrar Servicio"));

        btnRegistrarEquipo.setOnAction(e ->
                abrirVentana("registrarEquipo.fxml", "Registrar Equipo"));

        btnListaEmpleados.setOnAction(e ->
                abrirVentana("listaEmpleados.fxml", "Lista de Empleados"));

        btnListaServicios.setOnAction(e ->
                abrirVentana("listaServicios.fxml", "Lista de Servicios"));

        btnListaEquipos.setOnAction(e ->
                abrirVentana("listaEquipos.fxml", "Lista de Equipos"));
    }
}
