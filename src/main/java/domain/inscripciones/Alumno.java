package domain.inscripciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String Nombre;
    private String legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(){
        this.materiasAprobadas = new ArrayList<>();
    }

    public boolean aprobo(Materia materia){
        return this.materiasAprobadas.stream().anyMatch(m -> m == materia);
    }

    public void aprobar(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }
}
