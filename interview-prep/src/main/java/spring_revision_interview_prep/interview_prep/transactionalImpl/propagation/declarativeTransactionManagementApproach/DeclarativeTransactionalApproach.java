package spring_revision_interview_prep.interview_prep.transactionalImpl.propagation.declarativeTransactionManagementApproach;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/user-dec/")

public class DeclarativeTransactionalApproach {

    UserDeclarativeTransaction userDeclarativeTransaction;

    public DeclarativeTransactionalApproach(UserDeclarativeTransaction userDeclarativeTransaction){
       this.userDeclarativeTransaction= userDeclarativeTransaction;
    }

    @GetMapping("/transactional")
    public ResponseEntity<String> updateUserTransactional1(){
        userDeclarativeTransaction.updateUser();
        return ResponseEntity.status(HttpStatus.OK).body("Declarative Transactional Management using @Transactional is Successful");
    }

    @GetMapping("/non-transactional")
    public ResponseEntity<String> updateUserTransactional2(){
        userDeclarativeTransaction.nonTransactionalUpdateUser();
        return ResponseEntity.status(HttpStatus.OK).body("Declarative Transactional Management without using @Transactional is Successful");
    }
}
