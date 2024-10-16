package spring_revision_interview_prep.interview_prep.transactionalImpl.propagation.programmaticApproach2;

import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.transaction.support.TransactionTemplate;

@Component
public class UserDAOProgrammaticApproach2 {
    TransactionTemplate transactionTemplate;

    public UserDAOProgrammaticApproach2(TransactionTemplate transactionTemplate){
        this.transactionTemplate = transactionTemplate;
    }

    public void dbOperationRequiredUsingPropagationUsingApproach2(){
        TransactionCallback<TransactionStatus> dbOperations = (TransactionStatus status) ->{
            System.out.println("*********************************************************");
            System.out.println("Propagation.REQUIRED : is Active : " + TransactionSynchronizationManager.isActualTransactionActive());
            System.out.println("Propagation.REQUIRED : Current Transaction Name is : " + TransactionSynchronizationManager.getCurrentTransactionName());
            System.out.println("*********************************************************");
            return status;
        };
        TransactionStatus status = transactionTemplate.execute(dbOperations);
    }
}
