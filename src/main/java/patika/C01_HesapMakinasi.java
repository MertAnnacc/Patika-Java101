package patika;

import java.util.Scanner;

public class C01_HesapMakinasi {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input =  new Scanner(System.in);
        // First number
        System.out.print("İlk sayıyı giriniz :");
        n1= input.nextInt();
        // Second Number
        System.out.print("İkinci sayıyı giriniz");
        n2= input.nextInt();
        // İşlem Seçimi
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz :");
        select = input.nextInt();

        switch(select) {
            case 1:
                System.out.println("Sonuç :" + (n1+n2));
                break;
            case 2:
                System.out.println("Sonuç :" + (n1-n2));
                break;
            case 3:
                System.out.println("Sonuç :" + (n1*n2));
                break;
            case 4:
                if (n2 != 0){
                    System.out.println("Sonuç :" + (n1/n2));
                }
                else {
                    System.out.println("Hata! Sıfıra bölünmez");
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
        }





    }
}
