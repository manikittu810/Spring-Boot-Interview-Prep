package spring_revision_interview_prep.interview_prep.transactionalImpl.propagation.declarativeApproach;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
public class UserExample {
    @Transactional
    public void updateUser(){
        System.out.println(" use UPDATE query -> to update the values in the DB ");
    }
}