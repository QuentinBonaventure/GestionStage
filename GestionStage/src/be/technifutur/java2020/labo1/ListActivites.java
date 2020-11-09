package be.technifutur.java2020.labo1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class ListActivites {
    public static  HashMap<Integer , Activite> maListeActivtés = new HashMap<>();
    public static Activite activite;

    public static void add(String saisieUser , LocalDateTime dateDebut , int duree){
        Activite activite1 = new Activite();
        activite1.setName(saisieUser);
        activite1.setDateDebut(dateDebut);
        activite1.setDuree(duree);
    }
    public static void afficheList(){
        int i = 0;
        for (Map.Entry map : maListeActivtés.entrySet()){
            System.out.println("Activité : "+ i + " :" + map.getValue());
        }
    }

}
