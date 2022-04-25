package day03_scanner;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan yaricap isteyip
        // cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen cemberin yaricapini giriniz");
        double yariCap=scan.nextDouble();
        System.out.println("girdiginiz yaricap : " + 2*3.14*yariCap);
        System.out.println("dairenin alani :" + 3.14* yariCap*yariCap);



    }
}
