module au.edu.griffith.tetris {
    requires javafx.controls;
    requires javafx.fxml;


    opens au.edu.griffith.tetris._006icttetrismilestone1 to javafx.fxml;
    exports au.edu.griffith.tetris._006icttetrismilestone1;
}