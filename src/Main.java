import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {

    // Logger instance to log application events and errors
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    // The main entry point of the application
    public static void main(String[] args) {
        // Launches the JavaFX application
        launch(args);
    }

    // This method is called after the application is launched
    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML layout (scene) from the "Main.fxml" and create a new Scene with the loaded layout
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/Main.fxml")));
            Scene scene = new Scene(root);

            // Load and apply the external CSS stylesheet for styling the UI components
            String css = Objects.requireNonNull(this.getClass().getResource("css/application.css")).toExternalForm();
            scene.getStylesheets().add(css);

            // Set the title of the main application window
            primaryStage.setTitle("StudyMate");

            // Set the scene for the primary stage (main window) and display it
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            // Log any unexpected exceptions during loading and setup with SEVERE level
            LOGGER.log(Level.SEVERE, "Unexpected error", e);
        }
    }
}

