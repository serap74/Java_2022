package day25_list;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {

        // Verilen bir listede, istenen iki index'deki elementlerin yerini
        // kalici olarak degistiren bir method olusturun
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkIndex = 2;
        int ikinciIndex = 5;

        sayilar= swapElements(sayilar,ilkIndex,ikinciIndex);

    }

    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {

        int temp=0;
        if((ilkIndex > sayilar.size() - 1 || (ikinciIndex >sayilar.size() - 1||ilkIndex<0 || ikinciIndex<0))){
            System.out.println("lutfen gecerli bir index girin");
        } else {

            temp=sayilar.get(ilkIndex);

            sayilar.set(ilkIndex,sayilar.get(ikinciIndex));
            sayilar.set(ikinciIndex,temp);
        }



        return sayilar;
    }
}