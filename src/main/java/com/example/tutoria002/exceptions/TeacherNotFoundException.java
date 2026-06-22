package com.example.tutoria002.exceptions;

import java.util.UUID;

public class TeacherNotFoundException extends RuntimeException {

    public TeacherNotFoundException(UUID id) {
        super("No existe un docente con el id: " + id);
    }

}
