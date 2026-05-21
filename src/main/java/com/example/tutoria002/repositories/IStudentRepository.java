package com.example.tutoria002.repositories;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import com.example.tutoria002.models.Student;

public interface IStudentRepository extends CrudRepository<Student,UUID> {
    
}
