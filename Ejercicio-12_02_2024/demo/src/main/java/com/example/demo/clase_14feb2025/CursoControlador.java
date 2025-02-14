package com.example.demo.clase_14feb2025;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/")
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

    @GetMapping(value = "cursos/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> getCursosByName(@PathVariable("name") String nombre) {
        List<Curso> aux = new ArrayList<>();
        for (Curso curso : cursos) {
            if (curso.getNombre().contains(nombre)) {
                aux.add(curso);
            }
        }
        return aux;
    }

    @PutMapping("curso/{name}")
    public boolean eliminarCurso(@PathVariable String name, @RequestBody boolean succesDelete) {

        cursos.removeIf(c -> c.getNombre().equals(name));

        return succesDelete;
    }

}
