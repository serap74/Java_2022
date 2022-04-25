package day07_IfStatement;

public class C02_IfStatements {
    public static void main(String[] args) {
        int a=10;
        int b= 20;

        if (a>b && b<100) {
            System.out.println("istediniz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");
        }
        if (a<0)
            System.out.println("suslu parantez olmazsa sadece bir satir calisir");
        System.out.println("ikinci satir calisti");

        // bir if cumlesinin daha anlasilir olmasini istiyorsaniz
        // if body'sini {} icine yazmalisiniz
        // body'yi {} icine yazmazsak da if cumlesi calisir
        // ancak ilk ; gordugunde if cumlesi bitmis olur
        // 24.satirdaki kod 15.satirdaki if dogru olsada calisir false olsa da calisir


    }
}
