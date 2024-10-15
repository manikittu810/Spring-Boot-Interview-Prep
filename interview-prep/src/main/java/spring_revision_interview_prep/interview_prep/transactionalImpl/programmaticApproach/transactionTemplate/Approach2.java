package spring_revision_interview_prep.interview_prep.transactionalImpl.programmaticApproach.transactionTemplate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/test-api/")
class Approach2 {
    ProgrammaticApproach2 programmaticApproachImpl;
    public Approach2(ProgrammaticApproach2 programmaticApproachImpl){
        this.programmaticApproachImpl=programmaticApproachImpl;
    }

    @GetMapping(path="/progApp2")
    public ResponseEntity<String> updateUser1(){
        programmaticApproachImpl.updateProgrammaticApproachImpl2();
        return ResponseEntity.status(HttpStatus.OK).body("Programmatic Transaction Approach 2 implementation Successful.......API working!!");
    }
}
