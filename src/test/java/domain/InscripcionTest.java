package domain;

import domain.inscripciones.Alumno;
import domain.inscripciones.Inscripcion;
import domain.inscripciones.Materia;
import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;
import java.util.Collections;


public class InscripcionTest {

    @Test
    public void juanSePuedeInscribirAPDEP(){
        Materia discreta = new Materia("Matematica Discreta",Collections.emptyList());
        Materia ayed = new Materia("Algoritmos y Estructuras de Datos", Collections.emptyList());
        Materia pdep = new Materia("Paradigmas de Programacion", Arrays.asList(discreta,ayed));
        Alumno juan = new Alumno();
        Inscripcion inscripcionDeJuan = new Inscripcion(Collections.singletonList(pdep),juan);

        juan.aprobarMaterias(discreta,ayed);

        Assert.assertTrue(inscripcionDeJuan.aprobada());

    }

    @Test
    public void martaNoSePuedeInscribirASistemasOperativos(){
        Materia arquitecturaDeComputadoras = new Materia("Arquitectura de Computadoras", Collections.emptyList());
        Materia discreta = new Materia("Matematica Discreta",Collections.emptyList());
        Materia ayed = new Materia("Algoritmos y Estructuras de Datos", Collections.emptyList());
        Materia so = new Materia("Sistemas Operativos", Arrays.asList(discreta,ayed,arquitecturaDeComputadoras));
        Alumno marta = new Alumno();
        Inscripcion inscripcionDeMarta = new Inscripcion(Collections.singletonList(so),marta);
        
        marta.aprobarMaterias(arquitecturaDeComputadoras,ayed);

        Assert.assertFalse(inscripcionDeMarta.aprobada());
    }

    @Test
    public void pedroSePuedeInscribirALasMateriasDePrimero() {
        Materia arquitecturaDeComputadoras = new Materia("Arquitectura de Computadoras", Collections.emptyList());
        Materia discreta = new Materia("Matematica Discreta",Collections.emptyList());
        Materia ayed = new Materia("Algoritmos y Estructuras de Datos", Collections.emptyList());
        Materia am1 = new Materia("Analisis matematico I", Collections.emptyList());
        Alumno pedro = new Alumno();
        Inscripcion inscripcionDePedro = new Inscripcion(Arrays.asList(arquitecturaDeComputadoras, discreta, ayed, am1), pedro);

        Assert.assertTrue(inscripcionDePedro.aprobada());
    }

}
