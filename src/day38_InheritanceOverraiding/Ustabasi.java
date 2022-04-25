package day38_InheritanceOverraiding;

public class Ustabasi extends Isci{

    public String  statu="Ustabasi";
    public String haklar="Ustabasi haftada bir gun ekstra tatil hakkina sahiptir";

    public void mesai(){

        System.out.println("Ariza varsa ustabasi ekstra ucret almadan calisir");
    }


    public void maasHesaplan(){

        System.out.println("Ustabasi 30 gun * 8 saat *  12 Euro = "+ (30*8*10) +  "euro maas alir");


    }

    public static void main(String[] args) {

        Ustabasi yasin =new Ustabasi();
        System.out.println(yasin.statu);//Ustabasi
        System.out.println(yasin.haklar);//Ustabasi haftada bir gun ekstra tatil hakkina sahiptir
        System.out.println(yasin.ikramiye);//Isciler yilda 1 ikramiye alir
        System.out.println(yasin.izin);//Tum personel yilda 4 hafta izin kullanabilir
        yasin.maasHesaplan();
        yasin.mesai();

        Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statu);//Isci
        System.out.println(ahmet.haklar);//Isciler kidem tazminati alirlar
        System.out.println(ahmet.ikramiye);//Isciler yilda 1 ikramiye alir
        System.out.println(ahmet.izin);//Tum personel yilda 4 hafta izin kullanabilir
        ahmet.maasHesaplan();
        ahmet.mesai();

        Personel adem=new Ustabasi();
        System.out.println(adem.statu);//Isci
        System.out.println(adem.haklar);//Isciler kidem tazminati alirlar
        //System.out.println(adem.ikramiye);//Cte
        System.out.println(adem.izin);//Tum personel yilda 4 hafta izin kullanabilir
        adem.maasHesaplan();
        adem.mesai();

    }
}
