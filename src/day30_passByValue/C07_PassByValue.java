package day30_passByValue;

import java.util.Arrays;

public class C07_PassByValue {
    public static void main(String[] args) {


            int arr[]={1,2,3};
            System.out.println(Arrays.toString(arr));


            arrDegistirr(arr);
        System.out.println("method call sonrasi : " + Arrays.toString(arr));// [1, 2, 3]
    }

    private static void arrDegistirr(int[] arr) {

        arr= new int[5];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]
    }
}
