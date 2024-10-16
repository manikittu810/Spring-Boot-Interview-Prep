package spring_revision_interview_prep.interview_prep.transactionalImpl.propagation.programmaticApproach2;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class UserTransactionTemplateProgrammaticApproach2 {

    UserDAOProgrammaticApproach2 userDAOProgrammaticApproach2;
    public UserTransactionTemplateProgrammaticApproach2(UserDAOProgrammaticApproach2 userDAOProgrammaticApproach2){
        this.userDAOProgrammaticApproach2 = userDAOProgrammaticApproach2;
    }

    @Transactional
    public void updateUserForApproach2(){
        System.out.println("is Active Transaction : " + TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("Current Transaction Name : " + TransactionSynchronizationManager.getCurrentTransactionName());
        System.out.println("Some initial DB operations");
        userDAOProgrammaticApproach2.dbOperationRequiredUsingPropagationUsingApproach2();
        System.out.println("Some final DB Operations");
    }

    public void updateUserForApproach2NonTransactional(){
        System.out.println("is Active Transaction : " + TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("Current Transaction Name : " + TransactionSynchronizationManager.getCurrentTransactionName());
        System.out.println("Some initial DB operations");
        userDAOProgrammaticApproach2.dbOperationRequiredUsingPropagationUsingApproach2();
        System.out.println("Some final DB Operations");
    }

}
