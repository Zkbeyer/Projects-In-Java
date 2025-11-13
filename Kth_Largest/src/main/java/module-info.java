module com.game.kth_largest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.game.kth_largest to javafx.fxml;
    exports com.game.kth_largest;
}