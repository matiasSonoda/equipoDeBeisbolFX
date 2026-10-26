module com.sonoda.equipodebeisbol {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sonoda.equipodebeisbol to javafx.fxml;
    exports com.sonoda.equipodebeisbol;
}
