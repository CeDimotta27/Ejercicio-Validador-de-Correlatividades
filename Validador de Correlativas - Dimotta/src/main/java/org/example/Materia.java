package org.example;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

}
