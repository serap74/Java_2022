package day48_Collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {

    //verilen bir arrayi tekrar eden elementlerini
    //sadece bir kere yazdiran bir method olusturun
    public static void main(String[] args) {

        Integer arr[]= {3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arrayiTekrarsizYap(arr);
    }

    private static void arrayiTekrarsizYap(Integer[] arr) {

        Set<Integer> tekrarsizElementKumesi= new HashSet<>();

        for (Integer each:(arr)
             ) {
            tekrarsizElementKumesi.add(each);

        }
        System.out.println(tekrarsizElementKumesi);
    }
}
