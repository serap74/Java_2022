package day04_practiseArray;

import java.util.Arrays;

public class C01_array {
    public static void main(String[] args) {

        /*
        bir int dizisi verildi ve elemanların karelerini bulun
        (Verilen bir dizi dizinin elemanlarının karelerini bulun )
        Örnek:{2,6,4,5,8,9}
        çıktı:{4,36,16,25,64,81}
        */

        int arr[]={2,3,4,5,6,7,};

        for (int i = 0; i < arr.length; i++) {
            arr[i] *=arr[i];
            System.out.print("elemanlarin karesi :" + Arrays.toString(arr));

        }



        }

    }

