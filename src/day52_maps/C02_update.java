package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_update {
    public static void main(String[] args) {

        //verilen map2'daki tum branslari java yapalim

        Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);

        Set<Map.Entry<Integer,String>> sinifEntrySeti=sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each : sinifEntrySeti
             ) {
            Integer keyEntry=each.getKey();
            String valueEntry=each.getValue();
            String valueArr[]=valueEntry.split(", ");
            valueArr[2]="Java";
            String valueYeni=valueArr[0] + ", " + valueArr[1] + ", " + valueArr[2];
            sinifListMap.put(keyEntry,valueYeni);
        }
        System.out.println(sinifListMap);
    }
}
