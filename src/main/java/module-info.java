module org.example.segurcolfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.segurcolfx to javafx.fxml;
    exports org.example.segurcolfx;
}