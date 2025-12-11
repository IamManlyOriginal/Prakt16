module com.example.prakt16 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prakt16 to javafx.fxml;
    exports com.example.prakt16;
}