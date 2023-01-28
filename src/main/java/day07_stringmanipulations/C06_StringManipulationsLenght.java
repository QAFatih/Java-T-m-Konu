package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulationsLenght {
    public static void main(String[] args) {


        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */
        //havva==lenght=5
        // indexi=4
        String cumle="bugun hava yagmurlu";
        System.out.println(cumle.length());


        String str1="";
        System.out.println(str1.length());//hiçliğin uzunluğu=0

        String str2=" ";
        System.out.println(str2.length());


        Scanner input =new Scanner(System.in);
        System.out.println("İsim   Giriniz");
        String ilkIsim= input.next();

        System.out.println("Soyİsminizi giriniz");
        String sonIsim= input.next();

        if(ilkIsim.length()>sonIsim.length()){
            System.out.println("İsminiz Soy İsminizden Uzun");
        }else if(ilkIsim.length()==sonIsim.length()){
            System.out.println("Isim soy isimle aynı uzunlukta");
        }else System.out.println("soyisim isimden uzun");

////////////////////////////////////////////////////////////////////////////
    //// Kullanicidan 4 harfli bir kelime isteyin
        //// ve girilen kelimeyi tersten yazdirin

        System.out.println("Dört Harfli Bir Kelime Giriniz ");
      String klm=input.nextLine();

        System.out.println(klm.length());

        if(klm.length()==4){
            char bir=klm.charAt(0);
            char iki=klm.charAt(1);
            char uc=klm.charAt(2);
            char dort=klm.charAt(3);
            System.out.println("tersten yazılısı :"+dort+uc+iki+bir);
        }else if(klm.length()>4){
            System.out.println("Giridiğiniz Kelime Dort harften fazla");
    }else if(klm.length()<4){
            System.out.println("Girdiğiniz Karakterten Az");
        }
}
}