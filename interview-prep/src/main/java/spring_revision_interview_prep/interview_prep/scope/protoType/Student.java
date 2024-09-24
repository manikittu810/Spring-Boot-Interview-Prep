package spring_revision_interview_prep.interview_prep.scope.protoType;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    User2 user2;

    public Student(){
        System.out.println("Student Bean Initiated");
    }

    @PostConstruct
    public void init(){
        System.out.println("HashCode of Student from student : " + this.hashCode()
                + "\nHashCode of User2 from student : " + user2.hashCode() );
    }


}
