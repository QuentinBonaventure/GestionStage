package be.technifutur.java2020.labo1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class Activite {
    String name;
    LocalDateTime dateDebut;
    LocalTime duree;

    public Activite() {
        this.name = name;
        this.dateDebut = dateDebut;
        this.duree = duree;
    }

    public LocalTime getDuree() {
        return duree;
    }

    public void setDuree(LocalTime duree) {
        this.duree = duree;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activite activite = (Activite) o;
        return Objects.equals(name, activite.name) &&
                Objects.equals(dateDebut, activite.dateDebut) &&
                Objects.equals(duree, activite.duree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateDebut, duree);
    }

    @Override
    public String toString() {
        return "Activite{" +
                "name='" + name + '\'' +
                ", dateDebut=" + dateDebut +
                ", duree=" + duree +
                '}';
    }
}
