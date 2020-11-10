package be.technifutur.java2020.labo1;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public  class ListStage {
        // Collection de Stage modèle
       public static LinkedHashMap<String, Stage> maListeStage = new LinkedHashMap<>();
       public static Stage stage;

    public ListStage() {

    }

    public static void add(String saisieUser , LocalDateTime dateDebut , LocalDateTime dateFin){
           Stage stage1 = new Stage();
           stage1.setName(saisieUser);
           stage1.setDateDebut(dateDebut);
           stage1.setDateFin(dateFin);

       }


       public void afficheList(){
           int i = 1;
           for(Map.Entry map : maListeStage.entrySet()){
               System.out.println("Stage : "+ i + ":" + map.getValue());
               i++;
           }

           }
            public LinkedHashMap<String, Stage> getListeStage() {
                return maListeStage;
            }

       }











