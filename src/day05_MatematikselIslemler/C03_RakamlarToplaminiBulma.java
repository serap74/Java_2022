package day05_MatematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        // kullanicidan aldiginiz 4 basamakli bir sayinin
        // basamaklardaki rakamlar toplamini bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamaklı bir sayi giriniz");
        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;


        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        System.out.println("girdiginiz sayinin rakamlar toplami " + rakamlarToplami);



    }
}
