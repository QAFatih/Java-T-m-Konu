package day02_variables;

public class C01_Sout {
    public static void main(String[] args) {
        // 1. Yol
        System.out.println('T');
        System.out.println('E');
        System.out.println('K');
        System.out.println('P');
        System.out.println('R');
        System.out.println('O');
        System.out.println(""); //Hiçlik ilede çalışır space ile de çalışır
        System.out.println('E');
        System.out.println('D');
        System.out.println('U');
        System.out.println('C');
        System.out.println('A');
        System.out.println('T');
        System.out.println('İ');
        System.out.println('N');
    /*
        ctrl+alt+l==>sayfayi duzenler
    \n alt satira gecirir
    \t tab bosluk birakir
    \b gerisindeki harfi siler
     \\: :\ (ters slash) yazdirir   prints a back slash
      \': ' tek tirnak yazdirir.  prints single quote
      \" :" cift tirnak yazdirir. : prints double quote


      Soru-1 : TECHPRO EDUCATION  ==>tek sout ile her hara alt alta gelecek sekilde ilk kelimeden sonra bosluk
       olacak sekilde yazdiran bir kod yaziniz
        2.yol
    */
        //Tekproeducation yukardan aşağı yazdran kodu yazınız.
        System.out.println("\nT\nE\nK\nP\nR\nO\n\n\nE\nD\nU\nC\nA\nT\nI\nO\nO\nN");

        //Java ile Güzel Dünya yukardan aşağı yazdıran kodu yazınız
        System.out.println("\nJAVA\n\nİLE\n\nGÜZEL\n\nDÜNYA");

        //Java ile Güzel Dünya yukardan aşağı yazdıran kodu yazınız
        System.out.println("\nJ\nA\nV\nA\n\n\nİ\nL\nE\n\n\nG\nÜ\nZ\nE\nL\n\n\nD\nÜ\nN\nY\nA");

        //Java ile güzel dünya bir Tab boşluk bıakarak yazdırınız
        System.out.println("JAVA\tİLE\tGÜZEL\tDÜNYA");
        //Java ile Güzel Dünya yukardan aşağı yazdıran kodu yazınız
        System.out.println("\bJAVA \b İLE \b GÜZEL \b DÜNYA");

        // Pazartesi yi her satıra bir harf gelecek şekilde kodu yazdır
        System.out.println("P\nA\nZ\nA\nR\nT\nE\nS\nİ");

        // "Tekpro" ile java çok 'kolay'
        System.out.println("\"Tekpro\"ile java çok\'kolay'");

        // "Maharet" hiç 'düşmemek2 degil;
        //
        //
        //      "her düştügünde kalkabilmektir"
        System.out.println("\"MAHARET\"HİÇ\' DÜŞMEMEK\'DEGİL;\n\n\n\t\"Her düştüğünde kalkabilmektir\"");
    }


}
