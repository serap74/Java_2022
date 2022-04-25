package day43_garbaceAbstract;

public abstract class C04 {

     /*
    bir abstract class'da abstract veya concrete method'lar bulunabilir
    Child Class'larin abstract method'lari override etmesi MECBURI iken
                      concrete method'larin override edilmesi OPSIYONEL'dir
     */

    public abstract void absMethod1();

    public void  concereteMethod(){
        System.out.println("C04 concrete method");
    }

    public static void  concereteStaticMethod(){
        System.out.println("C04 concrete method");
    }



    public static void main(String[] args) {


         /*
        Abstract class'lar constructor'a sahiptir
        ancak Abstract class'lardan OBJE OLUSTURULAMAZ
       Abstract class'lar OBJE BARINDIRMAYAN,
       sadece child class'lar icin
       UYULMASI SART OLAN veya OPSIYONEL birakilan
       ozellikleri tanimladigimiz bir depo class gibidir
         */

        //C04 obj=new C04();
        System.out.println("bu class abstract");
        concereteStaticMethod();
    }
}
