package com.example.tutoria002.repositories;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.tutoria002.models.Student;

@Repository
public interface IStudentRepository extends CrudRepository<Student,UUID> {
    
}
