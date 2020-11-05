package be.technifutur.java2020.labo1;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class StageControler {

    ListStage listStage = new ListStage();
    StageVue vue = new StageVue();


    //TODO



    public void addStage(){
        LocalDateTime dateDebut ;
        LocalDateTime dateFin ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrer le nom du stage à ajouter");
        String nomSaisi = scan.nextLine();
        System.out.println("Date du début du stage");
        saisieDate();


        System.out.println("Date de fin du stage");



    }
    public  static void saisieDate(){
        Scanner scan = new Scanner(System.in);
        String formatDate ="dd/MM/yy  HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDate);
        System.out.println("Insérer une date au format suivant : JJ/MM/AAAA HH:MM");
        String saisieUser =  scan.nextLine();
        Pattern pattern = Pattern.compile("[0-1][0-9]/[0-3][0-9]/[0-9]{2}(?:[0-9]{2})?");
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
    public void addStage(ListStage maHashMap, String name, Stage stage){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ajout d'un nouveau stage");





    }
}
