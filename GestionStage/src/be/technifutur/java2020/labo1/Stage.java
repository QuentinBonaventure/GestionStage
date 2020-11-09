package be.technifutur.java2020.labo1;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Stage {


    /*
    Creation des variables ; avec localdatetime
     */
     private String name ;
     private LocalDateTime dateDebut;
     private LocalDateTime dateFin;
     HashMap <String , Activite> listeActivite;

//constructeur

     public Stage (){
         this.name = name;
         this.dateDebut = dateDebut;
         this.dateFin = dateFin;
         listeActivite = new HashMap<>();

     }

 // get pour  activités
    public HashMap<String , Activite> getListeActivite(){
         return listeActivite;
    }

    public void addActivite(ListStage maListeStage, String nouveau, Activite monActivite){
         if(this.horaireActiviteValid(monActivite)){
             this.listeActivite.put(monActivite.getName(), monActivite);
             System.out.println("L'activité " + monActivite.getName() +" a bien été ajoutée au stage");
         }else {
             System.out.println("La date de l'activité ne correspond pas au stage");
         }

    }
    public void removeActivite( ListStage maMapStage , String key){
       if( maMapStage.getListeStage().containsKey(key))
       {  this.listeActivite.remove(key);
       }else{
           System.out.println("Cette activité n'existe pas encore , vous ne pouvez donc pas la supprimer");
       }
    }

    public void remplacerActivite( ListStage maListeStage, String ancien , String nouveau , Activite monActivite){
         if (this.contient(maListeStage.getListeStage(), ancien)){
             this.removeActivite(maListeStage , ancien);
             this.addActivite(maListeStage , nouveau , monActivite);
         }


    }
    public boolean horaireActiviteValid(Activite monActivite) {
        boolean ok = false;
        if ((monActivite.getDateDebut().isAfter(this.getDateDebut())) &&
                (this.getDateFin().isAfter(monActivite.getDateDebut().plusMinutes(monActivite.getDuree())))) {
            ok = true;
        }
        return ok;
    }

    public boolean contient(HashMap maMap , String key){
        boolean contenir = false;
        if (maMap.containsKey(key)){
            contenir = true;
        }
        return contenir;

    }



// ----------Guetter & Setter


    public String getName() {

         return name;
    }

    public void setName(String name) {

         this.name = name;
    }

    public LocalDateTime getDateDebut() {

         return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut)  {

         this.dateDebut = dateDebut;

    }



    public LocalDateTime getDateFin() {

         return dateFin ;
    }

    public void setDateFin(LocalDateTime dateFin )  {

         this.dateFin = dateFin;

         }


         @Override
    public boolean equals(Object o){
         if ( this == o) return true ;
         if(o == null || getClass() != o.getClass()) return false;

         Stage stage = (Stage) o;

         if(!name.equals(stage.name)) return false;
         if(dateDebut !=null ? !dateDebut.equals(stage.dateDebut) : stage.dateDebut !=null) return false;
         return dateFin !=null ? dateFin.equals(stage.dateFin) : stage.dateFin == null;
         }

    @Override
    public int hashCode() {
         int result = name.hashCode();
         result = 31 * result +(dateDebut != null ? dateDebut.hashCode() : 0);
         result = 31 *result +(dateFin != null ? dateFin.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "name='" + name + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                '}';
    }
}








