package ihm.icoclassroom.models;

import java.util.Objects;

public class Materia {
    private String clave;
    private Profesor profesor;
    private String nombre;
    private Horario horario;

    public Materia() {
    }

    public Materia(String clave, Profesor profesor, String nombre, Horario horario) {
        this.clave = clave;
        this.profesor = profesor;
        this.nombre = nombre;
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.clave);
        hash = 79 * hash + Objects.hashCode(this.profesor);
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.horario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (!Objects.equals(this.clave, other.clave)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.profesor, other.profesor)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Materia{clave=").append(clave);
        sb.append(", profesor=").append(profesor);
        sb.append(", nombre=").append(nombre);
        sb.append(", horario=").append(horario);
        sb.append('}');
        return sb.toString();
    }
    
    
}
