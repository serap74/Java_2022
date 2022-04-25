package day14_stringManipulation;

import java.util.Locale;

public class C04_IsimGizleme {
    public static void main(String[] args) {

        // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //      isim-soyisim : M***** B*******
        //      kart no : **** **** **** 1234

        String isim="serap ";
        String soyisim="diraz";
        String kkno="12345678976";

        // eger bir method'dan bir islem yapmasini
        // ve yaptigi islemi bize getirmesini isterseniz
        // return type void degil, bize getirecegi sonucun data turunde olmalidir


        isimSoyiisimGizle(isim,soyisim);
        String gizlenmisIsımSoyiisim=isimSoyiisimGizle(isim,soyisim);
        // bana isim ve soyismin gizlenmis halini getirmesini istiyorum
        // bekledigim donus String olur
        System.out.println(gizlenmisIsımSoyiisim);


        krediKartiGizle(kkno);




    }

    public static void krediKartiGizle(String kkno) {

        String yenikkno="**** **** **** " + kkno.substring(12);



    }

    public static String isimSoyiisimGizle(String isim, String soyisim) {

        String yeniIsim= isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yeniSoyIsim= isim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");
        // method olusturmada 3.adim
        // method calisinca sadece birsey mi yazdiracak
        // yoksa bize bir data mi dondurecek buna karar vermektir
        // Bu soruda gizlenmis isim soyisim dondurmesi istendiginden
        // return Type'i void degil String sectik
        // ve method'un sonuna return edilecek datayi yazdik

        return yeniIsim+" "+yeniSoyIsim;




        }
}
