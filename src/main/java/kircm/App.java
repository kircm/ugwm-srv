package kircm;

import kircm.service.ActivitiesService;
import kircm.service.ActivitiesServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App {

    @Bean
    ActivitiesService activitiesService() {
        return new ActivitiesServiceImpl();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        ActivitiesProcessor processor = context.getBean(ActivitiesProcessor.class);
        processor.processActivities();
    }
}
