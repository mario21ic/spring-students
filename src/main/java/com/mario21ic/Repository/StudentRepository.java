package com.mario21ic.Repository;

import com.mario21ic.Entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    // finders
    List<Student> findByName(String name);

}
