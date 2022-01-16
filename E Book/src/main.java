package kitapyazma;

import java.util.ArrayList;
import kitapyazma.EBook;
import kitapyazma.KitapYazma;

public class main {
    public static void main(String[] args) {

            
                new WriteBook().setVisible(true);
            
        
       EBook e = new EBook();
       e.KullanıcıEkle();
  
       AnaSayfa a = new AnaSayfa();
       a.start();

       Kutuphane k = new Kutuphane();
       k.listBook(a.kitapListe);

       Kesfet k1 = new Kesfet();
       k1.searchBook(a.kitapAdi);

       KitapYazma ky = new KitapYazma();
       ky.WriteBook();
   

    }}
