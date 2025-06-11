import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/Main.fxml")));
            Scene scene = new Scene(root, Color.rgb(255, 213, 0));

            String css = Objects.requireNonNull(this.getClass().getResource("css/application.css")).toExternalForm();
            scene.getStylesheets().add(css);

            primaryStage.setTitle("StudyMate");
            primaryStage.setScene(scene);
            primaryStage.setMaximized(true);

            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
