package ihm.icoclassroom.models;

import java.util.Objects;

public class Salon {
    private String edificio;
    private String nombre;
    private byte piso;

    public Salon() {
    }
    
    public Salon(String edificio, String nombre, byte piso) {
        this.edificio = edificio;
        this.nombre = nombre;
        this.piso = piso;
    }

    public byte getPiso() {
        return piso;
    }

    public void setPiso(byte piso) {
        this.piso = piso;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
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
        hash = 89 * hash + Objects.hashCode(this.edificio);
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + this.piso;
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
        final Salon other = (Salon) obj;
        if (this.piso != other.piso) {
            return false;
        }
        if (!Objects.equals(this.edificio, other.edificio)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Salon{edificio=").append(edificio);
        sb.append(", nombre=").append(nombre);
        sb.append(", piso=").append(piso);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
