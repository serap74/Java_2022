package day32_dateTime;


import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime tm= LocalTime.now();
        System.out.println("tm = " + tm);//tm = 22:21:29.867614100

        //bir islemin ne kadar surede bittigini bulmak istersek islemden once ve sonra birer time objesi olusturup aradaki farki hesaplayabiliriz
        int sayi=0;
        for (int i = 0; i < 100000; i++) {
            sayi+=i;
        }
        LocalTime tmLoopSonrasi= LocalTime.now();
        System.out.println("tmLoopSonrasi = " + tmLoopSonrasi);//tmLoopSonrasi = 22:21:29.883234400

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();
        System.out.println("islem " + (nano2-nano1) + "nanosaniyede bitti");//islem 1.56203E7nanosaniyede bitti


        //ileri veya geriye giebiliriz
        System.out.println(tm.plusMinutes(1000));//15:01:29.867614100


        //istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz




   
   
   
   
   
   
   
   
   
   
   
   
   
    }
   
    
    
    
}
