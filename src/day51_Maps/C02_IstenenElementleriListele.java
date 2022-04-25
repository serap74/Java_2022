package day51_Maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C02_IstenenElementleriListele {

     /*
    Soru 2 ) Verilen map’te istenen programlama dilini bilen kisileri
    list olarak donduren bir method yaziniz.
    map {    101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
    Istenen dil  java
    Sonuc  [Ali, Veli]
     */

    public static void main(String[] args) {

        Map<Integer,String> sinifMap= MapOlustur.myMap();
        String istenenDil="Java";
        List<String> istenenDiliBilenlerListesi=istenenDiliBilenlerListesiOlustur(sinifMap,istenenDil);

    }

    public static List<String> istenenDiliBilenlerListesiOlustur(Map<Integer, String> sinifMap, String istenenDil) {

        List<String>istenenDiliBilenlerListesi=new ArrayList<>();

        Collection<String > sinifValueColl=sinifMap.values();

        List<String>sinifValueList=new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);


        int outerArrayBoyut=sinifValueList.size();

        String ilkValue=sinifValueList.get(0);

        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {
            String temp[]=sinifValueList.get(i).split(",  ");
            for (int j = 0; j < innerArrayBoyut; j++) {

                valueMDArr[i][j]=temp[j];


            }
        }

        System.out.println(Arrays.deepToString(valueMDArr));

        for (int i = 0; i < outerArrayBoyut; i++) {


                if(valueMDArr[i][2].equals(istenenDil)){
                 istenenDiliBilenlerListesi.add(valueMDArr[i][0]);

                }

            }





        return istenenDiliBilenlerListesi;
    }


}
