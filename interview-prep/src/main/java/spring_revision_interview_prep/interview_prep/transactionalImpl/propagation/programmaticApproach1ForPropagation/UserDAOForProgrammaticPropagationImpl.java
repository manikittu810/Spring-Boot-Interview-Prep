package spring_revision_interview_prep.interview_prep.transactionalImpl.propagation.programmaticApproach1ForPropagation;

import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionSynchronizationManager;
@Component
public class UserDAOForProgrammaticPropagationImpl {

    PlatformTransactionManager transactionManager;

    public UserDAOForProgrammaticPropagationImpl(PlatformTransactionManager transactionManager){
        this.transactionManager= transactionManager;
    }

    public void dbOperationWithRequiredPropagationUsingProgrammaticApproach1(){
        DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        transactionDefinition.setName("Testing -> REQUIRED Propagation");
        transactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        TransactionStatus status = transactionManager.getTransaction(transactionDefinition);

        try{
            System.out.println("***********************************************************");
            System.out.println("Propagation.REQUIRED : Is Transaction Active : " + TransactionSynchronizationManager.isActualTransactionActive());
            System.out.println("Propagation.REQUIRED : Current Transaction Name : " + TransactionSynchronizationManager.getCurrentTransactionName());
            System.out.println("***********************************************************");
            transactionManager.commit(status);
        }catch (Exception e){
            transactionManager.rollback(status);
        }

    }
}
