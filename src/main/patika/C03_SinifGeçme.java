package patika;

import java.util.Scanner;

public class C03_SinifGeçme {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;

        Scanner not = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz :");
        mat = not.nextInt();


        System.out.print("Fizik notunuzu giriniz :");
        fizik = not.nextInt();


        System.out.print("Kimya notunuzu giriniz :");
        kimya = not.nextInt();


        System.out.print("Türkçe notunuzu giriniz :");
        turkce = not.nextInt();


        System.out.print("Müzik notunuzu giriniz :");
        muzik = not.nextInt();

        if (mat > 0 && mat < 100 && fizik > 0 && fizik < 100 && kimya > 0 && kimya < 100 && turkce > 0 && turkce < 100 && muzik > 0 && muzik < 100) {

            double ortalama = (mat + fizik + kimya + turkce + muzik) / 5;
            System.out.println("Ortalamanız :" + ortalama);


            if (ortalama <= 55) {
                System.out.println("Sınıfta kaldınız,seneye görüşmek üzere ");
            } else {
                System.out.println("Tebikler,sınıfı geçtiniz");
            }
        } else {
            System.out.println("Notlarınız 0 ile 100 arasında olmalı!");
        }

    }
}

