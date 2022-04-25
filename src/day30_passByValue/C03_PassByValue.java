package day30_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {
         /*
          Java Pass By Value bir programlama dilidir
          Yani; bir primitive variable'i argument olarak bir method'a yollarsaniz
          Java o variable'i degil, degerini(value) method'a aktarir (pass)
         */

        double etiketFiyati=100;
        yuzdeonİndirimYap(etiketFiyati);
        yuzdeonİndirimYap(etiketFiyati);























    }

    public static void yuzdeonİndirimYap(double etiketFiyati) {

        etiketFiyati=etiketFiyati* 0.90;
        System.out.println("Sizin icin %10 indirimli fiyatimiz : " + etiketFiyati);
    }
}
