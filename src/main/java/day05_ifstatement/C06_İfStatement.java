package day05_ifstatement;

import java.util.Scanner;

public class C06_İfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Dort Basamaklı Bir  Sayı Giriniz");
        int sayi = input.nextInt();

        if (sayi < 1000 && sayi > 9999) {
            System.out.println("Lütfen Dort Basamaklı Bir Sayı Giriniz");//İstenmeyen durum İncelendi.
        } else if (sayi % 5 == 0) {
            if (sayi % 10 == 0) {
                System.out.println("5 e bölünebilen çift sayi");
            } else {
                System.out.println("5' e Bölünebilen Tek Sayi");
            }

            }else{
                System.out.println("Tekrar deneyin");


            }
        }

    }
