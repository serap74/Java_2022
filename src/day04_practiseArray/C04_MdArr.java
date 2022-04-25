package day04_practiseArray;

public class C04_MdArr {
    public static void main(String[] args) {

        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int multiArr[][]={{1,3,6},{2,8},{5,7,9,14}};

        System.out.println("multidimensional arrayin cift elemanlari toplami = " + cıftElToplam(multiArr));

    }

    public static int cıftElToplam(int arr [][]){

        int sum=0;

        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j]%2==0){
                    sum+=arr[i][j];
                }

            }

        }



        return sum;




    }










}






