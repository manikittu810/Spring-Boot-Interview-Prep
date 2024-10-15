package spring_revision_interview_prep.interview_prep.transactionalImpl.declarativeApproach;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
public class DeclarativeImpl {
    @Transactional
    public void updateUser(){
        System.out.println("writeUpdate Querey to update the user query values");
    }
}
