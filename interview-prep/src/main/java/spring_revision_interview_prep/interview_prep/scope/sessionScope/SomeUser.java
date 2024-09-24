package spring_revision_interview_prep.interview_prep.scope.sessionScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SomeUser {
    public SomeUser(){
        System.out.println("Bean Created for SomeUser class");
    }
    @PostConstruct
    public void init(){
        System.out.println("HashCode for SomeUser is : " + this.hashCode());
    }
    @PreDestroy
    public void dummy(){
        System.out.println("This is a dummy method");
    }

}
