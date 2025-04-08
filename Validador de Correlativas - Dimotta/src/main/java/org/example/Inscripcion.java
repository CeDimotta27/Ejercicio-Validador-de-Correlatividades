package org.example;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribirse;

    public Inscripcion(Alumno alumno, List<Materia> materiasAInscribirse) {
        this.alumno = alumno;
        this.materiasAInscribirse = materiasAInscribirse;
    }

    public boolean aprobada() {
        for (Materia materia : materiasAInscribirse) {
            for (Materia correlativa : materia.getCorrelativas()) {
                if (!alumno.aproboMateria(correlativa)) {
                    System.out.println("Inscripción rechazada. El alumno " + alumno.getNombre() +
                            " no aprobó la correlativa " + correlativa.getNombre() +
                            " para la materia " + materia.getNombre());
                    return false;
                }
            }
        }
        System.out.println("Inscripción aprobada para el alumno " + alumno.getNombre());
        return true;
    }

}

