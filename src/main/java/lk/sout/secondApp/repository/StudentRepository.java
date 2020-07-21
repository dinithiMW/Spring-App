package lk.sout.secondApp.repository;

import lk.sout.secondApp.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
