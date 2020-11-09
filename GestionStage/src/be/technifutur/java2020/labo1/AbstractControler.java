package be.technifutur.java2020.labo1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  abstract class AbstractControler {

    public static LocalDateTime saisieDate(){
        Scanner scan = new Scanner(System.in);
        String formatDate ="dd/MM/yyyy HH:mm";
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


}
