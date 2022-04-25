package day23_arrayss;

import java.util.Scanner;

public class C07_Arrays {
    public static void main(String[] args) {

        //Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle girin");
        String cumle= scanner.nextLine();


        String arr[]=cumle.split(" ");


        System.out.println("girdiginiz cumledeki kelime sayisi : " + arr.length);
    }
}
