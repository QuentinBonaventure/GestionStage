package be.technifutur.java2020.labo1;
import be.technifutur.java2020.labo1.*;
import be.technifutur.java2020.labo1.stages.Stage;
import be.technifutur.java2020.labo1.stages.StageControler;
import be.technifutur.java2020.labo1.stages.StageModel;
import be.technifutur.java2020.labo1.stages.StageVue;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StageVue vue = new StageVue();
        StageModel model = new StageModel();
        StageControler controler = new StageControler();
        System.out.println("Application gestion stages sportifs ou culturels ");
        controler.setVue(vue);
        controler.setModel(model);
      //  Map<String, Stage> maMapStage = new HashMap<>();
       // maMapStage.put()
      //  System.out.println(maMapStage);
    }
}
