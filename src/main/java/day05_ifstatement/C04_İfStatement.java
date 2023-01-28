package day05_ifstatement;

import java.util.Locale;
import java.util.Scanner;

public class C04_İfStatement {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
 //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
// calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

 System.out.println("Lütfen Cinsiyetinizi Yaziniz" + "\n Kadın İçin K "+ "\n Erkek İçin E");
char cinsiyet=input.next().toUpperCase().charAt(0);


        System.out.println("lütfen yasinizi giriniz");
        double yas=input.nextDouble();

        if (cinsiyet=='K'){
            if (yas<0 ||  yas>120) {
                System.out.println("Lütfen Doğru Yas Aralığı Giriniz");
             }else if(yas>60) {
                System.out.println("Emekli Olabilirsin");
            }else{
                System.out.println("Emekli Olamazsın");
            }
          }

    if (cinsiyet=='E'){
        if(yas<0  |yas>120) {
            System.out.println("Lütfen Doğru Yas Aralığı Giriniz");
        }else if(yas>65){
            System.out.println("Emekli Olabirsiniz");
        }else{
            System.out.println("Emekli Olamazsınız"+(65-yas)+"Çalismalisin");
        }

    }else System.out.println("Lütfen Geçerli Harf Giriniz");
    }
}



