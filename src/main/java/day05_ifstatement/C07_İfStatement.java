package day05_ifstatement;

import java.util.Scanner;

public class C07_İfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Kullanicidan dortgenin kenar uzunluklarini isteyin
        //ve dortgenin kare olup  olmadigini yazdirin


        System.out.println("Lütfen Birinci Kenar Uzunluğunu Giriniz");
        int kenar1 = input.nextInt();
        System.out.println("Lütfen İkinci Kenar Uzunluğunu Giriniz");
        int kenar2 = input.nextInt();
        System.out.println("Lütfen üçüncü Kenar Uzunluğunu Giriniz");

        int kenar3 = input.nextInt();
        System.out.println("Dördüncü Kenar Uzunluğunu Giriniz");
        int kenar4 = input.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar3 == kenar4) {

            System.out.println("bu cisim karedir");

        } else System.out.println("Kare Degildir");

    }

    }

