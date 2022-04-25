package day36_inheritance;

public class Memur extends Muhasebe{




    public static void main(String[] args) {

        Memur memur1=new Memur();
        //memur1 objesi memur clasininn objesi oimasina ragmen inherit ettigi muhasebe
        // ve onun da  pareti olan personel classlarindaki tüm datalari alabilir


        //bunlari personel clasindan aldik

        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="312574357886";

        //Muhasebe clasindan

        memur1.saatUcreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="Memur";

        System.out.println(memur1);

        Memur Memur2=new Memur();
        Memur2.persNo=1002;
        Memur2.saatUcreti=10;
        Memur2.maas= Memur2.maasHesapla();
        System.out.println(Memur2);
































    }


}
