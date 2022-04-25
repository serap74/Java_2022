package day16_methodCreation;

public class C03_overLoading {
    public static void main(String[] args) {


        // verilen iki sayiyi toplayip yazdiran bir method olusturalim

        int a=10;
        int b=20;
        ikiSayiTopla(a,b);


        // iki double sayinin toplamini yazdiran bir method olusturalim

        double x=3.4;
        double y=5.6;
        ikiDoubleSayiTopla(x,y);

        // eger variable olusturmadan direk sayilari yazarak method call yaparsam




        // bir integer ile bir double toplamini yazdiran bir method olusturalim
        int i=5;
        double j=7.0;
        sayiTopla(i,j);



    }

    private static void sayiTopla(int i, double j) {
        System.out.println("iki sayinin toplami : " + (i+j));

    }


    private static void ikiDoubleSayiTopla(double x, double y) {
        System.out.println("iki double sayinin toplami : " + (x+y));

    }

    public static void ikiSayiTopla(int a, int b) {

        System.out.println("iki sayinin toplami : " + (a+b));
    }

}
