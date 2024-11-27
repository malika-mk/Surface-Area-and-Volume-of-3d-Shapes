module org.example.shapes {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.shapes to javafx.fxml;
    exports org.example.shapes;
}