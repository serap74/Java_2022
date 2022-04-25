package day08_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabili

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi yaziniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        if (cinsiyet == 'K') {

            if (yas < 0 || yas > 120) {
                System.out.println("lutfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin \nDaha " + (60 - yas) + " yıl calisman gerekir");
            } else {
                System.out.println("emekli olabilirsin");
            }

            }else if (cinsiyet=='E') {
            if (yas<0 || yas>120){
            System.out.println("emekli olamazsin \nDaha " + (65 - yas) + " yil calisman gerekir");
        } else {
                System.out.println("emekli olabilirsin");

                System.out.println("lutfen cinsiyet icin gecerli bir harfa giriniz");
            }
    }

    }
}
