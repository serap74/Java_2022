package day40_overridingPolimorfizm;

public class C01 {

    public void method1(){
        System.out.println("parent method 1 ");
    }
    protected void method2(){
        System.out.println("parent method 2 ");
    }
    protected String method3 (){
        return "Parent Java";
    }
    private void method4(){
        System.out.println("Parent method4");
    }
}
