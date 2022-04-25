package day15_methodCreation;

public class C07_methodCreation {
    public static void main(String[] args) {
        hosgeldinYazdir();








    }

    public static void kapanmaMethodu() {
        System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");

    }

    public static void hosgeldinYazdir() {
        System.out.println("hosgeldin");
        stringYazdir("boyle de olur");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}

