package day20_ScopeArrey;

public class C02_Static_Variables {
 /* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
  ogrenci notlari veya ogretmen branslari gibi
  bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz
  Static variabler ise class variable olarak tanimlanir
  ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
  eger static variable'in degeri degistirilirse herkes icin degisir
     */


    static String okulIsmi="Yildiz Koleji";
    static int okulNo=102;
    static boolean okulAcikMi;


    public static void main(String[] args) {
        System.out.println(okulIsmi); //yıldız koleji
        System.out.println(okulNo);//102
        System.out.println(okulAcikMi);

        staticMethod();

        System.out.println(okulNo);//200



    }

    public static void staticMethod(){
        okulNo=102;
        System.out.println(okulNo);//102
    }
}
