package com.example.tutoria002.services;

import java.util.ArrayList;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.tutoria002.models.Student;
import com.example.tutoria002.repositories.IStudentRepository;

@Service
public class StudentServices {
    
    @Autowired
    private IStudentRepository studentRepository;

    public ArrayList<Student> getAllStudents(){
       return (ArrayList<Student>) studentRepository.findAll();
    }

    public Student save(Student student){
        return !existStudent(student.getId()) ? studentRepository.save(student) : null;
    }

    public Student update(Student student){
        return existStudent(student.getId()) ? studentRepository.save(student) : null;
    }

    private boolean existStudent(UUID id){
        return studentRepository.findById(id).isEmpty() ? false : true;
    }


}
