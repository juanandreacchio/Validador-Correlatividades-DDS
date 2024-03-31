package domain.inscripciones;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {

    private List<Materia> materias;
    private Alumno alumno;

    public Inscripcion(List<Materia> materias, Alumno alu) {
        this.materias = materias;
        this.alumno = alu;
    }

    public boolean aprobada(){
        return this.materias.stream().allMatch(m -> m.puedeSerCursadaPor(alumno));
    }
}
