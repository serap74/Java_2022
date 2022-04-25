package day30_passByValue;

public class C01_StaticBloks {
    static{
        System.out.println("static block2 calisti");

    }

    static {

        /*
        static block class ilk calismaya basladiginda devreye girer
        ve class'in calismasi icin gerekli on hazirliklar icin kullanilir
        yazildigi satirin hic bir onemi yoktur, class icerisinde istenen yerde yazilabilir
        static block birden fazla olursa, bloklar yukaridan asagi dogru sirayla calisir
         */
            System.out.println("static block1 calisti");
    }


    C01_StaticBloks(){
        System.out.println("Consructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBloks obj1;
        new C01_StaticBloks();
        System.out.println("main method sonu");
    }






















}

