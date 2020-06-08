module JavaFxPackage {
    requires javafx.controls;
    opens org.example to javafx.graphics;
}
