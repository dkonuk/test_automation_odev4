package org.example.personel;

import java.util.Arrays;


public class personelApp {
    public static void main(String[] args) {
        personel personel001 = new personel();
        String[] personelListesi = new String[2];

        personel001.isim = "Ahmet";
        personel001.soyisim = "Yazar";
        personel001.departman = "Güvenlik";
        personel001.pozisyon = "Şef";
        personel001.aktif_calisan= true;
        personelListesi[0] = personel001.isim + " " + personel001.soyisim + "\n Departman: " + personel001.departman + " \nPozisyon: " + personel001.pozisyon + "\n " +"Halen Çalışıyor: " + personel001.aktif_calisan + "\n" ;



        personel personel002 = new personel();

        personel002.isim = "Hazal";
        personel002.soyisim = "Ahi";
        personel002.departman = "İnsan Kaynakları";
        personel002.pozisyon = "İşe alım Uzmanı" ;
        personel002.aktif_calisan = true;
        personelListesi[1] = personel002.isim + " " + personel002.soyisim + "\n Departman " + personel002.departman + "\n Pozisyon " + personel002.pozisyon + "\n " + "Halen Çalışıyor: " + personel002.aktif_calisan;


        personel001.personel_bilgileri();
        personel002.personel_bilgileri();

        System.out.println("Personel Listesi \n" + Arrays.toString(personelListesi));

    }
}



