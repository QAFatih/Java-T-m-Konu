package day13_overridingoverloadingstatatickeywords;

public class C02_OverLoading {
    public static void main(String[] args) {

        //Ayni classta ayni isimde metod olusturmak icin metod signature(imza) degistirilir.
        cikarma(98, (float) 52.666);
        cikarma(14.5, 3);
        toplama(55,66);
        toplama(2.3, 4.5);
        carpma(2,3);
        carpma(8.9,32);
    }
//data tipleri degistirilerek yapilan overloadin
    private static void carpma(double v, int i) {
        System.out.println("double ile int carpma yapildi"+(v*i));
    }

    private static void carpma(int i, int i1) {
       System.out.println("iki int degercarpma yapildi"+(i*i1));
   }

    private static void toplama(double v, double v1) {
        System.out.println("iki double deger toplandi " + (v + v1));
    }

    private static void toplama(int i, int i1) {
        System.out.println("iki int deger toplandi "+(i+i1));
      }

    private static void cikarma(double v, int i) {
        System.out.println("double ile int cikarma yontemi" + (v - i));
    }

    private static void cikarma(int i, float v) {

        System.out.println("int bir deger ile float cikarma islemi yapildi " + (i - v));


    }// Parametre sayilari artirilarak yapilan overloading
    private static void toplama(double v, double v1, double v2) {
        System.out.println("uc double deger toplandi " + (v + v1+v2));
    }

    private static void toplama(double v, double v1, double v2, double v3) {
        System.out.println("dort double deger toplandi " + (v + v1+v2+v3));
    }//Data türleri farkli oldugunda parametrelerin yerleri degistirilerek oveloading yapilabilir.

    private static void carpma(Float a, double b) {
        System.out.println("ilki double ve ikinci int ile carpma yapildi"+(a*b));
    }
    private static void carpma(double a, float b) {
        System.out.println("ilki float ve ikinci double ile carpma yapildi"+(a*b));
    }

}
