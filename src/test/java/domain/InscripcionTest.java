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
        Materia pdep = new Materia();
        Materia discreta = new Materia();
        Materia ayed = new Materia();
        Alumno juan = new Alumno();
        Inscripcion inscripcionDeJuan = new Inscripcion(Collections.singletonList(pdep),juan);

        pdep.agregarCorrelativas(discreta,ayed);

        juan.aprobar(discreta,ayed);

        Assert.assertTrue(inscripcionDeJuan.aprobada());

    }

    @Test
    public void martaNoSePuedeInscribirASistemasOperativos(){
        Materia so = new Materia();
        Materia arquitecturaDeComputadoras = new Materia();
        Materia discreta = new Materia();
        Materia ayed = new Materia();
        Alumno marta = new Alumno();
        Inscripcion inscripcionDeMarta = new Inscripcion(Collections.singletonList(so),marta);

        so.agregarCorrelativas(arquitecturaDeComputadoras,discreta,ayed);

        marta.aprobar(arquitecturaDeComputadoras,ayed);

        Assert.assertFalse(inscripcionDeMarta.aprobada());
    }

    @Test
    public void pedroSePuedeInscribirALasMateriasDePrimero() {
        Materia arquitecturaDeComputadoras = new Materia();
        Materia discreta = new Materia();
        Materia ayed = new Materia();
        Materia am1 = new Materia();
        Alumno pedro = new Alumno();
        Inscripcion inscripcionDePedro = new Inscripcion(Arrays.asList(arquitecturaDeComputadoras, discreta, ayed, am1), pedro);

        Assert.assertTrue(inscripcionDePedro.aprobada());
    }

}
