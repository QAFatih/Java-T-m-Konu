package day10_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Arrays {

    //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
// aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
// int arr1[][] = {{1, 2}, { 3, 4, 5},{6}};
// int arr2[][] = {{7, 8,9},{10,11 }, {12}};
    public static void main(String[] args) {


        //Aşağıdaki mutli dimensional array'lerin iç array'lerinde
        // aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
        // int arr1[][] = {{1, 2}, { 3, 4, 5},{6}};
        // int arr2[][] = {{7, 8,9},{10,11 }, {12}};


        int sinir = 0;
        int toplam = 0;
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        if (arr1.length <= arr2.length) {

            for (int i = 0; i < arr1.length; i++) {
                sinir = arr1[i].length;
                if (arr1[i].length > arr2[i].length) {
                    sinir = arr2[i].length;
                }
                for (int j = 0; j < sinir; j++) {
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println(i + "," + j + " indexindeki elemanlarin toplami" + toplam);

                }

            }

        } else {

            for (int i = 0; i < arr2.length; i++) {
                sinir = arr1[i].length;
                if (arr1[i].length > arr2[i].length) {
                    sinir = arr2[i].length;
                }
                for (int j = 0; j < sinir; j++) {
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println(i + "," + j + " indexindeki elemanlarin toplami" + toplam);

                }


            }
        }

       /*
    INTERWIEW QUESTIONS
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str = input.nextLine();


        //split()
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));

        //sort()
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[a, a, c, i, l, n]
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                counter++;//Ayni  harflerse bir artir
            } else {
                System.out.println(arr[i - 1] + " karakter sayisi " + (counter + 1));
                counter = 0;//farkli karaktere gectigi icin counteri sifirla
            }

            if (i == arr.length - 1) {
                System.out.println(arr[i] + " karakterinin sayisi " + (counter + 1));
            }

        }
    }
}