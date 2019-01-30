package dave.lecomte.factor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/timetable")
public class TimetableController {
    @Autowired
    private TimetableService timetableService;

    @RequestMapping(value = "/{timetableId}", method = RequestMethod.GET)
    public Timetable getTimetable(@PathVariable String timetableId) {
        return timetableService.getTimetable(timetableId);
    }
}
