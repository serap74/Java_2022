package day33_Varargs;

public class C04_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Yasasin Java");
        System.out.println(sb1.indexOf("Java"));

        System.out.println(sb1.lastIndexOf("s"));

        System.out.println(sb1.replace(0,7,"Ne güzel" ));
        System.out.println(sb1);

        System.out.println(sb1.toString().toUpperCase());//NE GUZEL JAVA

        System.out.println(sb1);// Ne guzel Java

        System.out.println(sb1.delete(0,3));// guzel Java

        System.out.println(sb1.deleteCharAt(5));// guzelJava

    }
}
