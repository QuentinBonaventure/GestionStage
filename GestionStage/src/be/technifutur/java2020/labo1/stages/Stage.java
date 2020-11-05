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
     private LocalDate dateDebut;
     private LocalDate dateFin;
     private LocalTime heureDebut;
     private LocalTime heureFin;
     //private Date dateAjd; // date de creation
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
/*
Get et set datedebut
 */
    public LocalDate getDateDebut() {

         return dateDebut;
    }
// parametre comme date local date donc year en premier ( on avait fait erreur dans sudoku)
    public void setDateDebut(int year , int month , int day ) throws DateTimeException {
//essai exception
         dateDebut = LocalDate.of(year, month, day);
         if (dateDebut.isBefore(LocalDate.now())){
             throw new DateTimeException("Tu veux créer un stage dans le passé ?");
         }
    }

   /*
   Date fin get et set
    */

    public LocalDate getDateFin() {

         return dateFin ;
    }
// pareil que setDateDebut écrit à l'envers
    public void setDateFin(int year , int month , int day ) throws DateTimeException {

         dateFin = LocalDate.of(year, month, day);
         if (dateFin.isBefore(dateDebut)){
             throw new DateTimeException("La date du stage ne peut pas se finir avec le commencement de celui ci ");
         }

    }


    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(int hour , int minute) throws DateTimeException {
        heureDebut = LocalTime.of(hour, minute);
        if (heureDebut.isBefore(LocalTime.now())){
            throw new DateTimeException("Vous ne pouvez pas créer un stage qui a déjà commencé");
        }
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(int hour , int minute) throws DateTimeException {
        heureFin = LocalTime.of(hour , minute);
        if (heureFin.isBefore(heureDebut)){
            throw new DateTimeException("Votre stage ne peut pas se finir avec le début de celui ci ");
        }
    }
}
