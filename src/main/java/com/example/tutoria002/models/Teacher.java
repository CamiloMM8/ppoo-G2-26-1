package com.example.tutoria002.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(
    name = "teacher",
    uniqueConstraints = {
        @UniqueConstraint(name = "uk_teacher_document", columnNames = {"documentType", "documentNumber"})
    }
)
@Getter
@Setter
@ToString
public class Teacher {

    @Id
    @GeneratedValue
    private UUID id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(length = 10, nullable = false)
    private DocumentType documentType;

    @NotBlank
    @Size(max = 20)
    @Column(length = 20, nullable = false)
    private String documentNumber;

    @NotBlank
    @Email
    @Size(max = 100)
    @Column(length = 100, nullable = false, unique = true)
    private String email;

    @NotBlank
    @Size(max = 100)
    @Column(length = 100, nullable = false)
    private String names;

    @NotBlank
    @Size(max = 100)
    @Column(length = 100, nullable = false)
    private String lastName;

    @NotBlank
    @Size(max = 100)
    @Column(length = 100, nullable = false)
    private String specialty;

    private boolean isActive;

}
