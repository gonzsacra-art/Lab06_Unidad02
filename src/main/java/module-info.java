module com.ucv.lab {

    requires javafx.controls;
    requires javafx.fxml;

    opens controller to javafx.fxml;
    opens com.empresa.vehiculos.model to javafx.base;

    exports com.empresa.vehiculos.app;

}