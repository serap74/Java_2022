package day07_IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaIcıHaftaSonu {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        // String case sensitive'dir
        // yani pazar, PAZAR,Pazar, PAzar bunlar hep farkli kelimelerdir
        // bu durumda String methodlarindan yardim aliriz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun  giriniz");
        String gunIsmı=scan.next().toLowerCase();
        // kullanici nasil yazarsa yazsin biz kucuk harfe ceviriyorz
        // String ifadelerde == kullanilmasi tavsiye edilmez
        // cunku bekledigimizden farkli sonuc verebilir

        if (gunIsmı.equals("pazar")|| gunIsmı.equals("cumartesi"));
        {
            System.out.println("girdiginiz gun haftasonu");
        }

        if (gunIsmı.equals("pazartesi") || gunIsmı.equals("sali") || gunIsmı.equals("carsamba")
                || gunIsmı.equals("persembe") || gunIsmı.equals("cuma")); {
            System.out.println("girdiginiz gun haftaici");
        }



    }

}


