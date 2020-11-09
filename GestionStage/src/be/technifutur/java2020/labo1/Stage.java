package be.technifutur.java2020.labo1;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Stage {


    /*
    Creation des variables ; avec localdatetime
     */
     private String name ;
     private LocalDateTime dateDebut;
     private LocalDateTime dateFin;
     HashMap <String , Activite> listeActivite;

//constructeur

     public Stage (){
         this.name = name;
         this.dateDebut = dateDebut;
         this.dateFin = dateFin;
         listeActivite = new HashMap<>();

     }


// ----------Guetter & Setter


    public String getName() {

         return name;
    }

    public void setName(String name) {

         this.name = name;
    }

    public LocalDateTime getDateDebut() {

         return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut)  {

         this.dateDebut = dateDebut;

    }



    public LocalDateTime getDateFin() {

         return dateFin ;
    }

    public void setDateFin(LocalDateTime dateFin )  {

         this.dateFin = dateFin;

         }
         @Override
    public boolean equals(Object o){
         if ( this == o) return true ;
         if(o == null || getClass() != o.getClass()) return false;

         Stage stage = (Stage) o;

         if(!name.equals(stage.name)) return false;
         if(dateDebut !=null ? !dateDebut.equals(stage.dateDebut) : stage.dateDebut !=null) return false;
         return dateFin !=null ? dateFin.equals(stage.dateFin) : stage.dateFin == null;
         }

    @Override
    public int hashCode() {
         int result = name.hashCode();
         result = 31 * result +(dateDebut != null ? dateDebut.hashCode() : 0);
         result = 31 *result +(dateFin != null ? dateFin.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "name='" + name + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                '}';
    }
}








