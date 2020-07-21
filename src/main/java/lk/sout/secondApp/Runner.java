package lk.sout.secondApp;


import lk.sout.secondApp.entity.Contact;
import lk.sout.secondApp.entity.Student;
import lk.sout.secondApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Runner {

    @Autowired
    StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }

}