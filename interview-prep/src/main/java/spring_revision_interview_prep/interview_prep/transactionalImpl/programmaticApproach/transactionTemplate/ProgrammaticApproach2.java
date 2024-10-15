package spring_revision_interview_prep.interview_prep.transactionalImpl.programmaticApproach.transactionTemplate;

import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Component
class ProgrammaticApproach2 {
    private final TransactionTemplate transactionTemplate;
    public ProgrammaticApproach2(TransactionTemplate transactionTemplate){
        this.transactionTemplate = transactionTemplate;
    }

    public void updateProgrammaticApproachImpl2(){
        TransactionCallback<TransactionStatus> dbOperationsTask = (TransactionStatus status)->{
            System.out.println("Update Query from Approach 2");
            System.out.println("Insert Query from Approach 2");
            return  status;
        };
        TransactionStatus status= transactionTemplate.execute(dbOperationsTask);
    }

}
