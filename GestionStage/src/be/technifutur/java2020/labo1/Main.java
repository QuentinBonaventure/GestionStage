package be.technifutur.java2020.labo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenue dans votre  gestionnaire de Stage");
         StageControler stageCtrl = new StageControler();
         StageVue stageVue = new StageVue();
        System.out.println("tu es un participant ou un organisateur ?");
        Menu menu = new Menu();
        menu.MenuRole();
        int role = scan.nextInt();
        if(role ==1){
            menu.MenuStageOrganisateur();
            stageVue.afficheMenuCreationStage();
        }else if( role ==2){
            menu.MenuStageParticipant();
        }else{
            System.out.println("Ce choix n'est pas possible");
            menu.MenuRole();
            scan.nextInt();
        }









    }
}
