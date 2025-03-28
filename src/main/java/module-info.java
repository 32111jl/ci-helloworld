module com.example.cihelloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cihelloworld to javafx.fxml;
    exports com.example.cihelloworld;
}