package spring_revision_interview_prep.interview_prep.transactionalImpl.propagation.programmaticApproach1ForPropagation;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class UserProgrammaticApproachPropagation {
    UserDAOForProgrammaticPropagationImpl userDAOForProgrammaticPropagation;
    public UserProgrammaticApproachPropagation(UserDAOForProgrammaticPropagationImpl userDAOForProgrammaticPropagationImpl){
        this.userDAOForProgrammaticPropagation=userDAOForProgrammaticPropagationImpl;
    }

    @Transactional
    public void updateUserUsingProgrammaticApproach1(){
        System.out.println("Is transaction Active : " + TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("Currant Transaction name  : " + TransactionSynchronizationManager.getCurrentTransactionName());
        System.out.println("Some Initial DB operations  ");
        userDAOForProgrammaticPropagation.dbOperationWithRequiredPropagationUsingProgrammaticApproach1();
        System.out.println("Some final DB operations  ");
    }

    public void updateUserUsingProgrammaticApproach1NonTransactional(){
        System.out.println("Is transaction Active : " + TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("Currant Transaction name  : " + TransactionSynchronizationManager.getCurrentTransactionName());
        System.out.println("Some Initial DB operations  ");
        userDAOForProgrammaticPropagation.dbOperationWithRequiredPropagationUsingProgrammaticApproach1();
        System.out.println("Some final DB operations  ");
    }

}
