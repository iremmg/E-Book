import java.util.ArrayList;

public class main {
    public static void main(String[] args) {


    EBook e = new EBook();
    e.KullanıcıEkle();

    AnaSayfa a = new AnaSayfa();
    a.start();

     Kutuphane k = new Kutuphane();
     k.listBook(a.kitapListe);

     Kesfet k1 = new Kesfet();
     k1.searchBook(a.kitapAdi );

     KitapYazma ky = new KitapYazma();
     ky.WriteBook();




    } }

