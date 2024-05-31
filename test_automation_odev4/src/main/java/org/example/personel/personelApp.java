package org.example.personel;

import java.util.Date;

public class personelApp {
    public static void main(String[] args) {
        personel personel001 = new personel();

        personel001.isim = "Ahmet";
        personel001.soyisim = "Yazar";
        personel001.departman = "Güvenlik";
        personel001.pozisyon = "Şef";
        personel001.aktif_calisan= true;

        personel personel002 = new personel();

        personel002.isim = "Hazal";
        personel002.soyisim = "Ahi";
        personel002.departman = "İnsan Kaynakları";
        personel002.pozisyon = "İşe alım Uzmanı" ;
        personel002.aktif_calisan = true;


        personel001.personel_bilgileri();
        personel002.personel_bilgileri();

    }
}



