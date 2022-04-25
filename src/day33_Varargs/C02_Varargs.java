package day33_Varargs;

public class C02_Varargs {
    public static void main(String[] args) {


        //parametre olarak bir int
        //ve istedigimiz kadar string olan
        //en uzun kelimenin harf sayisi ile int parametre degerini
        //carpip sonucu yazdiran bir method yazalim


        // // Bir method'da varargs disinda parametre kullanacaksak
        //        // once diger parametreleri yazip, varargs'i en sona yazmaliyiz
        //        // Bu sebeple bir method'da birden fazla varargs olamaz


        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";
        String str3="Ali";

        carpim(sayi,str1,str2,str3);


    }

    private static void carpim(int sayi, String str1, String... str) {
        String enUzunStr="";

        for (String each: str

             ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;
            }
        }

        System.out.println("istenen deger : " + sayi*enUzunStr.length());
    }
}
