package be.technifutur.java2020.labo1;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class StageVue {
    //affichage stage






    public void afficheListeStage(HashMap maListeStage){
        // formatter le date type cfr javadoc DateTime
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println("Voici la liste de nos stages\n");
        System.out.println();
        System.out.println("nom du stage : "+"  " + "Debut du stage : "+"  " + "Fin du Stage :" +"  ");

    }
public void afficheMenu(){
    System.out.println("Tu as les droits pour gerer un stage .");
    System.out.println("Que veux tu faire ? \n1. Afficher la liste des stages \n2. Ajouter Stage \n3. Supprimer Stage");
    Scanner scan = new Scanner(System.in);
    int choix = scan.nextInt();
    if (choix ==0 || choix >3)
    {
        System.out.println("Le numéro rentré ne correspond pas à un des choix disponibles");
    switch(choix) {
        case 1 :
        case 2 :
        case 3 :
    }


    }
}
    }


