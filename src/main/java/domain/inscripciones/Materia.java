package domain.inscripciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public boolean puedeSerCursadaPor(Alumno alumno){
        return this.correlativas.stream().allMatch(m -> alumno.aprobo(m));
    }

    public void agregarCorrelativas(Materia ... materias){
        Collections.addAll(this.correlativas,materias);
    }
}
