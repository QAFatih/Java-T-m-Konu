package day04_ifstatement;

import java.util.Scanner;

public class C01_İfStatement {
    public static void main(String[] args) {


       //  * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
       //  * ekrana yazdiran java kodunu yaziniz.
       //  *
       //  * INPUT  ==>  OUTPUT
       //  *  Y     ==>   YES ;
       //  *  N     ==>   NO

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Y/N yada İkilisinden birini giriniz");

        char character = input.next().charAt(0);

        if (character == 'Y' || character == 'y')
        {
            System.out.println("YES");
        }
        if (character == 'N' || character == 'n')
        {
            System.out.println("NO");
        }else {
            System.out.println("Lütfen Y/N yada İkilisinden birini giriniz");
        }


 //************************************************************

      /*  Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
        not hesaplayici
        90 ~100 => A  Cok Iyi
        80 ~ 89 => B  Iyi
        70 ~ 79 => C  Orta
        60 ~ 69 => D  Gecer
        0 ~ 59  => F  Zayif
*/

    int not=80;
    if(not>=90 && not<=100){
        System.out.println("Notunuz A Çok İyi");

    }else if(not<=90 && not>=80){
        System.out.println("Notunuz B İyi");
       } else if(not<80 && not>70){

        System.out.println("Notunuz C Orta");

    }else if(not<70 && not>60) {

        System.out.println("Notunuz D Geçer");
    }else if (not<60 && not==0){

            System.out.println("Notounuz F zayıf");
        }
//******************************************************************
        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        System.out.println("Bir Gün İsmi Giriniz");
        String gun= input.next().toLowerCase();

        if(gun.equals("Cuma")){
            System.out.println( "Müslümanlar için kutsal gün");

        }if(gun.equals("Cumartesi")) {
            System.out.println("Yahudiler için kutsal gün");

        }if (gun.equals("Pazar")){
            System.out.println("Hiristiyanlar için kutsal gün");

        }if (!gun.equals("cuma")&& !gun.equals("cumartesi") && !gun.equals("pazar")){

        }

//****************2.YOL************************************
        System.out.println("Haftanin bir gun ismi giriniz");
        String gun1 = input.next();
        if (gun1.equalsIgnoreCase("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (gun1.equalsIgnoreCase("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gun1.equalsIgnoreCase("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        }
        if (!gun1.equalsIgnoreCase("cuma") &&
                !gun1.equalsIgnoreCase("cumartesi") &&
                !gun1.equalsIgnoreCase("pazar")) {
            System.out.println("Kutsal gun degil");
        }
//***********************3. YOL**********************************************
        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");

        } else  System.out.println("Kutsal Gun degil");
//**********************************************************************
       // Print "Lutfen is unvaninizi girin
        //jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
       // Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin.
        // Example :
       // Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      //  test data: qa ise print Quality Analyst
      //  dev ise print Developer
       // ba ise print Business Analyst
       // pm ise print Project Manager
        System.out.println("Lütfen İş Ünvanınızı Giriniz");
        String jobTitle=input.nextLine().toLowerCase();

       if (jobTitle.equals("dev")) {
            System.out.println("Developer");

       }if (jobTitle.equals("ba")) {
            System.out.println("Bussines Analyst");

        } if(jobTitle.equals("qa")) {
                System.out.println("Quality Analyst");
            } else if (jobTitle.equals("dev")) {
                System.out.println("Developer");
            } else if (jobTitle.equals("ba")) {
                System.out.println("Busines Analyst");
            } else if (jobTitle.equals("pm")) {
                System.out.println("Project Manager");
            }else {
                System.out.println("Senden bir hiçsin !! ");
            }



    }
    }
