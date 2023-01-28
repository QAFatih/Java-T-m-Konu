package day06nestedifswicth;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {


 /*
TASK :
 Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
 Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
 3 basamaklı degilse çift olup olmadigini kontrol edin.
 Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
 */

    Scanner input=new Scanner(System.in);
    System.out.println("lütfen pozitif bir sayı giriniz");
    int sayi= input.nextInt();


    System.out.println();
        System.out.println("*******Ternary ile Çözüm********************");
         String sonuc=(sayi>0)  ? (sayi>99 && sayi<1000)   ?("üç basamaklı 0'dan büyük"):
                 (sayi%2==0)    ? ("3 Basamklı olmayan çift sayı") : ("Üç Basamaklı olmayan tek sayı"):
                 "Lütfen Sıfırdan Büyük Bir Sayı Giriniz";
        System.out.println("sonuc = " + sonuc);

        System.out.println("*******İf  Else  İle Çözüm******");
        if(sayi>0){
            if(sayi<1000 && sayi>99){
                System.out.println("Üç Basamaklı Pozitif Sayi");
            } else if (sayi%2==0){
                System.out.println("Üç Basamaklı olmayan cift sayi");

            }else System.out.println("Üç Basmaklı olmayan tek sayı");
        } else System.out.println("Lütfen sıfır büyük pozitif tamsayı giriniz");
    }
}