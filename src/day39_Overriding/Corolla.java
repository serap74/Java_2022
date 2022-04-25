package day39_Overriding;

public class Corolla extends Toyota {

    protected String hiz="Corolla max 220 km hiz yapar";
    protected String yakit="corolla benzinli elektirikli";
    protected String model="Corolla";


    public void motor(){
        System.out.println("corolla araclar cevreci motor kullanir");


    }


    public void yakitTuketimi(){
        System.out.println("corolla 5.6 lt yakit tuketir");
    }




    public void vitesSayisi(){
        System.out.println("corolla 5 viteslidir");
    }

    public static void main(String[] args) {

        /* Dtata turu ve cons farkli oldugunda cons calistigi
        ıcın obje cons ın oldugu class ozelliklerini tasir
        ancak data turu farkli oldugundan (parent class
        secildigi icin) variableler data turunun secildigi class ve
        onun parent classlarından deger alabilir

        Methodlar icin ise yine data turunun oldugu classa gideriz
        ancak direk metodu calistirmadan once metod Override edilmis
        mi diye kontrol ederiz.
         */

        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket);//Araba clasindan aldik
        System.out.println(arb1.hiz);//Corolla
        System.out.println(arb1.yakit); // Corolla
        System.out.println(arb1.marka);//Toyota
        System.out.println(arb1.sirketMerkezi);//Toyota
        System.out.println(arb1.model); // Corolla
        arb1.motor();//corolla araclar cevreci motor kullanir




        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket);//Araba
        System.out.println(arb2.hiz);//Toyota
        System.out.println(arb2.yakit); // Araba
        System.out.println(arb2.marka);//Toyota
        System.out.println(arb2.sirketMerkezi);//Toyota
       // System.out.println(arb2.model); // CTE
        arb2.motor();//corolla araclar cevreci motor kullanir
        arb2.garanti();//toyota 10 yil garantilidir
        arb2.yakitTuketimi();//corolla 5.6 lt yakit tuketir
        //arb2.vites sayisi();(data turu olan toyotadan baslayınca
        //boyle metod bulamadık dolayisiyla


        Araba arb3=new Corolla();
        System.out.println(arb3.hareket);//Araba
        System.out.println(arb3.hiz);//Araba
        System.out.println(arb3.yakit); // Araba
        System.out.println(arb3.marka);//Araba
        //System.out.println(arb3.sirketMerkezi);//CTE
        //System.out.println(arb3.model); // CTE

        arb3.yakitTuketimi();//Corolla
        arb3.motor();//Corolla
        //arb3.garanti();//CTE armaya araba clasindan basladı ve metodu bulamadı
        //arb3.vitesSayisi(); CTE       "   "    "    "






    }
}
