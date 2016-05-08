package kircm;

import kircm.model.Activity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ActivitiesController {

    @RequestMapping("/")
    String home() {
        return "Activities REST Service";
    }

    @RequestMapping("/defaultactivity")
    Activity defaultActivity() {
        Activity defaultActivity = new Activity(1, "Movie");
        return defaultActivity;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ActivitiesController.class, args);
    }
}
