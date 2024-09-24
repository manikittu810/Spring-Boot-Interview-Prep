package spring_revision_interview_prep.interview_prep.scope.userClass;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class User1 {
    public User1(){
        System.out.println("User Bean Created in IoC....");
    }

    @PostConstruct
    public void init(){
        System.out.println("The hashCode of User Object is : " + this.hashCode());
    }
}
