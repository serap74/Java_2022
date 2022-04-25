package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {


        LocalDate trh= LocalDate.now();//objenin olusturuldugu tarihi trh ye atar
        LocalDate baskaTrh=LocalDate.of(1972,1,18);
        //istedigimiz yil ay ve gune degerlerine gore bize obje olusturur


        System.out.println(trh);//2022-03-31
        System.out.println(trh.getDayOfMonth());
        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.getMonthValue());
        System.out.println(trh.getYear());

        //bir tarihte istediğimiz kadar ileri ve geri gideriz

        System.out.println(trh.minusWeeks(20));
        System.out.println(trh.minusWeeks(5).minusWeeks(3));

        System.out.println(trh.plusMonths(9).plusDays(10));

        //ıstedigimiz ulkenin o andaki tarihini elde etmek istersek
        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));


        //is ile baslayan method'lar boolean dondurur
        System.out.println("trhZone = " + trhZone);

        System.out.println(LocalDate.now().isLeapYear());

        System.out.println(trh.isAfter(baskaTrh));


    }
}
