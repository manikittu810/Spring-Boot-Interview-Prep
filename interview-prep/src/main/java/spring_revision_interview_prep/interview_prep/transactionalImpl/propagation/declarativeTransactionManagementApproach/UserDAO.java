package spring_revision_interview_prep.interview_prep.transactionalImpl.propagation.declarativeTransactionManagementApproach;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class UserDAO {
    @Transactional(propagation=Propagation.REQUIRED)
    public void dbOperationWithRequiredPropagation(){
        boolean isTransactionActive = TransactionSynchronizationManager.isActualTransactionActive();
        String currentTransactionName = TransactionSynchronizationManager.getCurrentTransactionName();
        System.out.println("**************************************************************************");
        System.out.println("Propagation.REQUIRED : Is Parent Transaction is Active : " + isTransactionActive);
        System.out.println("Propagation.REQUIRED : Current Transaction Name : " + currentTransactionName);
        System.out.println("**************************************************************************");
    }
}
