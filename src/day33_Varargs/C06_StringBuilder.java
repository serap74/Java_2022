package day33_Varargs;

public class C06_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Prize dikkat");

        System.out.println(sb1.insert(12," edin."));

        String str ="Hayatta cok guzel seyler var";

        System.out.println(sb1.insert(0,  str,0,7));//HayattaPrize dikkat edin.


        System.out.println(sb1.reverse());//.nide takkid ezirPattayaH

        System.out.println(sb1.reverse());//HayattaPrize dikkat edin.

        System.out.println(sb1.substring(3,5));//at
        System.out.println(sb1);//HayattaPrize dikkat edin.

        System.out.println(sb1.subSequence(3,5));//at
        System.out.println(sb1);//HayattaPrize dikkat edin


    }
}
