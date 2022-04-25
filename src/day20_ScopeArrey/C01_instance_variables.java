package day20_ScopeArrey;

public class C01_instance_variables {
    int sayi;
    String bransIsmi="Java";
    boolean okuldaMi;





    public static void main(String[] args) {

        // sayi=10;  sayi variable'i static olmadigi icin main method'dan direk kullanilamaz
        // instance variable'lara static method'lardan ulasabilmek icin obje olusturmamiz gerekir

        C01_instance_variables obj1= new C01_instance_variables();
        System.out.println(obj1.sayi); // 0


        obj1.sayi=10;
        System.out.println(obj1.sayi); // 10


        obj1.bransIsmi="SQL";
        System.out.println(obj1.okuldaMi); // false


        C01_instance_variables obj2=new C01_instance_variables();
        System.out.println(obj2.sayi); // 0
        System.out.println(obj2.bransIsmi); // Java


        obj1.okuldaMi=true;
        System.out.println(obj2.okuldaMi); //false

    }
}
