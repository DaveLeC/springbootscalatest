package dave.lecomte.factor;

public class Timetable {
    private String timetableId;

    public Timetable(String timetableId) {
        this.timetableId = timetableId;
    }
    public String getTimetableId() {
        return timetableId;
    }

    public void setTimetableId(String timetableId) {
        this.timetableId = timetableId;
    }
}
