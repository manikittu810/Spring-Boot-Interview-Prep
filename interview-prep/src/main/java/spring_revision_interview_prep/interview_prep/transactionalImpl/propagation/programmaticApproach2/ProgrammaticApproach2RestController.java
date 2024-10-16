package spring_revision_interview_prep.interview_prep.transactionalImpl.propagation.programmaticApproach2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/program/2/")
public class ProgrammaticApproach2RestController {

    UserTransactionTemplateProgrammaticApproach2 userTransactionTemplateProgrammaticApproach2;

    public ProgrammaticApproach2RestController(UserTransactionTemplateProgrammaticApproach2 userTransactionTemplateProgrammaticApproach2){
        this.userTransactionTemplateProgrammaticApproach2 = userTransactionTemplateProgrammaticApproach2;
    }

    @GetMapping(path="/t1")
    public ResponseEntity<String> updateTransactionalWithProgrammaticApproach2(){
        userTransactionTemplateProgrammaticApproach2.updateUserForApproach2();
        return ResponseEntity.status(HttpStatus.OK).body("Programmatic Approach With Transaction Template using @Transactional annotation working successful");
    }

    @GetMapping(path="/t2")
    public ResponseEntity<String> updateWithoutTransactionalWithProgrammaticApproach2(){
        userTransactionTemplateProgrammaticApproach2.updateUserForApproach2NonTransactional();
        return ResponseEntity.status(HttpStatus.OK).body("Programmatic Approach WithOut Transaction Template using @Transactional annotation working successful");
    }

}
