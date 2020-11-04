package be.technifutur.java2020.labo1.stages;

import java.time.LocalDate;
import java.util.HashMap;

public class StageModel {
        // Collection de Stage
       private HashMap<Integer, Stage> stages = new HashMap<Integer, Stage>();


/*
Constructeur
 */

    public HashMap<Integer, Stage> getStages() {

        return stages;
    }
/*
  ajout stage , ajouter + 1 à la taille + new instance de stage avec name en par
  exceptions quand on ajoute un test dans ctrl
*/
        public void addStage(String name) {

            //TODO
        }
/*
Supprimer stage
 */
        public void removeStage() {
        }



    public void setName(String key, String name) {
            stages.get(key).setName(name);

        }

        public void setDateDebut(String key, int year, int month, int day) {
           stages.get(key).setDateDebut(year, month, day);

        }

        public void setDateFin(String key, int year, int month, int day) {
            stages.get(key).setDateFin(year, month, day);

        }

        public LocalDate getDateDebut(Integer key) {
            LocalDate dateDebut = LocalDate.of(stages.get(key).getDateDebut().getYear(),
                    stages.get(key).getDateDebut().getMonth(),
                    stages.get(key).getDateDebut().getDayOfMonth());
            return dateDebut;
        }

        public LocalDate getDateFin(Integer key){
            LocalDate dateFin = LocalDate.of(stages.get(key).getDateFin().getYear(),
                   stages.get(key).getDateFin().getMonth(),
                    stages.get(key).getDateFin().getDayOfMonth());
            return dateFin;

        }
    }

