module org.example.ebanking {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.ebanking to javafx.fxml;
    exports org.example.ebanking;
    exports org.example.ebanking.dbconfig;
    opens org.example.ebanking.dbconfig to javafx.fxml;

    opens org.example.ebanking.model to javafx.fxml;
    exports org.example.ebanking.model;
}