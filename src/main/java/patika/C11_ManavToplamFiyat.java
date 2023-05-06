package patika;

import java.util.Scanner;

public class C11_ManavToplamFiyat {
    /*
    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
    toplam tutarını ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
     */

    public static void main(String[] args) {
        double armutFiyat = 2.14,elmaFiyat = 3.67,domatesFiyat = 1.11,muzFiyat = 0.95,patlicanFiyat = 5.00;
        double armut,elma,domates,muz,patlican,toplamFiyat;

        // Kullanıcıdan satın alınan miktarları isteyelim
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç kilo armut aldınız?");
        armut = scan.nextDouble();

        System.out.println("Kaç kilo elma aldınız?");
        elma = scan.nextDouble();

        System.out.println("Kaç kilo domates aldınız?");
        domates = scan.nextDouble();

        System.out.println("Kaç kilo muz aldınız?");
        muz = scan.nextDouble();

        System.out.println("Kaç kilo patlıcan aldınız?");
        patlican = scan.nextDouble();

        // Toplam fiyatları bulalım

        armutFiyat*=armut;
        elmaFiyat*=elma;
        domatesFiyat*=domates;
        muzFiyat*=muz;
        patlicanFiyat*=patlican;
        toplamFiyat = armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat;

        System.out.println("Toplam Tutar :" + toplamFiyat);







    }
}
