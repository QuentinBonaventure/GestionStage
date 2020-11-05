package be.technifutur.java2020.labo1;

import be.technifutur.java2020.labo1.stages.Stage;

import java.util.Scanner;

public class Menu {
    private Stage [] menu;
    private int nbStage = 0;


    public Menu(int size){
        menu = new Stage[size];
       Scanner sc = new Scanner(System.in);
    }

    public void afficherMenu(){
        System.out.println("");
    }
}
