package day08_ifElseIfStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {

        // Kullanicidan iki sayi isteyin,
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        // sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        // sayilarin ikisi farkli isaretlere sahipse
        // “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        // sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        // sayilarina ikisi de pozitif ise sayilarin toplamini yazdirin,

        if (sayi1>0 && sayi2>0){
        System.out.println("girdiginiz iki sayi da pozitif olduğundan toplamlari= " + (sayi1+sayi2));

    } else if (sayi1<0 && sayi2<0) {
            // sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
            System.out.println("girdiginiz sayilarin ikisi de negatif oldugundan carpimlari=" + " " + (sayi1 * sayi2));
        } else if (sayi1*sayi2<0){
                // sayilarin ikisi farkli isaretlere sahipse
                // “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
                System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
      }else {
            System.out.println("sifir carpmaya gore yutan elemandir");

            }


        }

        }

