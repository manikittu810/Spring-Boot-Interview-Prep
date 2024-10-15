package spring_revision_interview_prep.interview_prep.transactionalImpl.programmaticApproach;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserDeclarative {
    @Transactional(transactionManager = "transactionManager")
    public void updateUserProgrammatic(){
        //some DB Transactions
        System.out.println("Insert Query .....ran");
        System.out.println("update Query .....ran");
    }
}
