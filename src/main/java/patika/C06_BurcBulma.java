package patika;

import java.util.Scanner;

public class C06_BurcBulma {
    //Koç Burcu : 21 Mart - 20 Nisan
    //Boğa Burcu : 21 Nisan - 21 Mayıs
    //İkizler Burcu : 22 Mayıs - 22 Haziran
    //Yengeç Burcu : 23 Haziran - 22 Temmuz
    //Aslan Burcu : 23 Temmuz - 22 Ağustos
    //Başak Burcu : 23 Ağustos - 22 Eylül
    //Terazi Burcu : 23 Eylül - 22 Ekim
    //Akrep Burcu : 23 Ekim - 21 Kasım
    //Yay Burcu : 22 Kasım - 21 Aralık
    //Oğlak Burcu : 22 Aralık - 21 Ocak
    //Kova Burcu : 22 Ocak - 19 Şubat
    //Balık Burcu : 20 Şubat - 20 Mart
    //  Ödev
    // Aynı örneği switch-case kullanmadan yapınız
    public static void main(String[] args) {

        int month,day;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay :");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün :");
        day = input.nextInt();

        if (month==1){
            if (day>=1 && day<=31){
                if (day<22){
                    System.out.println("Oğlak burcusunuz");
                }else {
                    System.out.println("Kova burcusunuz" );
                }
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }if (month==2){
            if (day>=1 && day<=28){
                if (day<20){
                    System.out.println("Kova burcusunuz");
                }else {
                    System.out.println("Balıkburcusunuz" );
                }
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }if (month==3){
            if (day>=1 && day<=31){
                if (day<21){
                    System.out.println("Balık burcusunuz");
                }else {
                    System.out.println("Koç burcusunuz" );
                }
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }if (month==4){
            if (day>=1 && day<=30){
                if (day<21){
                    System.out.println("Koç burcusunuz");
                }else {
                    System.out.println("Boğa burcusunuz" );
                }
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }if (month==5){
            if (day>=1 && day<=31){
                if (day<22){
                    System.out.println("Boğa burcusunuz");
                }else {
                    System.out.println("İkizler burcusunuz" );
                }
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }if (month==6){
            if (day>=1 && day<=30){
                if (day<23){
                    System.out.println("İkizler burcusunuz");
                }else {
                    System.out.println("Yengeç burcusunuz" );
                }
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }if (month==7){
            if (day>=1 && day<=31){
                if (day<23){
                    System.out.println("Yengeç burcusunuz");
                }else {
                    System.out.println("Aslan burcusunuz" );
                }
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }if (month==8){
            if (day>=1 && day<=31){
                if (day<23){
                    System.out.println("Aslan burcusunuz");
                }else {
                    System.out.println("Başak burcusunuz" );
                }
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }if (month==9){
            if (day>=1 && day<=30){
                if (day<23){
                    System.out.println("Başak burcusunuz");
                }else {
                    System.out.println("Terazi burcusunuz" );
                }
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }if (month==10){
            if (day>=1 && day<=31){
                if (day<23){
                    System.out.println("Terazi burcusunuz");
                }else {
                    System.out.println("Akrep burcusunuz" );
                }
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }if (month==11){
            if (day>=1 && day<=30){
                if (day<22){
                    System.out.println("Akrep burcusunuz");
                }else {
                    System.out.println("Yay burcusunuz" );
                }
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }if (month==12){
            if (day>=1 && day<=31){
                if (day<22){
                    System.out.println("Yay burcusunuz");
                }else {
                    System.out.println("Oğlak burcusunuz" );
                }
            }else {
                System.out.println("Hatalı giriş yaptınız");
            }
        }

    }
}
