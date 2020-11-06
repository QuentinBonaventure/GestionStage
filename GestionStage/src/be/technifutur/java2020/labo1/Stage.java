package be.technifutur.java2020.labo1;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Stage {

    /*
    Creation des variables ; avec localdatetime
     */
     private String name ;
     private LocalDateTime dateDebut;
     private LocalDateTime dateFin;



     public Stage (){
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
    public void setDateDebut(LocalDateTime dateDebut)  {
//essai exception
         this.dateDebut = dateDebut;

    }

   /*
   Date fin get et set
    */

    public LocalDateTime getDateFin() {

         return dateFin ;
    }
// pareil que setDateDebut écrit à l'envers
    public void setDateFin(LocalDateTime dateFin )  {

         this.dateFin = dateFin;

         }

    }








