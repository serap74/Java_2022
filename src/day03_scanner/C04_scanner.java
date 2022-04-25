package day03_scanner;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        //1. adım
        Scanner scan=new Scanner(System.in);

        //2. adım
        System.out.println("lutfen isminizi giriniz");

        //3. adım
        String kullaniciIsmi=scan.nextLine();

        //4.adım
        System.out.println("kullanicinin girdigi isim : " + kullaniciIsmi );



        }
}
