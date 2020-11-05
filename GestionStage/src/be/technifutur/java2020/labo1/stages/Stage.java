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

     //private Date dateAjd; // date de creation
/*
utiliser DateFormat pour creer une expression du genre ;
SimpleDateFormat =null;
Date dateAjd = new Date();
formater = new SimpleDateFormat("dd-MM--yyyy");
sout (format.format(dateAjd);

 */
//----------Constructeur

     public Stage (String name , LocalDateTime dateDebut , LocalDateTime dateFin){
         this.name = name;
         this.dateDebut = dateDebut;
         this.dateFin = dateFin;

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
    public LocalDateTime getDateDebut() {

         return dateDebut;
    }
// parametre comme date local date donc year en premier ( on avait fait erreur dans sudoku)
    public void setDateDebut(LocalDateTime dateDebut) throws DateTimeException {
//essai exception
         this.dateDebut = dateDebut;
         if (dateDebut.isBefore(LocalDateTime.now())){
             throw new DateTimeException("Tu veux créer un stage dans le passé ?");
         }
    }

   /*
   Date fin get et set
    */

    public LocalDateTime getDateFin() {

         return dateFin ;
    }
// pareil que setDateDebut écrit à l'envers
    public void setDateFin(LocalDateTime dateFin ) throws DateTimeException {

         this.dateFin = dateFin;
         if (dateFin.isBefore(dateDebut)){
             throw new DateTimeException("La date du stage ne peut pas se finir avec le commencement de celui ci ");
         }

    }







}
