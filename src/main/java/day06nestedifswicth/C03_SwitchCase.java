package day06nestedifswicth;

import java.util.Scanner;

public class C03_SwitchCase {

    public static void main(String[] args) {
     /*   DERS PROGRAMI

        Hangi gun hangi dersin oldugunu gosteren bir program yaziniz

        Pazartesi ve Sali ise: Java

        Persembe ve Cuma ise: Selenyum

        Carsamba ve Cumartesi ise: SQL

        aksi halde: izin gunu=Day Off
*/
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen Gun Ismi Giriniz");
        String gun=input.next().toUpperCase();

        switch(gun) {
            case "PAZARTESI":
            case "SALI":
                System.out.println("JAVA");
                break;
            case "CARSAMBA":
            case "PERSEMBE":
                System.out.println("SELENYUM");
                break;
            case "CUMA":
            case "CUMARTESİ":
                System.out.println("SQL");
            default:

                System.out.println("DAY OF");


        }
    }
}
