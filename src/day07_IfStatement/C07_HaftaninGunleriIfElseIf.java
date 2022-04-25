package day07_IfStatement;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // eger kullanici gun ismini yanlis girerse "Yanlis giris" yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ısmını yazınız");
        String gunIsmi=scan.next().toLowerCase();

        if(gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");

        } else if (gunIsmi.equals("pazartesi")|| gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
        gunIsmi.equals("persembe")|| gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun haftaici");

        } else {
        System.out.println("lutfen gecerli bir gun ismi giriniz");
        }


    }
}
