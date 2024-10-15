package spring_revision_interview_prep.interview_prep.transactionalImpl.programmaticApproach.approach1;

import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;

@Component
class ProgrammaticApproach1 {
    PlatformTransactionManager transactionManagerImpl;
    public ProgrammaticApproach1(PlatformTransactionManager transactionManagerImpl){
        this.transactionManagerImpl = transactionManagerImpl;
    }

    public void updateProgrammaticApproachImpl(){
        TransactionStatus status = transactionManagerImpl.getTransaction(null);
        try{
            System.out.println("Update Query .....running....ran....");
            System.out.println("Insert Query .....running....ran....");
            transactionManagerImpl.commit(status);
        }catch(Exception e){
            transactionManagerImpl.rollback(status);
        }
    }

}
