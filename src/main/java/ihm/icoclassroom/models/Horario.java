package ihm.icoclassroom.models;

import java.util.Objects;

public class Horario {
    private String dia;
    private String horaI;
    private String horaF;
    private Salon salon;

    public Horario() {
    }

    public Horario(String dia, String horaI, String horaF, Salon salon) {
        this.dia = dia;
        this.horaI = horaI;
        this.horaF = horaF;
        this.salon = salon;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraI() {
        return horaI;
    }

    public void setHoraI(String horaI) {
        this.horaI = horaI;
    }

    public String getHoraF() {
        return horaF;
    }

    public void setHoraF(String horaF) {
        this.horaF = horaF;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.dia);
        hash = 11 * hash + Objects.hashCode(this.horaI);
        hash = 11 * hash + Objects.hashCode(this.horaF);
        hash = 11 * hash + Objects.hashCode(this.salon);
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
        final Horario other = (Horario) obj;
        if (!Objects.equals(this.dia, other.dia)) {
            return false;
        }
        if (!Objects.equals(this.horaI, other.horaI)) {
            return false;
        }
        if (!Objects.equals(this.horaF, other.horaF)) {
            return false;
        }
        if (!Objects.equals(this.salon, other.salon)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Horario{dia=").append(dia);
        sb.append(", horaI=").append(horaI);
        sb.append(", horaF=").append(horaF);
        sb.append(", salon=").append(salon);
        sb.append('}');
        return sb.toString();
    }
    
    
}
