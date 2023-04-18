package patika;

public class C07_ElemanOrtalamaBulma {

    // Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
    //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

    public static void main(String[] args) {

        int[] list = {1,2,3,4,5};
        double series =0.0;

        for (int i = 0; i <list.length ; i++) {
            series+= (1/list[i]);

        }
        double average = ((list.length)/series);

        System.out.println("Harmonik ortalama :" +average);

    }
}
