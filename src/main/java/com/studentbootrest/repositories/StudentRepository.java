package com.studentbootrest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.studentbootrest.entities.Student;

@Component
public interface StudentRepository  extends CrudRepository<Student, Integer>{
    
}
