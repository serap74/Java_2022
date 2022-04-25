package day07_IfStatement;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // 65 veya daha buyukse emekli olabilirsin
        // 65'den kucukse emekli olamazsin yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas>=65) {
            System.out.println("emekli olabilirisn");

        } else {
            System.out.println("emekli olamazsın");
        }
        // if else statement'larda iki durumdan sadece ve sadece biri calisir
        // ikisinin birden calisma ihtimali ====> YOK
        // ikisinin de calismama ihtimali =====> YOK

    }
}
