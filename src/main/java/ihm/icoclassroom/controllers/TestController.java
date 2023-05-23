package ihm.icoclassroom.controllers;

import ihm.icoclassroom.models.Horario;
import ihm.icoclassroom.models.Materia;
import ihm.icoclassroom.models.Profesor;
import ihm.icoclassroom.models.Salon;
import java.awt.List;
import java.util.ArrayList;

public class TestController implements Data {

    private ArrayList<Materia> materias = new ArrayList<>();
    private String materia;

    public TestController(String materia) {
        this.materia = materia;
        generarDatos();
    }

    private void generarDatos() {
        Materia m;
        Salon s = new Salon();
        Profesor p = new Profesor();
        Horario h = new Horario();
        m = new Materia("12345", p, "IHM", h);
        materias.add(m);

        m = new Materia("12345", p, "IHM", h);
        materias.add(m);

        m = new Materia("12345", p, "IHM", h);
        materias.add(m);

        m = new Materia("12345", p, "ICCSO", h);
        materias.add(m);

        m = new Materia("12345", p, "ICCSO", h);
        materias.add(m);

        m = new Materia("12345", p, "ARQUITECTURA", h);
        materias.add(m);

        m = new Materia("12345", p, "ARQUITECTURA", h);
        materias.add(m);

        m = new Materia("12345", p, "ARQUITECTURA", h);
        materias.add(m);

        m = new Materia("12345", p, "ARQUITECTURA", h);
        materias.add(m);

        m = new Materia("12345", p, "ARQUITECTURA", h);
        materias.add(m);

        m = new Materia("12345", p, "ADMINRED", h);
        materias.add(m);

        m = new Materia("12345", p, "ADMINRED", h);
        materias.add(m);

        m = new Materia("12345", p, "ADMINRED", h);
        materias.add(m);

        m = new Materia("12345", p, "ADMINRED", h);
        materias.add(m);

        m = new Materia("12345", p, "ADMINRED", h);
        materias.add(m);

        m = new Materia("12345", p, "ADMINRED", h);
        materias.add(m);

        m = new Materia("12345", p, "ADMINRED", h);
        materias.add(m);

        m = new Materia("12345", p, "ADMINRED", h);
        materias.add(m);

        m = new Materia("12345", p, "ADMINRED", h);
        materias.add(m);

        m = new Materia("12345", p, "ADMINRED", h);
        materias.add(m);

    }

    @Override
    public ArrayList<Materia> buscar(String materia) {
        System.out.println("Materia : "+materia);
        ArrayList<Materia> materiasEncontradas = new ArrayList();
        for (Materia m : materias) {
            
            if (materia.equals(m.getNombre())) {
                materiasEncontradas.add(m);
            }
        }
        return materiasEncontradas;
    }
}
