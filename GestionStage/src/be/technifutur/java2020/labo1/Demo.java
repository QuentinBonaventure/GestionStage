package be.technifutur.java2020.labo1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
public class Demo {
    public static void main(String[] args) {
Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getYear());// depuis 1900
        System.out.println(date.getMonth()+1); // car il commence à 0
        System.out.println(date.getDay()+1);//car commence à 0 aussi

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH-mm");
        System.out.println(sdf.format(date));
    }
}
