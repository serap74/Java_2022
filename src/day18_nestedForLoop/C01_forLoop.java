package day18_nestedForLoop;

public class C01_forLoop {
    public static void main(String[] args) {

        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        // ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)

        int input = 9;
        int faktoryel = 1;
        String faktoryelAcıkYazim = "";
        for (int i = input; i >= 1; i--) {

            faktoryel *= i;
            if (i == input) {

                faktoryelAcıkYazim = faktoryelAcıkYazim+ i;

            } else {
                faktoryelAcıkYazim =faktoryelAcıkYazim+"*" +i;


            }


        }
        System.out.println(input + "!=" + faktoryelAcıkYazim + "=" + faktoryel);
    }
}