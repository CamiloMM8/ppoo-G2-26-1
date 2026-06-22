package com.example.tutoria002.exceptions;

import com.example.tutoria002.models.DocumentType;

public class DuplicateTeacherDocumentException extends RuntimeException {

    public DuplicateTeacherDocumentException(DocumentType documentType, String documentNumber) {
        super("Ya existe un docente registrado con tipo de documento "
                + documentType + " y número de documento " + documentNumber);
    }

}
