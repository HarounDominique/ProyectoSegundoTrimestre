module com.example.proyectosegundotrimestre {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectosegundotrimestre to javafx.fxml;
    exports com.example.proyectosegundotrimestre;
}