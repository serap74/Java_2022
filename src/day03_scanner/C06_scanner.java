package day03_scanner;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {
        // Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir
        // bosluk olusturarak asagidaki sekilde yazdirin
        //      Isim – soyisim : Mehmet Bulutluoz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi yaziniz");
        String isim= scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyIsım= scan.nextLine();
        System.out.println("isim - soyisim : " + isim + " " + soyIsım);

    }
}
