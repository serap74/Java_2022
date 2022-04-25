package day27_cons;

public class StaticKeyword {

    static  int sayi1;
    int sayi2;

    public static void main(String[] args) {
        System.out.println("sayi1 : " +sayi1);

        //System.out.println("sayi1 :" +sayi2);//static olmadigi icin main den direk kullanılamaz

        StaticKeyword obj1= new StaticKeyword();
        System.out.println(obj1.sayi2);//0


        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1 : " +sayi1);//1
        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//1


        StaticKeyword obj2=new StaticKeyword();
        System.out.println(obj2.sayi2);//0
        System.out.println(obj2.sayi1);//1

        //static variableler direk clasa baglıdır verilen son degerini alır
        //class icinde yapılan her turlu degısıklır static variablelerde kalici olur
        //ınstance variableler ise objeye baglıdır objenin degerini alır
        //ınstance variablelere sadce obje uzerinden erisilebilir ve bir obje uzerinden erisilerek yapılan degisiklik
        // ins variablenin degerini kalıcı olarak degirstirmez sadce o obje icin instance variable degerini kalici olarak degistirir

        obj2.sayi1++;
        obj2.sayi2++;

        System.out.println(obj2.sayi1);//1
        System.out.println(obj2.sayi2);//2


        System.out.println(obj1.sayi1);//2
        System.out.println(obj1.sayi2);//1


        obj1.sayi1++;
        obj1.sayi2++;


        System.out.println(obj1.sayi1);//3
        System.out.println(obj1.sayi2);//2

        System.out.println(obj2.sayi1);//1
        System.out.println(obj2.sayi2);//3
    }
}
