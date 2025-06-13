import TableViewTimetable.Timetable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Controller class responsible for initializing and managing the timetable TableView UI.
 * It maps FXML-defined columns to corresponding properties in the Timetable model and
 * populates the table with default data for each day of the week.
 */
public class TimetableController implements Initializable {

    // Reference to the TableView defined in the FXML
    @FXML private TableView<Timetable> tableView;

    // References to each column in the timetable
    @FXML private TableColumn<Timetable, String> nameCol;
    @FXML private TableColumn<Timetable, String> col9;
    @FXML private TableColumn<Timetable, String> col10;
    @FXML private TableColumn<Timetable, String> col11;
    @FXML private TableColumn<Timetable, String> col12;
    @FXML private TableColumn<Timetable, String> col13;
    @FXML private TableColumn<Timetable, String> col14;
    @FXML private TableColumn<Timetable, String> col15;
    @FXML private TableColumn<Timetable, String> col16;
    @FXML private TableColumn<Timetable, String> col17;
    @FXML private TableColumn<Timetable, String> col18;
    @FXML private TableColumn<Timetable, String> col19;
    @FXML private TableColumn<Timetable, String> col20;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // Bind each column to its corresponding property in the Timetable model
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        col9.setCellValueFactory(new PropertyValueFactory<>("hour9"));
        col10.setCellValueFactory(new PropertyValueFactory<>("hour10"));
        col11.setCellValueFactory(new PropertyValueFactory<>("hour11"));
        col12.setCellValueFactory(new PropertyValueFactory<>("hour12"));
        col13.setCellValueFactory(new PropertyValueFactory<>("hour13"));
        col14.setCellValueFactory(new PropertyValueFactory<>("hour14"));
        col15.setCellValueFactory(new PropertyValueFactory<>("hour15"));
        col16.setCellValueFactory(new PropertyValueFactory<>("hour16"));
        col17.setCellValueFactory(new PropertyValueFactory<>("hour17"));
        col18.setCellValueFactory(new PropertyValueFactory<>("hour18"));
        col19.setCellValueFactory(new PropertyValueFactory<>("hour19"));
        col20.setCellValueFactory(new PropertyValueFactory<>("hour20"));

        // Create sample data representing a week's schedule
        ObservableList<Timetable> data = FXCollections.observableArrayList(
                new Timetable("Monday", "", "", "", "", "", "", "", "", "", "", "", ""),
                new Timetable("Tuesday", "", "", "", "", "", "", "", "", "", "", "", ""),
                new Timetable("Wednesday", "", "", "", "", "", "", "", "", "", "", "", ""),
                new Timetable("Thursday", "", "", "", "", "", "", "", "", "", "", "", ""),
                new Timetable("Friday", "", "", "", "", "", "", "", "", "", "", "", ""),
                new Timetable("Saturday", "", "", "", "", "", "", "", "", "", "", "", ""),
                new Timetable("Sunday", "", "", "", "", "", "", "", "", "", "", "", "")
        );

        // Set the data items into the TableView
        tableView.setItems(data);
    }
}
