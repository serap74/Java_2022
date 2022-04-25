package day38_InheritanceOverraiding;

public class Isci extends Personel {
    public String  statu="Isci";
    public String haklar="Isciler kidem tazminati alirlar";
    public String ikramiye="Isciler yilda 1 ikramiye alir";

    public void mesai(){

        System.out.println("Tum isciler haftalik 40 saat calisir");
    }


    public void maasHesaplan(){

        System.out.println("Tum isciler 30 gun * 8 saat *  11 Euro = + (30*8*10) + euro maas alir");
    }
}
