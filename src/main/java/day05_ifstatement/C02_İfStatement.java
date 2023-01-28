package day05_ifstatement;

import java.util.Scanner;

public class C02_İfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanicidan yasini isteyin
        // 65 veya daha buyukse emekli olabilirsin
        // 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin

        System.out.println("Lütfen Yaşınızı Pozitif Bir Sayı Olarak Giriniz");

        int yas = input.nextInt();
        if (yas >= 65) {
            System.out.println("Emekli Olabilirsin...");
        } else {
            System.out.print("Emekli Olamazsın...=");

            System.out.println(65 - yas + "sen daha çalişmalisin");
//////////************//////////////******************/////////////////*********************
                if (yas >= 0) {
                if (yas > 65) {
      System.out.println("Emekli Olabilirsin");
      } else {
      System.out.println("Emekli olmazsın");
      System.out.println(65 - yas + "Sen daha Çalişmalisin");
       }
     } else {
     System.out.println("Lütfen Sıfırdan Büyük Sayı Giriniz");
            }
        }


    }
}
