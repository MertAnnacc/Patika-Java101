package patika;

import java.util.Scanner;

public class C14_ArtikYil {
    public static void main(String[] args) {
        int yil;

        Scanner scan = new Scanner(System.in);
        System.out.println("Yılı giriniz :");
        yil = scan.nextInt();

        if (yil % 400 == 0){
            System.out.println(yil + " bir artık yıldır !");
        } else {
            if (yil % 100 != 0 && yil % 4 == 0){
                System.out.println(yil + " bir artık yıldır !");
            }else {
                System.out.println(yil + " bir artık yıl değildir !");
            }


        }

    }
}
