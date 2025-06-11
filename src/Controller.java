import TableViewTimetable.Timetable;
import TableViewTimetable.TimetableBuilder;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableView<Timetable> tableView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TimetableBuilder.configureTableView(tableView);
    }
}
