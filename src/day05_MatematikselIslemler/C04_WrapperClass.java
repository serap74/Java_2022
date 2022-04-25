package day05_MatematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        // primitive data turu ile non-primitive
        // arasindaki farklar nelerdir ?

        String str= "Java";
        int sayi=10;
        System.out.println(str.toUpperCase());

        double sayi2=20.5;
        // sayi2 primitive oldugundan sayi2. dedigimizde hic bir method gelmez

        Double sayi3=15.2;
        // sayi3 wrapper Class olan Double class'ini kullandigindan
        // sayi3. dedigimizde bircok method gelir


    }
}
