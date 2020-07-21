package lk.sout.secondApp.service;

import lk.sout.secondApp.entity.Student;
import lk.sout.secondApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    Student student;

    @Autowired
    StudentRepository studentRepository;

    public String save(Student student){
        Student student1 = studentRepository.save(student);
        return student1.getId();
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

}
