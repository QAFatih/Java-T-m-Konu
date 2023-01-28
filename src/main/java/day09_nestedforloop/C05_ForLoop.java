package day09_nestedforloop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

// Girilen bir stringin harflerini teker teker ekrana alt alta olacak
// sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen String Bir İfade Giriniz");
        String str= input.nextLine();
        for (int i = 0; i <str.length(); i++) {// İfadeninin Krakterlerine bakildi.
          if (str.charAt(i)=='a' || str.charAt(i)==' ')
              continue;
              System.out.println(str.charAt(i));
          }


        }


    }

