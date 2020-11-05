package be.technifutur.java2020.labo1.stages;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StageControler {
    /*
    Relier avec le set model et le set vue
     */
private ListStage model;
private StageVue vue;
private Pattern datePattern = Pattern.compile("");
//TODO


    public void setModel(ListStage model) {

    this.model = model;
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
    public void nouveauStage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ajout d'un nouveau stage");
        System.out.println("Entrez le nom du stage à ajouter");
        model.addStage(sc.nextLine());


    }
}
