package spring_revision_interview_prep.interview_prep.scope.requestScope;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student2 {
    @Autowired
    User3 user3;

    public Student2(){
        System.out.println("Bean Created for Student2 for Prototype Scope....");
    }

    @PostConstruct
    public void init(){
        System.out.println("Hashcode for Student2 from Prototype scope : "  + this.hashCode() +
                "\nHasCode for User3 from Student2 of Scope Prototype : " + user3.hashCode());
    }
}
