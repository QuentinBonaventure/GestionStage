package be.technifutur.java2020.labo1;

import java.util.HashMap;

public class ActiviteControler extends  AbstractControler {

    public void addActivite(Stage monStage , String name  , Activite monActivite ){
if( this.contient(monStage.getListeActivite(), name)){
    System.out.println("L'activité existe déjà");
}else{
    monStage.addActivite(monActivite);
}

    }

    public void removeActivite(Stage monStage , String key){
    if (this.contient(monStage.getListeActivite(), key )){
        monStage.removeActivite(key);
        System.out.println("L'activité " + key + " a bien été supprimée");
    }else {
        System.out.println("Votre stage ne comprend pas cette activité");
    }
    }

    public void remplacerActivite( Stage monStage, String ancien , String nouveau , Activite monActivite){
        if (this.contient(monStage.getListeActivite(), ancien)){
            this.removeActivite(monStage , ancien);
            this.addActivite( monStage, nouveau , monActivite);
        }


    }
    public boolean contient(HashMap maMap , String key){
        boolean contenir = false;
        if (maMap.containsKey(key)){
            contenir = true;
        }
        return contenir;

    }

}
