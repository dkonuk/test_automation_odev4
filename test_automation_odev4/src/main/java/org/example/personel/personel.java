package org.example.personel;

import java.util.Date;

public class personel {

    String isim;
    String soyisim;
    String departman;
    String pozisyon;
    Boolean aktif_calisan;

    void personel_bilgileri() {
        System.out.println("İsim: " + isim);
        System.out.println("Soyisim: " + soyisim);
        System.out.println("Departman: " + departman);
        System.out.println("Pozisyon: " + pozisyon);
        System.out.println("Aktif Çalışan: " + aktif_calisan);
        System.out.println();

    }

}
