package day23_arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {

        //kullanicidan kac elementlik bir aarray olusturacagını sorun
        //arrayi olusturup elemenleri kullanıcıdan alıp arraya atayın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kac elementli bir array istediginizi yaziniz");

        int uzunluk=scan.nextInt();//5 yazdıysa


        int arr[]=new int[uzunluk];//[0,0,0,0,0];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array icin "+ (i+1) +". elemani girin");

            System.out.println(Arrays.toString(arr));




        }






    }
}
