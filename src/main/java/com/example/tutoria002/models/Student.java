package com.example.tutoria002.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Student {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Size(max = 20)
    @Column(length = 20, nullable = false)
    private String documentNumber;

    @NotBlank
    @Size(max = 20)
    @Column(length = 20, nullable = false, unique = true)
    private String studentCode;

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

    private boolean isActive;

}
