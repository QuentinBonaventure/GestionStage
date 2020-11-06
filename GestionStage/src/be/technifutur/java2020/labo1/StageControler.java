package be.technifutur.java2020.labo1;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class StageControler {

   private static ListStage listStage = new ListStage();
   private StageVue vue = new StageVue();


    //TODO



    public static  void addStage() throws  DateTimeException{
        String nomSaisi;
        LocalDateTime dateDebut ;
        LocalDateTime dateFin ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrer le nom du stage à ajouter");
         nomSaisi = scan.nextLine();
        System.out.println("Date du début du stage");
         dateDebut = saisieDate();
        System.out.println("Date de fin du stage");
        dateFin = saisieDate();
        if (dateDebut.isBefore(LocalDateTime.now())){
            throw new DateTimeException("La date de début du stage  ne peut pas précédé la date d'ajourd'hui");
        }else if (dateFin.isBefore(dateDebut)){
            throw new DateTimeException("La date de fin du stage ne peut pas être avant la date de début");
        }else if(dateFin == dateDebut){
            throw new DateTimeException("Votre stage n'a aucune durée.");
        }else {
            System.out.println("Stage ajouté !");


        }
        listStage.add(nomSaisi,dateDebut,dateFin);








    }
    public static LocalDateTime saisieDate(){
        Scanner scan = new Scanner(System.in);
        String formatDate ="dd/MM/yy  HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDate);
        System.out.println("Insérer une date au format suivant : JJ/MM/AAAA HH:MM");
        String saisieUser =  scan.nextLine();
        Pattern pattern = Pattern.compile("(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/([0-9][0-9][0-9][0-9]) ([0-1][0-9]|2[0-3]):([0-5][0-9])");
        Matcher compare = pattern.matcher(saisieUser);
        boolean saisieOk = compare.matches();
        while (! saisieOk){
            System.out.println("La date rentrée n'est pas rentrée au bon format");
            System.out.println("Insérer une date au format suivant : JJ/MM/AAAA HH:MM");
            saisieUser = scan.nextLine();
            compare = pattern.matcher(saisieUser);
            saisieOk = compare.matches();
        }
        LocalDateTime date = LocalDateTime.parse(saisieUser , formatter);
        return date;
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
