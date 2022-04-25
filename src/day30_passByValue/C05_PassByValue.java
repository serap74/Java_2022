package day30_passByValue;

public class C05_PassByValue {

    // Kalici indirim icin ikinci yontem

    public static void main(String[] args) {
        double etiketFiyati=100;
        double indirimYuzdesi=10;

        etiketFiyati= kaliciİndirimYapp(etiketFiyati,indirimYuzdesi);


    }

    private static double kaliciİndirimYapp(double etiketFiyati, double indirimYuzdesi) {

        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100 ;
        System.out.println("indirimli fiyat : " + etiketFiyati);
        return etiketFiyati;
    }
}
