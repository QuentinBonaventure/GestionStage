package be.technifutur.java2020.labo1;
import be.technifutur.java2020.labo1.AbstractControler;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class StageControler extends AbstractControler {

   static ListStage listStage = new ListStage();
   private StageVue vue = new StageVue();


public void addStage(ListStage maMapStage , String name , Stage monStage){

    if( maMapStage.getListeStage().containsKey(name)){
        System.out.println("Ce stage existe déjà");
    }else{
        maMapStage.getListeStage().put(name, monStage);
        System.out.println("Votre nouveau stage : " +name + "a été ajouté ");
    }
}

public void removeStage(ListStage maMapStage , String name, Stage monStage){
    if (! maMapStage.getListeStage().containsKey(name)){
        System.out.println("Ce stage n'existe pas ");
    }else {
        maMapStage.getListeStage().remove(name);
        System.out.println("Le stage "+ name +" a bien été supprimé");
    }
}
    public void remplaceStage(ListStage maMapStage , String ancien, String nouveau , Stage monStage){
        if (! maMapStage.getListeStage().containsKey(ancien)){
            System.out.println("Ce stage n'existe pas , il n'est donc pas possible de le remplacer ");
        }else {
            this.removeStage(maMapStage , ancien); //TODO
            this.addStage(maMapStage , nouveau , monStage);
        }
    }




    public void setModel(ListStage listStage) {

    this.listStage = listStage;
    }

    public void setVue(StageVue vue) {

    this.vue = vue;
    }
/*
Scenario : demande à utilisateur d'ajouter un nouveau stage .
Il devra saisir le nom du stage à ajouter puis lui ajouter les
datesDebut et dateFin
Il va falloir utiliser le formatter et le regex pour controler l'entrée
 */

}
