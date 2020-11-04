package be.technifutur.java2020.labo1.stages;

import java.util.Scanner;

public class StageControler {
    //
    //Relier avec le set model et le set vue
private StageModel model;
private StageVue vue;

public StageControler(StageModel model , StageVue vue) {
  this.model = model;
  this.vue = vue;
}

    public void setModel(StageModel model) {

    this.model = model;
    }

    public void setVue(StageVue vue) {

    this.vue = vue;
    }

    public void ajoutStage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ajout d'un nouveau stage");
        System.out.println("Entrez le nom du stage à ajouter");
        model.addStage(sc.nextLine());
        Integer key = model.getStages().size();
    }
}
