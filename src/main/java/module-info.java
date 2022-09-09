module pl.com.a2ya.area1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.com.a2ya.area1 to javafx.fxml;
    exports pl.com.a2ya.area1;
}