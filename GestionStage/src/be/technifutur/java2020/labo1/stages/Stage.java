package be.technifutur.java2020.labo1.stages;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Stage {

    /*
    Creation des variables ; avec localdate qui ne pourmettra d'appeler un formatter
     */
     private String name ;
     private LocalDateTime dateDebut;
     private LocalDateTime dateFin;
     private LocalTime heureDebut;
     private LocalTime heureFin;
     private Date dateAjd; // date de creation
/*
utiliser DateFormat pour creer une expression du genre ;
SimpleDateFormat =null;
Date dateAjd = new Date();
formater = new SimpleDateFormat("dd-MM--yyyy");
sout (format.format(dateAjd);

 */
//----------Constructeur

     public Stage (String name){
         this.name = name;

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
// parametre comme date local date donc year en premier ( on avait fait erreur dans sudoku)
    public void setDateDebut(int year , int month , int day , int hour , int minute) {
//essai exception
         dateDebut = LocalDateTime.of(year, month, day , hour , minute);
         if (dateDebut.isBefore(LocalDateTime.now())){
             throw new DateTimeException("Tu veux créer un stage dans le passé ?");
         }
    }

    public LocalDateTime getDateFin() {

         return dateFin;
    }
// pareil que setDateDebut écrit à l'envers
    public void setDateFin(int year , int month , int day , int hour , int minute) {

         dateFin = LocalDateTime.of(year, month, day , hour , minute);
    }








}
