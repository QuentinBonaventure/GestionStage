package be.technifutur.java2020.labo1;

public class Activite {
    String name;
    String duree;

    public Activite(String name, String duree) {
        this.name = name;
        this.duree = duree;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }



    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
