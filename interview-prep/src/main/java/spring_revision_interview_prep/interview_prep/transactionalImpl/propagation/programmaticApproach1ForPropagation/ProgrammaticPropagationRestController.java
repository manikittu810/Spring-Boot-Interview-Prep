package spring_revision_interview_prep.interview_prep.transactionalImpl.propagation.programmaticApproach1ForPropagation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/program/1/")
public class ProgrammaticPropagationRestController {

    UserProgrammaticApproachPropagation userProgrammaticApproachPropagation;

    public ProgrammaticPropagationRestController(UserProgrammaticApproachPropagation userProgrammaticApproachPropagation){
        this.userProgrammaticApproachPropagation= userProgrammaticApproachPropagation;
    }

    @GetMapping("/Approach1")
    public ResponseEntity<String> updateUserUsingTransactionAnnotation(){
        userProgrammaticApproachPropagation.updateUserUsingProgrammaticApproach1();
        return ResponseEntity.status(HttpStatus.OK).body("REQUESTED Propagation using @Transactional Programmatic Approach1 is Successful");
    }

    @GetMapping("/Approach2")
    public ResponseEntity<String> updateUserWithoutUsingTransactionAnnotation(){
        userProgrammaticApproachPropagation.updateUserUsingProgrammaticApproach1NonTransactional();
        return ResponseEntity.status(HttpStatus.OK).body("REQUESTED Propagation wihtout using @Transactional Programmatic Approach1 is Successful");
    }


}
