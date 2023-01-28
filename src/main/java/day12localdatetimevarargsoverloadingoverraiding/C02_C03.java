package day12localdatetimevarargsoverloadingoverraiding;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C02_C03 {
    public static void main(String[] args) {

        //Ex: Tarih 2022-10-31 ve saat 03:26:00pm.oldugunda asagidaki kod ne yazdirir?
        LocalTime time=LocalTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dtf.format(time.plusHours(2)));//17:26

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf2.format(time.minusHours(1)));//02:26

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dtf3.format(time.minusHours(1)));//02:26:00

//gun ay yil olarak yazdirma
        LocalDate date=LocalDate.now();
        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("dd-MMMM-yy");
        System.out.println(dtf4.format(date));//01-November-22
        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(dtf5.format(date));//11-01-2022

//Mevcut saat diliminden ileri geri gitme
//Mevcut saat diliminizden 2 saat ileriyi yazdirin

        LocalTime time2=LocalTime.now();
        DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dtf6.format(time2.plusHours(2)));
    }
}
