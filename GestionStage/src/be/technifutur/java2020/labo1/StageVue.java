package be.technifutur.java2020.labo1;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

import static be.technifutur.java2020.labo1.ListStage.maListeStage;
import static be.technifutur.java2020.labo1.StageControler.listStage;

public class StageVue {
    //affichage stage






    public static void afficheListeStage(HashMap maListeStage){
        // formatter le date type cfr javadoc DateTime

        System.out.println("Voici la liste de nos stages\n");
        System.out.println(maListeStage.keySet().toString());


    }


public void afficheMenuCreationStage(){
    System.out.println("Tu as les droits pour gerer un stage .");
    System.out.println("Choisis le numéro correspondant à l'action souhaitée  \n1. Afficher la liste des stages \n2. Ajouter Stage \n3. Supprimer Stage\n4. Remplacer un stage\n5. Afficher les activités d'un stage");
    Scanner scan = new Scanner(System.in);
    int choix = scan.nextInt();

    switch(choix) {
        case 1 : StageVue.afficheListeStage(maListeStage);
           break;

        case 2 :  CreationStage();
                    StageVue.afficheListeStage(maListeStage);

            break;
        case 3 :

            break;
        case 4 :
            break;

        case 5 :

            break;

        default:
            throw new IllegalStateException("Unexpected value: " + choix);
    }
}

    public static  void CreationStage() throws  DateTimeException{
        String nomSaisi;
        LocalDateTime dateDebut ;
        LocalDateTime dateFin ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrer le nom du stage à ajouter");
        nomSaisi = scan.nextLine();
        System.out.println("Date du début du stage");

        dateDebut = AbstractControler.saisieDate();
        System.out.println("Date de fin du stage");
        dateFin = AbstractControler.saisieDate();
        if (dateDebut.isBefore(LocalDateTime.now())){
            throw new DateTimeException("La date de début du stage  ne peut pas précédé la date d'ajourd'hui");
        }else if (dateFin.isBefore(dateDebut)){
            throw new DateTimeException("La date de fin du stage ne peut pas être avant la date de début");
        }else if(dateFin == dateDebut){
            throw new DateTimeException("Votre stage n'a aucune durée.");
        }else {
            System.out.println("Stage ajouté !");


        }
        ListStage.add(nomSaisi,dateDebut,dateFin);



    }
    }


