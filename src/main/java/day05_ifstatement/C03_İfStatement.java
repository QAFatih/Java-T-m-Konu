package day05_ifstatement;

import java.util.Scanner;

public class C03_İfStatement {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
 //Soru 8) Kullanicidan maas icin bir teklif isteyin ve
// asagidaki degerlere gore cevap yazdirin.
//Teklif 20.000’in uzerinde ise "Kabul ediyorum" ,
//10000 – 20.000 arasinda ise "Konusabiliriz",
//10.000’nin altinda ise "Maalesef Kabul edemem" yazdirin
        System.out.println("Lütfen Maaş İçin Teklif Veriniz");
        double maas=input.nextDouble();


        if(maas>=20000){
            System.out.println("Kabul Ediyorum");
        }else if (maas>=10000 && maas<20000){
            System.out.println("Konuşabiliriz");
        }else if (maas<0){
            System.out.println("Malesef Kabul Edemem");
        }

    }

}
