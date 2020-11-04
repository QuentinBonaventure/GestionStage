package be.technifutur.java2020.labo1.stages;

import java.time.LocalDate;

public class Stage {
     private String name ;
     private LocalDate dateDebut;
     private LocalDate dateFin;

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

         dateDebut = LocalDate.of(year, month, day);
    }

    public LocalDate getDateFin() {

         return dateFin;
    }
// pareil que setDateDebut écrit à l'envers
    public void setDateFin(int year , int month , int day) {

         dateFin = LocalDate.of(year, month, day);
    }








}
