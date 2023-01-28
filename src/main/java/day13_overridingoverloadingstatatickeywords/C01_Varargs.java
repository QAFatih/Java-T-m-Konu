package day13_overridingoverloadingstatatickeywords;

public class C01_Varargs {
    public static void main(String[] args) {
// Verilen sayilardan ilki haric toplayip toplamadigi ilk sayi ile carpan bir metod olusturunuz.

        int sayi1 = 5;
        int sayi2 = 7;
        int sayi3 = 2;
        int sayi4 = 4;
        int sayi5 = 9;

        toplam(sayi1, sayi2, sayi3, sayi4, sayi5);


    }

    private static void toplam(int sayi1, int... toplanacakSayi) {

        int top = 0;
        for (int w : toplanacakSayi

        ) {
            top += w;

        }
        System.out.println("top = " + top);
        System.out.println("Toplam ile ilk sayinin carpimi :\n"+top*sayi1);
    }
}