package spring_revision_interview_prep.interview_prep.transactionalImpl.declarativeApproach;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api-test/")
public class UserController {
    UserExample user;

    public UserController(UserExample user){
        this.user = user;
    }

    @GetMapping(path="/update")
    public ResponseEntity<String> updateUser(){
        user.updateUser();
        return ResponseEntity.status(HttpStatus.OK).body("User updated successfully");
    }

}
