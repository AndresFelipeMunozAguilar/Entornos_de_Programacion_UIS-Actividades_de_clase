package com.example.demo.clase_14feb2025;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;

@RestController
public class CursoControlador {

    private List<Curso> cursos;

    @PostConstruct
    public void init() {

        cursos = new ArrayList<>();

        cursos.add(new Curso("Spring", 25, "tarde"));
        cursos.add(new Curso("Spring boot", 20, "tarde"));
        cursos.add(new Curso("Python", 30, "tarde"));
        cursos.add(new Curso("Java EE", 50, "fin de semana"));
        cursos.add(new Curso("Java básico", 30, "mañana"));
    }

    @GetMapping(value = "curso", produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso getCurso() {
        return new Curso("Java", 100, "Mañana");
    }

    @GetMapping(value = "cursos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> getCursos() {
        return cursos;
    }

}
