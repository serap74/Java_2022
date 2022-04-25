package day23_arrayss;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {

        //arr[3]=8;// bu olmaz "main" java.lang.ArrayIndexOutOfBoundsException
        //arrayde olmayan bir indekse atama yapamayiz
        //arr={1,3,5,}  // var olan bir arraye ayni boyutta bile olsa direk yeni degerler iceren bir deger atayamayiz
       int arr[]={3,5,7,5,2};
       int eklenecekElement=1;

        arr= arrayeElemanEkle(arr,eklenecekElement);
        arr=arrayeElemanEkle(arr,5);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {
        int yeniArray[]=new int[arr.length+1]; // [0,0,0,0]
        for (int i = 0; i <arr.length ; i++) {
            yeniArray[i]=arr[i];
        }
        yeniArray[yeniArray.length-1]=eklenecekElement;
        return yeniArray;




    }
}



