
public class Main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.


        /*
        Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

        Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

         Harmonik Seri Formülü : 1 + 1/2 + 1/3 + 1/4...


         */

        int[] sayilar = {1,2,3,4,5};

        int toplam = 0;

        for(int i =0 ; i< sayilar.length; i++){

            toplam += sayilar[i];
        }

        System.out.println(toplam/ sayilar.length);


    }

}
