public class main {
    public static void main(String[] args) {

        EBook e = new EBook();
        e.login();
        AnaSayfa a = new AnaSayfa();
        a.start();
        Kutuphane k = new Kutuphane();
        k.listBook(a.kitapListe);
        KitapYazma k1 = new KitapYazma();
        k1.WriteBook();


    }}
