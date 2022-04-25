package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormetter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println("tarihSaat = " + tarihSaat);//tarihSaat = 2022-03-31T22:38:05.696743900

        DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd/MMMM/YYYY");//31/Mart/2022
        System.out.println(formater.format(tarihSaat));//31/3/2022

        DateTimeFormatter formattersaat=DateTimeFormatter.ofPattern("HH : mm");//22 : 55
        System.out.println(formattersaat.format(tarihSaat));//22 : 52

        DateTimeFormatter formattersaat1=DateTimeFormatter.ofPattern("hh : mm");//10 : 55
        System.out.println(formattersaat1.format(tarihSaat));//10 : 54

        DateTimeFormatter formattersaat2=DateTimeFormatter.ofPattern("h : mm a");//10 : 55 ÖS
        System.out.println(formattersaat2.format(tarihSaat));

        DateTimeFormatter formattersaat3=DateTimeFormatter.ofPattern("h:mm:ss a");//10:55:54 ÖS
        System.out.println(formattersaat3.format(tarihSaat));//
    }
}
