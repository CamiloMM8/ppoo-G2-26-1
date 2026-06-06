package com.example.tutoria002.models;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
// lommbook  @Builder.
public class Student {

    @Id
    private UUID id;
    private String documentNumber;
    private String studentCode;
    private String email;
    private String names;
    private String lastName;
    private boolean isActive;

    // get set
    public String getDocumentNumber(){
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber){
        this.documentNumber =documentNumber;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
       this.studentCode = studentCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
}
