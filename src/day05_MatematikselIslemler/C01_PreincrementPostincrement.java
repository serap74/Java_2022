package day05_MatematikselIslemler;

public class C01_PreincrementPostincrement {
    public static void main(String[] args) {
        int sayi=10;
        sayi++;
        System.out.println("pre-incrementten once "+ sayi); // 12

        System.out.println("pre-increment satirinda " +  ++sayi); // 13 once artir sonra yazdir

        System.out.println("pre-incrementden sonra "     +      sayi); // 13

        System.out.println("post-increment satirinda " + sayi++ ); //13 once yazdir sonra artir

        System.out.println("post increment satirindan sonra " + sayi); //14






    }
}
