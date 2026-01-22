import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control;
import javafx.stage.Stage;

public class fxExample1 extends Application {
    public void start(Stage primaryStage) {
        // layout manager which can hold by widgets(buttons...textfield...)
        VBox root = new VBox();
        // lets add some nodes (buttons,progress bar,comboBox)
        // package: javafx.scene.control
        Label label1 = new Label("this is my first JavaFX program");
        // adding nodes(or)widgets to layout manager
        root.getChildren().add(label1);
        // create a scene which holds the layout manager
        // package:javafx.scene
        // class:scene
        Scene scenee = new Scene(root, 500, 500);
        primaryStage.setScene(scenee);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
