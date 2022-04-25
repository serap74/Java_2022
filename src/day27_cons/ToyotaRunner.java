package day27_cons;

public class ToyotaRunner {
    public static void main(String[] args) {

        Toyota t1=new Toyota();
        System.out.println(t1.marka);//toyota
        System.out.println(t1.tekerAdedi);//
        System.out.println(t1.model);//null
        t1.model="corolla";
        t1.yakit="benzin";
        t1.yil=2022;

        System.out.println("T1 model: " +t1.model+ ", yakit : " + t1.yakit + ", yil : " + t1.yil);
        t1.maxHiz();
        Toyota t2=new Toyota();
        System.out.println(t2.model);//null
        System.out.println(t2.marka);
        t2.model="Yaris";
        t2.yakit="benzin";
        t2.yil=2021;
        System.out.println("T2 model: " +t2.model+ ", yakit : " + t2.yakit + ", yil : " + t2.yil);
        t2.renkTercihleri();
    }
}
