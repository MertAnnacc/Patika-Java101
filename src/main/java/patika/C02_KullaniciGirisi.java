package patika;

import java.util.Scanner;

public class C02_KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,sifirlama,newPassword;

        Scanner input = new Scanner(System.in);
        System.out.print("Kulanıcı adını giriniz :");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz :");
        password = input.nextLine();

        if (userName.equals("Şafak") && password.equals("Başak")){
            System.out.println("Giriş Yaptınız");
        }else {
            System.out.println("Bilgiler yanlış");
            System.out.println("Bilgilerinizi değiştirmek ister misiniz?");
            System.out.println("1-Evet\n2-Hayır ");
            sifirlama =input.nextLine();

            if (sifirlama.equals("1")){
                System.out.println("Yeni şifrenizi giriniz");
                newPassword = input.nextLine();

                if (newPassword.equals("Başak")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz !");
                }else {
                    System.out.println("Şifre oluşturuldu");
                }

            }else {
                System.out.println("Hata");

            }

        }

    }



}
