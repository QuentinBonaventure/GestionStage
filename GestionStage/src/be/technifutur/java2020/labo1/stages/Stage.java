package be.technifutur.java2020.labo1.stages;
import java.time.DateTimeException;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Stage {
     private String name ;
     private LocalDate dateDebut;
     private LocalDate dateFin;
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

    public LocalDate getDateDebut() {

         return dateDebut;
    }
// parametre comme date local date donc year en premier ( on avait fait erreur dans sudoku)
    public void setDateDebut(int year , int month , int day) {
//essai exception
         dateDebut = LocalDate.of(year, month, day);
         if (dateDebut.isBefore(LocalDate.now())){
             throw new DateTimeException("Tu veux créer un stage dans le passé ?");
         }
    }

    public LocalDate getDateFin() {

         return dateFin;
    }
// pareil que setDateDebut écrit à l'envers
    public void setDateFin(int year , int month , int day) {

         dateFin = LocalDate.of(year, month, day);
    }








}
