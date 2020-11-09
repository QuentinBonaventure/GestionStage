package be.technifutur.java2020.labo1;

import java.util.HashMap;

public class ActiviteControler extends  AbstractControler {

    public void addActivite(Stage monStage , String name  , Activite monActivite ){


    }

    public void removeActivite(){

    }

    public void remplaceActivite(){

    }
    public boolean contient(HashMap maMap , String key){
        boolean contenir = false;
        if (maMap.containsKey(key)){
            contenir = true;
        }
        return contenir;

    }

}
