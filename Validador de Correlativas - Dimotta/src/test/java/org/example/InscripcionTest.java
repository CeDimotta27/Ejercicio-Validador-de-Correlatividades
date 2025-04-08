package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class InscripcionTest {
    Materia syo = new Materia("SyO", new ArrayList<>());
    Materia ayed = new Materia("AyED", new ArrayList<>());
    Materia ads = new Materia("ADS", Arrays.asList(syo, ayed)); // correlativas

    @Test
    public void inscripcionAprobada() {
        Alumno juan = new Alumno("Juana", Arrays.asList(syo, ayed));

        Inscripcion inscripcion = new Inscripcion(juan, Arrays.asList(ads));

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscripcionRechazada() {
        Alumno pedro = new Alumno("Pedra", Arrays.asList(syo)); // no tiene ayed

        Inscripcion inscripcion = new Inscripcion(pedro, Arrays.asList(ads));

        Assertions.assertFalse(inscripcion.aprobada());
    }
}