package day07_stringmanipulations;

public class C09_StringManipulations {
    public static void main(String[] args) {
/*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

*/

        String pwd = "124bm8.!";

        boolean sekiz = pwd.length() > 7;
        boolean space = !pwd.contains(" ");
        boolean bHarf = pwd.replaceAll("[A-Z ]", "").length()>7;
        boolean character = pwd.endsWith(".");
        System.out.println(sekiz && space && bHarf && character);










        }

    }

