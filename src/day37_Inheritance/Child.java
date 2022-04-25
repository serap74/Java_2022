package day37_Inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    //bir classi child class yaptigimizda parent clasindaki cons a ulasmasi gerekir
    //bu durumda parent classdaki cons un acces modifieri uygun bir modifier yapilmalidir




    Child(){
        super();
        System.out.println("child class parametresiz cons");
    }

    Child(int s){
        //Child class da tum cons larin ilk satirina javanin yerlestirdigi
        // con parametresizdir(super)

        System.out.println( "Child class parametreli cons ");
    }

    Child(int sayi1, int sayi2){

        //eger parent class dan parametresiz cons degil de baska bir cons
        //calistirmak isterseniz bunu child classdaki cons un ilk satirina
        //yazmalisiniz


        super(sayi1,sayi2);
        System.out.println("iki parametreli cons");
    }

    public static void main(String[] args) {
        Child child=new Child( 5,8);


    }
}
