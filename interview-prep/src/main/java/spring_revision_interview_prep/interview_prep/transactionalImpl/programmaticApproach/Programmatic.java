package spring_revision_interview_prep.interview_prep.transactionalImpl.programmaticApproach;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/")
public class Programmatic {
    UserDeclarative userDeclarative;

    public Programmatic(UserDeclarative userDeclarative) {
        this.userDeclarative = userDeclarative;
    }
    @GetMapping(path="/prog")
    public ResponseEntity<String> updateUser(){
        userDeclarative.updateUserProgrammatic();
        return ResponseEntity.status(HttpStatus.OK).body("Programmatic Transaction Successful");
    }
}
