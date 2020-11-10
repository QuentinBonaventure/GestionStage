package be.technifutur.java2020.labo1;

import java.util.LinkedHashMap;

public class Menu {
    private LinkedHashMap<Integer ,String> listChoix;

    public Menu(){
        listChoix = new LinkedHashMap<>();
    }

    public LinkedHashMap<Integer, String> getListChoix() {
        return listChoix;
    }

    public void MenuRole(){
        this.getListChoix().put(1, "1. Je suis l'organisateur");
        this.getListChoix().put(2, "2. Je suis un participant");
    }


    public void MenuStageOrganisateur(){

        this.getListChoix().put(1, "1. Afficher la liste des stages ");
        this.getListChoix().put(2, "2. Ajouter un nouveau stage");
        this.getListChoix().put(3, "3. Supprimer un stage");
        this.getListChoix().put(4, "4. Remplacer un stage");
        this.getListChoix().put(5, "5. Afficher les activités du stage demandé");
    }

    public void MenuStage(){
        this.getListChoix().put(1, "1.Ajouter une activité");
        this.getListChoix().put(2, "2. Retirer activité");
        this.getListChoix().put(3, "3. remplacer activité");
        this.getListChoix().put(4, "4. Afficher la liste des activités");
        this.getListChoix().put(5, "5. Afficher les détails d'une activité");
        this.getListChoix().put(6, "6. Retourner au Menu Principal");
    }

    public void MenuStageParticipant(){
        this.getListChoix().put(1,"1. Afficher la liste des stages");
        this.getListChoix().put(2, "2. Afficher les activités d'un stage");
    }

}
