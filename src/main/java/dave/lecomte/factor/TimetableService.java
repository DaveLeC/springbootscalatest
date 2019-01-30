package dave.lecomte.factor;

import org.springframework.stereotype.Service;

@Service
public class TimetableService {
    public Timetable getTimetable(String timetableId) {
        return new Timetable(timetableId);
    }
}
