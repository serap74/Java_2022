package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class C10_sayiBulmaca {
    public static void main(String[] args) {


        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random rnd = new Random();
        int sayi = rnd.nextInt(100);
        System.out.println(sayi);

        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
       int sayac=1;

        while (sayi != tahmin) {
            System.out.println("lutfen bir sayi girin");
            tahmin = scan.nextInt();

            if (tahmin > sayi) {
                System.out.println("daha kucuk bir asyi girmelisin");

            } else if (tahmin < sayi){
                System.out.println("daha kucuk bir sayi girmelisin");

            }
        sayac++;
        }

        System.out.println("Tuttugum sayiyi " + (sayac-1) + "tahminde bulundunuz");

        }






    }

