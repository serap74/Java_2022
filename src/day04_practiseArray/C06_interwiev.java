package day04_practiseArray;

import java.util.Arrays;
import java.util.Scanner;

public class C06_interwiev {
    public static void main(String[] args) {


         /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str=scan.nextLine();

        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int sayac=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i-1].equals(arr[i])){
                sayac++;
            } else{
                System.out.println(arr[i-1] + "sayisi " + (sayac+1));
                sayac=0;
            }
            if(i==arr.length-1){
                System.out.println(arr[i] + "sayisi " + (sayac+1));
            }
        }





    }
}
