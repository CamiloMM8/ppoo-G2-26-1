package com.example.tutoria002.services;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tutoria002.exceptions.DuplicateTeacherDocumentException;
import com.example.tutoria002.exceptions.TeacherNotFoundException;
import com.example.tutoria002.models.Teacher;
import com.example.tutoria002.repositories.ITeacherRepository;

@Service
public class TeacherServices {

    @Autowired
    private ITeacherRepository teacherRepository;

    public ArrayList<Teacher> getAllTeachers() {
        return (ArrayList<Teacher>) teacherRepository.findAll();
    }

    public Teacher save(Teacher teacher) {
        // primero validar que no exista un profesor con el mismo documento y tipo de documento
        if (teacherRepository.existsByDocumentTypeAndDocumentNumber(
                teacher.getDocumentType(), teacher.getDocumentNumber())) {
            throw new DuplicateTeacherDocumentException(teacher.getDocumentType(), teacher.getDocumentNumber());
        }
        return teacherRepository.save(teacher);
    }

    public Teacher update(Teacher teacher) {
        if (!existsTeacher(teacher.getId())) {
            throw new TeacherNotFoundException(teacher.getId());
        }
        return teacherRepository.save(teacher);
    }

    private boolean existsTeacher(UUID id) {
        return id != null && teacherRepository.existsById(id);
    }

    public boolean delete(UUID id) {
        if (!teacherRepository.existsById(id)) {
            throw new TeacherNotFoundException(id);
        }
        teacherRepository.deleteById(id);
        return true;
    }

}
