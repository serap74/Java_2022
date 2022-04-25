package day27_cons;

public class Toyota {
    String marka="Toyota";
    int tekerAdedi=4;
    boolean motorVarMi=true;
    String model;
    String yakit;
    int yil;


    public void maxHiz(){
        if (yakit.equals("benzin")){
            System.out.println("benzinli araclar maksimum 240 km hiz yapar");
        }else if (yakit.equals("dizel")){
            System.out.println("dizel araclar maksimum 260 km hiz yapar");
        }
    }

    public void renkTercihleri(){
        if ( model.equals("Corolla")){
            System.out.println("corolla renk secenekleri kirmizi ve beyaz");
        }else if(model.equals("Yaris")){
            System.out.println("yaris ici renk secenekleri sari ve yesil");

        }
    }





}
