package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_maps {
    public static void main(String[] args) {
        //Javada coolection uyesi bir yapıda
        //data turu Object secilirse her data turunden deger ekleyebiliriz
        //ancak bu durumda surekli casting prob yasariz
        List<Object> list=new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);

        System.out.println(list);
        list.set(1,(Integer)(list.get(1)) +10);

        Map<Integer,String > sinifList=new HashMap<>();
        //Bir siifta ogrenci no ve isim,soyisim,brans
        //olarak map olusturmak istiyoruz
        //key tek bir unique degerdir
        //ama value/deger birden fazla bilginin birlseiminden olusabilir
        //bu durumda daha sonra istedigimiz bilgilere dogru sekilde ulsabilmek icin
        //tum elementler icin value ayni bicimde olusturulmalidir
        //veri siralama ve sekilsel acidan


        sinifList.put(101,"Ali,Can,Dev");
         sinifList.put(102,"Veli,Yan,QA");
         sinifList.put(103,"Ali,Yan,C#");

        System.out.println(sinifList);


        System.out.println(sinifList.keySet());//[101, 102, 103]
        System.out.println(sinifList.values());




    }
}
