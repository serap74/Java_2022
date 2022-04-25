package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C04_set {
    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>();


        isimler.add("Aykut");
        isimler.add("yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");

        System.out.println(isimler);//[Aykut, yusuf, Ilker, Oguzhan]

        isimler.set(1,"Seckin");// Yusuf gitti, yerine Seckin geldi
        System.out.println(isimler);//[Aykut, Seckin, Ilker, Oguzhan]

        // daha onceden listede var olanlari da arsiv gibi tutmak istersek

        List<String> logListesi=new ArrayList<>();//[Aykut, Seckin, Cosmos, Oguzhan]


        logListesi.add(isimler.set(2,"Cosmos"));

        System.out.println(isimler);//[Aykut, Seckin, Cosmos, Oguzhan]

        System.out.println(logListesi);//[Ilker]





    }
}
