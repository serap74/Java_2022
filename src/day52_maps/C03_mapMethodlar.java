package day52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_mapMethodlar {
    public static void main(String[] args) {
        Map<String,Integer> myMap = new HashMap<>();
        myMap.put("H",3);
        myMap.putIfAbsent("K",5);


        System.out.println(myMap.putIfAbsent("A",6));
        System.out.println(myMap.putIfAbsent("K",20));

        if(myMap.putIfAbsent("K",20)!=null){
            System.out.println("Girdiginiz Key Map te zaten var");
        }
        System.out.println(myMap);

      myMap.put("A",10);
        System.out.println(myMap);

        myMap.computeIfAbsent("A", v -> 20);
        System.out.println(myMap);

        myMap.compute("A",(key,value) -> 20);
        System.out.println(myMap);

        //H nin degerini 2 katinin 5  fazlasi yapalim
        myMap.compute("H", (key,value) -> (2*value+5));
        System.out.println(myMap);

    }
}
