package patika;

import java.util.Scanner;

public class C10_VucutKitleEndeks {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu giriniz :");
        boy = scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        kilo = scan.nextDouble();

        double endeks = kilo/(boy*boy);

        System.out.println("Vücut kitle endeksi :" + endeks);
    }
}
