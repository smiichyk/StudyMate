package TableViewTimetable;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableView;

public class TimetableBuilder {

    /**
     * Configures the given TableView to display a timetable structure.
     * It sets up columns for each hour of the day from 9:00 to 20:00, as well as a column for the day name.
     * Also populates the table with default empty timetable entries for each day of the week.
     *
     * @param tableView the TableView to configure for displaying timetable data
     */
    public static void configureTableView(TableView<Timetable> tableView) {

        // Create a column for the name of the day (e.g., Monday, Tuesday, etc.)
        TableColumn<Timetable, String> nameCol = new TableColumn<>(" ");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        // Create a list to hold all columns, starting with the name column
        List<TableColumn<Timetable, String>> columns = new ArrayList<>();
        columns.add(nameCol);

        // Create time slot columns for each hour from 9:00 to 20:00
        for (int hour = 9; hour <= 20; hour++) {
            // Each column header is the hour label (e.g., "9:00", "10:00", etc.)
            TableColumn<Timetable, String> col = new TableColumn<>(hour + ":00");
            // Bind each column to the corresponding property in the Timetable model
            col.setCellValueFactory(new PropertyValueFactory<>("hour" + hour));
            columns.add(col);
        }

        // Add all the columns to the TableView
        tableView.getColumns().setAll(columns);

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

