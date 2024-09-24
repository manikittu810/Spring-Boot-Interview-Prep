package spring_revision_interview_prep.interview_prep.scope.protoType;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User2 {

    public User2(){
        System.out.println("User2 bean created");
    }

    @PostConstruct
    public void init(){
        System.out.println("user2 Hashcode from User2 : " + this.hashCode());
    }
}
