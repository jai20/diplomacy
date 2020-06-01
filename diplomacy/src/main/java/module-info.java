module Diplomacy.diplomacy {
    requires javafx.controls;
    requires javafx.fxml;

    opens Diplomacy.diplomacy to javafx.fxml;
    exports Diplomacy.diplomacy;
}