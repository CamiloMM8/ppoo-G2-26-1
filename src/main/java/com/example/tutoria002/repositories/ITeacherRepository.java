package com.example.tutoria002.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.tutoria002.models.DocumentType;
import com.example.tutoria002.models.Teacher;

@Repository
public interface ITeacherRepository extends CrudRepository<Teacher, UUID> {

    boolean existsByDocumentTypeAndDocumentNumber(DocumentType documentType, String documentNumber);

}
