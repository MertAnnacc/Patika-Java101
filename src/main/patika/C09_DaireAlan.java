package patika;

import java.util.Scanner;

public class C09_DaireAlan {
    public static void main(String[] args) {


        int r,a;
        double pi = 3.14;

        Scanner scan = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz :");
        r= scan.nextInt();
        System.out.println("Dairenin merkez açı ölçüsünü giriniz :");
        a = scan.nextInt();

        double alan = (pi*(r*r)*a)/360;

        System.out.println("Dairenin alanı :" + alan);
    }

}
