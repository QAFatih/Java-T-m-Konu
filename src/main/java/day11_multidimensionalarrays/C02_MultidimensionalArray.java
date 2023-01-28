package day11_multidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class C02_MultidimensionalArray {
    public static void main(String[] args) {

/* Kullanıcının girdigi bir array'in en buyuk elemani ile
 en kucuk elemanının  farkını bulan kodu yaziniz
 */
        Scanner input=new Scanner(System.in);
        System.out.println("Arrayin uzunlugunu giriniz");
   int uzunluk=input.nextInt();

   int arr[]=new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array'in"+(i+1)+" .elemanini giriniz");
           arr[i]= input.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("array'in En Buyuk Elamani:"+arr[uzunluk-1]);
        System.out.println("array'in En Kucuk Elamani:"+arr[0]);

        System.out.println("Aradaki Fark :"+(arr[uzunluk-1]-arr[0]));

    }
}
