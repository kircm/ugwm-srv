package kircm;

import kircm.model.Activity;
import kircm.service.ActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ActivitiesProcessor {

    private final ActivitiesService service;

    @Autowired
    public ActivitiesProcessor(ActivitiesService service) {
        this.service = service;
    }

    public void processActivities() {
        List<Activity> activities = service.getAllActivities();

        for (Activity activity : activities) {
            activity.getName();
        }

    }

}
