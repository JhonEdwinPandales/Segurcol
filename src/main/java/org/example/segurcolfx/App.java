package org.example.segurcolfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.segurcolfx.model.Segurcol;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;

    // Instancia única de Segurcol (para toda la app)
    private static final Segurcol segurcol = new Segurcol();

    @Override
    public void start(Stage stage) throws Exception {

        scene = new Scene(loadFXML("dashboard"), 900, 600);

        stage.setTitle("SEGURCOL - Sistema de Gestión");
        stage.setScene(scene);
        stage.show();
    }

    // 🔵 Permite cambiar la vista (Root) desde cualquier controller
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    // 🔵 Carga un archivo FXML
    private static javafx.scene.Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    // 🔵 Permitir acceso global a Segurcol
    public static Segurcol getSegurcol() {
        return segurcol;
    }

    public static void main(String[] args) {
        launch();
    }
}
