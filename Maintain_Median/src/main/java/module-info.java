module com.game.maintain_median {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.game.maintain_median to javafx.fxml;
    exports com.game.maintain_median;
}