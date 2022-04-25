package day51_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_mapss {

     /*
    Soru 1 ) Verilen bir String’deki harfleri
    ve harflerin kacar kez kullanildigini return eden bir method yaziniz
    Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3
     */
     public static void main(String[] args) {

         String input="Hellooo";
         String harflerArr[]=input.split( "");

         Map<String,Integer> kullanilanSayilar=new HashMap<>();

         for (String each:harflerArr
              ) {
             if(kullanilanSayilar.containsKey(each)){

                 kullanilanSayilar.put(each , kullanilanSayilar.get(each)+1);

             }else {
                 kullanilanSayilar.put(each,1);


         }

         }
         System.out.println(kullanilanSayilar);
     }

}
