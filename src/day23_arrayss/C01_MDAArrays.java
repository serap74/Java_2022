package day23_arrayss;

import java.util.Arrays;

public class C01_MDAArrays {
    public static void main(String[] args) {

        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);
        System.out.println(arr[1][1]);

        //ilk inner arr nin tum elementlerini yazdirin
        System.out.println(arr[0]);//direk yazdıramayız
        System.out.println(Arrays.toString(arr[0]));//[3,1,7]


        System.out.println(Arrays.toString(arr));//[[I@511baa65, [I@340f438e]

        // MDA array de tum elementşleri bir aray olarak yazdırmak istersek

        Arrays.deepToString(arr);
        System.out.println(Arrays.deepToString(arr));//[[3, 1, 7], [6, 10, 2]]




    }
}
