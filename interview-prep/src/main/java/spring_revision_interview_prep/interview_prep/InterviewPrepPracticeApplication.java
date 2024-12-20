package spring_revision_interview_prep.interview_prep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class InterviewPrepPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPrepPracticeApplication.class, args);
	}

}
