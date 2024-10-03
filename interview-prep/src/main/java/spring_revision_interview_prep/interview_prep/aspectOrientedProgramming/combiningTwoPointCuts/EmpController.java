package spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.combiningTwoPointCuts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring_revision_interview_prep.interview_prep.aspectOrientedProgramming.basicExample.EmployeeUtil;

@RestController
@RequestMapping("/emp-test")
public class EmpController {

    EmployeeUtil employeeUtil;

    public EmpController(EmployeeUtil employeeUtil) {
        this.employeeUtil = employeeUtil;
    }

    @GetMapping("/test7")
    public String fetchIt(){
        return "Item fetched";
    }
}
