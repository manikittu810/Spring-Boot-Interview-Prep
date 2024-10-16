package spring_revision_interview_prep.interview_prep.transactionalImpl.propagation.declarativeTransactionManagementApproach;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class UserDeclarativeTransaction {

    UserDAO userDAO;

    public UserDeclarativeTransaction(UserDAO userDAO){
        this.userDAO=userDAO;
    }

    @Transactional
    public void updateUser() {
        System.out.println("Is Transaction Active : " + TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("Current Transaction Name  : " + TransactionSynchronizationManager.getCurrentTransactionName());
        System.out.println("Some Initial DB operations");
        userDAO.dbOperationWithRequiredPropagation();
        System.out.println("Some final DB Operations");
    }

    public void nonTransactionalUpdateUser(){
        System.out.println("Is Transaction Active : " + TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("Current Transaction name : " +TransactionSynchronizationManager.getCurrentTransactionName());
        System.out.println("Some Initial DB Operations");
        userDAO.dbOperationWithRequiredPropagation();
        System.out.println("Some final DB Operations");
    }
}
