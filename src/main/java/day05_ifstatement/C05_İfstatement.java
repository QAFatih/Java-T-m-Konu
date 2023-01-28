package day05_ifstatement;

import java.util.Scanner;

public class C05_İfstatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen İki Sayı Giriniz");

        double a = input.nextDouble();
        double b = input.nextDouble();
       /*
        if (a < b) {
            System.out.println("Büyük Olmayan Sayi"+a);
        } else if (a > b) {
            System.out.println("Büyük olmayan Sayi"+b);
        } else System.out.println("Sayilar Birbirine Eşit");
*/
//**************************************************************

        System.out.println("Lütfen İki Sayı Giriniz");

        System.out.println(a==b ? "Sayılar Eşit" :a>b ? b : a);

    }

}
