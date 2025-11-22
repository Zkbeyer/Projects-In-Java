module com.game.sudukosolver {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.game.sudukosolver to javafx.fxml;
    exports com.game.sudukosolver;
}