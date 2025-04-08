package org.example;

import lombok.Getter;

import java.util.List;

public class Alumno {
    @Getter
    private String nombre;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean aproboMateria(Materia materia) {
        return materiasAprobadas.contains(materia);
    }
}
