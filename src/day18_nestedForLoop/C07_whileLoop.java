package day18_nestedForLoop;

import java.util.Scanner;

public class C07_whileLoop {
    public static void main(String[] args) {

        // kullanicidan kac sayi toplamak istedigini alin
        // bu sayilari alin ve bu sayilarin toplamini ekrana yazdirin

        int sayiAdedi=3;


        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;


        //variable loop
        // içinde olusturulmaz

        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;


        }

        System.out.println("girilen " + sayiAdedi + "sayinin toplami :" +toplam );

        //while loop ile yapalım
        sayi=0;
        toplam=0;
        int sayac=1;
        while(sayac<=sayiAdedi){
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;

        }
        System.out.println("girilen " + sayiAdedi + "sayinin toplami :" +toplam );
    }
}
