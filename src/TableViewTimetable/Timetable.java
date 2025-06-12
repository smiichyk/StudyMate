package TableViewTimetable;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Timetable {

    private final SimpleStringProperty name;
    private final SimpleStringProperty hour9;
    private final SimpleStringProperty hour10;
    private final SimpleStringProperty hour11;
    private final SimpleStringProperty hour12;
    private final SimpleStringProperty hour13;
    private final SimpleStringProperty hour14;
    private final SimpleStringProperty hour15;
    private final SimpleStringProperty hour16;
    private final SimpleStringProperty hour17;
    private final SimpleStringProperty hour18;
    private final SimpleStringProperty hour19;
    private final SimpleStringProperty hour20;

    public Timetable(String name, String hour9, String hour10, String hour11,
                     String hour12, String hour13, String hour14, String hour15,
                     String hour16, String hour17, String hour18, String hour19, String hour20) {
        this.name = new SimpleStringProperty(name);
        this.hour9 = new SimpleStringProperty(hour9);
        this.hour10 = new SimpleStringProperty(hour10);
        this.hour11 = new SimpleStringProperty(hour11);
        this.hour12 = new SimpleStringProperty(hour12);
        this.hour13 = new SimpleStringProperty(hour13);
        this.hour14 = new SimpleStringProperty(hour14);
        this.hour15 = new SimpleStringProperty(hour15);
        this.hour16 = new SimpleStringProperty(hour16);
        this.hour17 = new SimpleStringProperty(hour17);
        this.hour18 = new SimpleStringProperty(hour18);
        this.hour19 = new SimpleStringProperty(hour19);
        this.hour20 = new SimpleStringProperty(hour20);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty hour9Property() {
        return hour9;
    }

    public StringProperty hour10Property() {
        return hour10;
    }

    public StringProperty hour11Property() {
        return hour11;
    }

    public StringProperty hour12Property() {
        return hour12;
    }

    public StringProperty hour13Property() {
        return hour13;
    }

    public StringProperty hour14Property() {
        return hour14;
    }

    public StringProperty hour15Property() {
        return hour15;
    }

    public StringProperty hour16Property() {
        return hour16;
    }

    public StringProperty hour17Property() {
        return hour17;
    }

    public StringProperty hour18Property() {
        return hour18;
    }

    public StringProperty hour19Property() {
        return hour19;
    }

    public StringProperty hour20Property() {
        return hour20;
    }
}
