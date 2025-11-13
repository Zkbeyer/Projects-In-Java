module com.game.unionfind {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.game.unionfind to javafx.fxml;
    exports com.game.unionfind;
}