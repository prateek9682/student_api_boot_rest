package com.studentbootrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentbootrest.entities.Student;
import com.studentbootrest.repositories.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepo;

    public List<Student> getAllStudents(){
        List<Student> list = null;
            try{
                list = (List<Student>)studentRepo.findAll();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return list;
    }

}
