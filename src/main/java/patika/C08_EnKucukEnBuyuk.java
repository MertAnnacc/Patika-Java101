package patika;

import java.util.Arrays;
import java.util.Scanner;

public class C08_EnKucukEnBuyuk {
    //Dizi : {15,12,788,1,-1,-778,2,0}
    //Girilen Sayı : 5
    //Girilen sayıdan küçük en yakın sayı : 2
    //Girilen sayıdan büyük en yakın sayı : 12
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int[] arr={15,12,788,1,-1,-778,2,0};
        int number, min=arr[0], max=arr[0];

        System.out.print("Lütfen bir sayı giriniz :");
        number=input.nextInt();
        int[] newArr={15,12,788,1,-1,-778,2,0,number};
        Arrays.sort(newArr);
        min=newArr[Arrays.binarySearch(newArr,number)-1];
        max=newArr[Arrays.binarySearch(newArr,number)+1];


        System.out.println("girdiğiniz sayıdan küçük en büyük sayı = "+min);
        System.out.println("girdiğiniz sayıdan büyük en küçük sayı = "+max);

    }
}
