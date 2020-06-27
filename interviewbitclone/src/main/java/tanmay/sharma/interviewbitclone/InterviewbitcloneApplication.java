package tanmay.sharma.interviewbitclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tanmay.sharma.interviewbitclone.models.User;
import tanmay.sharma.interviewbitclone.utils.Constants;

@SpringBootApplication
public class InterviewbitcloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewbitcloneApplication.class, args);
        User user = new User("tanmay", Constants.Gender.MALE);

        System.out.println(user.getName());

    }

}
