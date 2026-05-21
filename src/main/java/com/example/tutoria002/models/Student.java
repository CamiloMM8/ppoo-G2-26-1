package com.example.tutoria002.models;

import java.util.UUID;
import jakarta.persistence.Entity;


@Entity
// lommbook  @Builder
public class Student {

    private UUID Id;
    private String DocumentNumber;
    private String StudentCode;
    private String Email;
    private String Names;
    private String LastName;
    private boolean IsActive;

    // get set
    public String GetDocumentNumber(){
        return DocumentNumber;
    }

    public void SetDocumentNumber(String  DocumentNumber){
        this.DocumentNumber = DocumentNumber;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getStudentCode() {
        return StudentCode;
    }

    public void setStudentCode(String studentCode) {
        StudentCode = studentCode;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public boolean isIsActive() {
        return IsActive;
    }

    public void setIsActive(boolean isActive) {
        IsActive = isActive;
    }
    
}
