package com.example.tutoria002.controllers;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutoria002.models.Teacher;
import com.example.tutoria002.services.TeacherServices;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/teacher")
@Tag(name = "Docente", description = "Operaciones CRUD para la gestión de docentes")
public class TeacherController {

    @Autowired
    private TeacherServices teacherServices;

    @GetMapping
    @Operation(summary = "Obtener todos los docentes", description = "Retorna el listado completo de docentes registrados")
    public ResponseEntity<ArrayList<Teacher>> getAll() {
        return ResponseEntity.ok(teacherServices.getAllTeachers());
    }

    @PostMapping
    @Operation(summary = "Crear docente", description = "Registra un nuevo docente. No se permite duplicar tipo y número de documento")
    public ResponseEntity<Teacher> save(@Valid @RequestBody Teacher teacher) {
        return ResponseEntity.ok(teacherServices.save(teacher));
    }

    @PutMapping
    @Operation(summary = "Actualizar docente", description = "Actualiza un docente existente. Verifica previamente que exista por su ID")
    public ResponseEntity<Teacher> update(@Valid @RequestBody Teacher teacher) {
        return ResponseEntity.ok(teacherServices.update(teacher));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar docente", description = "Elimina un docente existente. Verifica previamente que exista por su ID")
    public ResponseEntity<Boolean> delete(@PathVariable UUID id) {
        return ResponseEntity.ok(teacherServices.delete(id));
    }

}
