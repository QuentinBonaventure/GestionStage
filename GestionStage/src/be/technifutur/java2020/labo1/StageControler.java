package be.technifutur.java2020.labo1;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class StageControler extends AbstractControler {

   static ListStage listStage = new ListStage();
   private StageVue vue = new StageVue();









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
