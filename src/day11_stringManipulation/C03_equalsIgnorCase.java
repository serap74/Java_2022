package day11_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnorCase {
    public static void main(String[] args) {

        // kullaniciya derse katili katilmak istemedigini sorun
        // evet derse, cevabini ve  "derse katiliminiz onaylanmistir" yazdirin
        // hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("derse katilma ister misiniz? \nEvet veya Hayir yazin");
        String cevap = scan.next();

        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("cevabiniz : " + cevap + "derse katiliminiz onaylanmistir");

        } else if (cevap.equalsIgnoreCase("hayir")) ;{

            System.out.println("cevabiniz : " + cevap + "sonraki derslerimize bekleriz");
        }  }}





