package com.example.demo.clase_14feb2025;

public class Curso {

    private String nombre;
    private int duracion;
    private String horario;

    public Curso(String nombre, int duracion, String horario) {

        this.nombre = nombre;
        this.duracion = duracion;
        this.horario = horario;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
