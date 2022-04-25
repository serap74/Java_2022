package day17_forLoop;

public class C06_forLoop {
    public static void main(String[] args) {
        //verilen iki harf ve aralarındaki harfleri
       //yazdıran bir kod yazdırın

        char ilkHarf='c';
        char sonHarf='s';

        for (char i = ilkHarf; i <=sonHarf; i++) {
            System.out.print(i + "" );

        }

        double baslangic=10;
        double bitis=20;
        double artis=0.2;
        // baslangic ve bitis sayilari arasinda artis miktari ile olusacak
        // tum sayilari yazdirin
        for (double i = baslangic; i <=bitis ; i+=artis) {
            System.out.print(i + " ");

        }





    }
}
