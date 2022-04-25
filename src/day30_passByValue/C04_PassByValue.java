package day30_passByValue;

public class C04_PassByValue {

    // eger bir method'da yapilan degisikligin kalici olmasini istiyorsak
    // iki yontem kullanabiliriz
    // 1- variable'i class level'da static olarak olusturabilirim


    static double etiketFiyati;
    static double indirimYuzdesi;

    public static void main(String[] args) {

        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciİndirimYap();
        indirimYuzdesi=15;
        kaliciİndirimYap();
        indirimYuzdesi=5;
        kaliciİndirimYap();

        //indirimli fiyat : 90.0
        //indirimli fiyat : 76.5
        //indirimli fiyat : 72.675
    }

    private static void kaliciİndirimYap() {

        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100 ;
        System.out.println("indirimli fiyat : " + etiketFiyati);
    }
}
