package patika;

import java.util.Scanner;

public class C13_CinZodyagi {
    public static void main(String[] args) {
        /*
        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        Doğum Tarihi %12 = 0 ➜ Maymun

        Doğum Tarihi %12 = 1 ➜ Horoz

        Doğum Tarihi %12 = 2 ➜ Köpek

        Doğum Tarihi %12 = 3 ➜ Domuz

        Doğum Tarihi %12 = 4 ➜ Fare

        Doğum Tarihi %12 = 5 ➜ Öküz

        Doğum Tarihi %12 = 6 ➜ Kaplan

        Doğum Tarihi %12 = 7 ➜ Tavşan

        Doğum Tarihi %12 = 8 ➜ Ejderha

        Doğum Tarihi %12 = 9 ➜ Yılan

        Doğum Tarihi %12 = 10 ➜ At

        Doğum Tarihi %12 = 11 ➜ Koyun
         */

        int dogumYili;

        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz :");
        dogumYili = scan.nextInt();

        int ZodiacIndex = dogumYili % 12 ;
        String zodiac;

        switch (ZodiacIndex){
            case 0 :
                zodiac = "Maymun";
                break;
            case 1 :
                zodiac = "Horoz";
                break;
            case 2 :
                zodiac = "Köpek";
                break;
            case 3 :
                zodiac = "Domuz";
                break;
            case 4 :
                zodiac = "Fare";
                break;
            case 5 :
                zodiac = "Öküz";
                break;
            case 6 :
                zodiac = "Kaplan";
                break;
            case 7 :
                zodiac = "Tavşan";
                break;
            case  8 :
                zodiac = "Ejderha";
                break;
            case 9 :
                zodiac = "Yılan";
                break;
            case 10 :
                zodiac = "At";
                break;
            case 11 :
                zodiac = "Koyun";
                break;
            default:
                zodiac = "Hata";
                break;
                }
        System.out.println("Çin Zodyağı burcunuz : " + zodiac);
        }


    }

