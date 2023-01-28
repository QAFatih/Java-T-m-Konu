package day09_nestedforloop;

import java.util.Scanner;

public class C06_WhileLoob {
    public static void main(String[] args) {
/*
 //Kullanicidan toplanmak uzere sayilar isteyin.
 //Sayi adedi 10'u gecerse yada toplami 500'u gecerse
 //" Bu kadar sayi yeter ...adet sayi girdiniz toplami..." yazdirin
        Scanner input=new Scanner(System.in);

        int sayi=0;
        int toplam=0;
        int sayac=0;


        while (sayac<11 && toplam<500){

            System.out.println("Lutfen toplanmak uzere sayi giriniz");
            sayi=input.nextInt();
            toplam+=sayi;
            sayac++;

        }
        if(toplam>500){
            System.out.println(sayac+" adet sayi girdiniz.Toplami  "+toplam);
        }else System.out.println("bu kadar sayi yeter."+sayac+" adet sayi girdiniz.Toplami "+toplam);

*/


//         2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

//

        for (int i =1 ; i <=6; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(i);


            } System.out.println();


        }

        System.out.println();

        }
    }




