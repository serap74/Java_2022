package day09_TernarySwitch;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        int sayi=1400;
        // verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary olusturun

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen uc basamaklı bir sayı giriniz");
        String sonuc=sayi>100 ? "sayi 3 basamaklı ya da daha buyuk" : "sayi negatif veya 3 " +
                "basamaktan kucuk";
        System.out.println("girdiginiz sayi analizi : " + sonuc);

    }
}
