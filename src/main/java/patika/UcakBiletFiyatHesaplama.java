package patika;

import java.util.Scanner;

public class UcakBiletFiyatHesaplama {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
         sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        int mesafe, yas, yolculukTip;
        double normalFiyat, yolTipFiyat, yasIndirimliFiyat, dubleIndirimliFiyat, toplamFiyat, indirimliFiyat;

        Scanner scan = new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi giriniz :");
        mesafe = scan.nextInt();

        System.out.println("Yaşınızı giriniz :");
        yas = scan.nextInt();

        System.out.println("Tek yön ise 1'i , Gidiş-Dönüş ise 2 değerini giriniz :");
        yolculukTip = scan.nextInt();

        normalFiyat = mesafe * 0.10;

        if (mesafe > 0 && yas > 0 && yas < 130 && yolculukTip == 1 || yolculukTip == 2) {

            if (yas < 12) {
                if (yolculukTip == 1) {
                    yasIndirimliFiyat = normalFiyat * 0.5;
                    System.out.println("Yolculuk fiyatı :" + yasIndirimliFiyat);
                } else if (yolculukTip == 2) {
                    yasIndirimliFiyat = normalFiyat * 0.5;
                    yolTipFiyat = normalFiyat * 0.2;
                    dubleIndirimliFiyat = normalFiyat - yasIndirimliFiyat - yolTipFiyat;
                    toplamFiyat = dubleIndirimliFiyat * 2;
                    System.out.println("Yolculuk fiyatı : " + toplamFiyat);

                } else {
                    System.out.println("Hatalı Veri Girdiniz !");
                }
            }

            if (yas > 12 && yas < 24) {
                if (yolculukTip == 1) {
                    yasIndirimliFiyat = normalFiyat * 0.9;
                    System.out.println("Yolculuk fiyatı :" + yasIndirimliFiyat);
                } else if (yolculukTip == 2) {
                    yasIndirimliFiyat = normalFiyat * 0.1;
                    yolTipFiyat = normalFiyat * 0.2;
                    dubleIndirimliFiyat = normalFiyat - yasIndirimliFiyat - yolTipFiyat;
                    toplamFiyat = dubleIndirimliFiyat * 2;
                    System.out.println("Yolculuk fiyatı : " + toplamFiyat);

                } else {
                    System.out.println("Hatalı Veri Girdiniz !");
                }
            }

            if (yas > 24 && yas < 65) {
                if (yolculukTip == 1) {
                    System.out.println("Yolculuk fiyatı :" + normalFiyat);
                } else if (yolculukTip == 2) {
                    yolTipFiyat = normalFiyat * 0.2;
                    indirimliFiyat = normalFiyat - yolTipFiyat;
                    toplamFiyat = indirimliFiyat * 2;
                    System.out.println("Yolculuk fiyatı : " + toplamFiyat);

                } else {
                    System.out.println("Hatalı Veri Girdiniz !");
                }
            }

            if (yas > 65) {
                if (yolculukTip == 1) {
                    yasIndirimliFiyat = normalFiyat * 0.7;
                    System.out.println("Yolculuk fiyatı :" + yasIndirimliFiyat);
                } else if (yolculukTip == 2) {
                    yasIndirimliFiyat = normalFiyat * 0.3;
                    yolTipFiyat = normalFiyat * 0.2;
                    dubleIndirimliFiyat = normalFiyat - yasIndirimliFiyat - yolTipFiyat;
                    toplamFiyat = dubleIndirimliFiyat * 2;
                    System.out.println("Yolculuk fiyatı : " + toplamFiyat);

                } else {
                    System.out.println("Hatalı Veri Girdiniz !");
                }
            }


        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
