package day23_arrayss;

public class C02_MDAArraya {
    public static void main(String[] args) {

        //tum elementlerin toplamini bulunuz

        int arr[][] = {{3, 1, 7,5}, {6, 10, 2}};
        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                toplam+=arr[i][j];

            }
            System.out.println("arraydaki elementlerin toplami : " + toplam);
        }






















    }}




