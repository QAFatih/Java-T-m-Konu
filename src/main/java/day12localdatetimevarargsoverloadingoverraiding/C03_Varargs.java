package day12localdatetimevarargsoverloadingoverraiding;

public class C03_Varargs {
    public static void main(String[] args) {
//Varargs kullanarak Verilen Stringleri birlestiren concat() isimli bir method olusturunuz

        concat("safran", "bolu", "evleri");

    }

    private static void concat(String... str) {

        String sonuc="";
        for (String w:str) {
            sonuc+=w;
        }
        System.out.println(sonuc);

    }
}
