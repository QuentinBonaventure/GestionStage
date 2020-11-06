package be.technifutur.java2020.labo1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public  class ListStage {
        // Collection de Stage
       public static HashMap<Integer, Stage> maListeStage = new HashMap<>();
       public static Stage stage;

       public static void add(String saisieUser , LocalDateTime dateDebut , LocalDateTime dateFin){
           Stage stage1 = new Stage();
           stage = stage;
           stage1.setName(saisieUser);
           stage1.setDateDebut(dateDebut);
           stage1.setDateFin(dateFin);

       }

       public void getList(){

       }





/*
Constructeur
 */



    }

