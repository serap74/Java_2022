package day39_Overriding;

public class OverridingChild extends OverridingParent{



    public  void method1(){
        System.out.println("Child class method1");


    }

    public static void main(String[] args) {


        /*bir obje olusturulurken data turu ve cons ayni classtan secilmisse java
        direk o clasa gider hem variable hem de metod icin o class da varsa kullanir
        yoksa o classin parentlarina bakar*/



        OverridingChild obj1=new OverridingChild();
        obj1.method1();//Child class method1
        obj1.method2();//Parent class method2


        OverridingParent obj3=new OverridingParent();
        obj3.method2();//Parent class method2
        obj3.method1();//Parent class method2

        /*

        eger data turu parent cons child class dan secilmisse variablelerda yukaridaki
        sekilde calisma devam eder ancak metodlar icin data turunun oldugu classdaki method
        child class tarafindan override edilmis mi diye kontrol etmemiz gerekir
        eger child classlarda bu method override edilmisse override eden method calisir
         */

        OverridingParent obj2=new OverridingChild();
        obj2.method2();//Parent class method2
        obj2.method1();//Child class method1

    }
}
