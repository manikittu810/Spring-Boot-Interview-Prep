package spring_revision_interview_prep.interview_prep.transactionalImpl.programmaticApproach.approach1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/test-api/")
class Approach1 {
    ProgrammaticApproach1 programmaticApproachImpl;
    public Approach1(ProgrammaticApproach1 programmaticApproachImpl){
        this.programmaticApproachImpl=programmaticApproachImpl;
    }

    @GetMapping(path="/progApp1")
    public ResponseEntity<String> updateUser(){
        programmaticApproachImpl.updateProgrammaticApproachImpl();
        return ResponseEntity.status(HttpStatus.OK).body("Programmatic Transaction Approach1 implementation Successful.......API working!!");
    }
}
