package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
       // Kullanıcının girdiği Dört Basamklı sayının ilk ve son rakamlarının toplamını yapan kodu yazınız.
       // Note: Bir sayının birler basamağındaki rakamı %10 ile hesaplayabiliriz.
        /*
        Scanner scan1=new Scanner(System.in);
        System.out.println("Lütfen Dört Basamaklı Bir sayı giriniz");
        int sayi =scan1.nextInt();
        int sonRakam =sayi%10;
        int ilkRakam =sayi%1000;
        System.out.println("İlk ve Son Rakamın Toplamı "+(sonRakam+ilkRakam));
        */

        //Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki
        // rakamlarin toplamini bulunuz
        Scanner scan1=new Scanner(System.in);
        System.out.println("Beş Basamklı Bir Sayı Giriniz");
        int sayi = scan1.nextInt();

        int ilkIkiRakam =sayi%100;
        int sonIkiRakam =sayi/1000;
        System.out.println("İlkİkiRakam = " +(ilkIkiRakam));
        System.out.println("sonIkiRakam = " + sonIkiRakam);
        int ilkIkiTop= (ilkIkiRakam%10) + (ilkIkiRakam/10);
        int sonIkiTop=(sonIkiRakam%10) + (sonIkiRakam/10);
        System.out.println("ilkIkıTop = " + ilkIkiTop);
        System.out.println("sonIkiRakamTop = " + sonIkiTop);
        System.out.println("Toplam = " +(sonIkiTop+ilkIkiTop));

    }

}
