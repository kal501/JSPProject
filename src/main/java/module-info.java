module com.example.jspcommunity {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jspcommunity to javafx.fxml;
    exports com.example.jspcommunity;
}