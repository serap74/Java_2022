package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_ikiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunu= LocalDate.of(1987,07,20);//P34Y8M11D

        System.out.println(Period.between(dogumGunu,bugun));//P34Y8M11D

        System.out.println(Period.between(dogumGunu,bugun).getDays());//11

        System.out.println(Period.between(dogumGunu,bugun).getYears());//34



    }
}
