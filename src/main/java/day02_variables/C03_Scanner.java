package day02_variables;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        /*

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz");
        String kullanıcıIsmi=scan.nextLine();

        // Çemberin çevre ve yarıçapını hesaplayan kodu yazınız

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Yarıçap Giriniz");
        double r= scan.nextDouble();
        double alan=3.14*r*r;
        double cevre=2*3.14*r;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);

        Scanner scan2= new Scanner(System.in);
        System.out.println("Lütfen İki Kenar Uzunluğu Giriniz");
        int a=scan2.nextInt();
        int b =scan2.nextInt();
        System.out.println("Alan "+(2*a*b));
        System.out.println("Çevre "+(2*(a+b)));


        Scanner scan3=new Scanner(System.in);
        System.out.println("Lütfen Üçgenin Üç Adet Kenar Uzunluğu Giriniz");
        byte a = scan3.nextByte();
        byte b= scan3.nextByte();
        byte c= scan3.nextByte();
        System.out.println("Üçgenin Çevre =" + (a+b+c));
         */
        Scanner scan4=new Scanner(System.in);
        System.out.println("Lütfen Karakter  giriniz");
        char ch=scan4.next().charAt(0);
        System.out.println("   "+ch+"   ");
        System.out.println(" "+ch+"  "+ch);
        System.out.println(ch+"  "+ch+"  "+ch);


    }
}
