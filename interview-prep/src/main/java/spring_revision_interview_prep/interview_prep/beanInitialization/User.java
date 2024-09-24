package spring_revision_interview_prep.interview_prep.beanInitialization;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    Order order;
    @PostConstruct
    public void initialize(){
        System.out.println("Using PostConstruct : Doing some action before bean is used by the application");
    }
    @PreDestroy
    public void beanDestroy(){
        System.out.println("Using @PreDestroy : Doing some work before bean getting destroyed....");
    }
    public User(){
        System.out.println("Initializing User...");
    }
}
