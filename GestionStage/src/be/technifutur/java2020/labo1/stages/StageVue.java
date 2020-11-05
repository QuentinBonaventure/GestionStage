package be.technifutur.java2020.labo1.stages;

import java.time.format.DateTimeFormatter;

public class StageVue {
    //affichage stage

    private ListStage model;


    public void setModel(ListStage model){
 this.model =model;
}

    public void afficherStage(){
        // formatter le date type cfr javadoc DateTime
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println("Voici la liste de nos stages\n");
        System.out.println("nom du stage : "+"  " + "Debut du stage : "+"  " + "Fin du Stage :" +"  ");



        //formatter à aller revoir
        //TODO

        }

    }


