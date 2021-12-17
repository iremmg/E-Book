import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {

    Scanner keyboard = new Scanner(System.in);
    ArrayList<String> yazar = new ArrayList<>();
    ArrayList<String> kitap = new ArrayList<>();
    String kitapListe[]= new String[5];
    public void start() {
        yazar.add("Dan Brown");
        yazar.add("Victor Hugo");
        yazar.add("Nazım Hikmet");
        kitap.add("Başlangıç"); // macera              0
        kitap.add("Sefiller"); // klasik               1
        kitap.add("Nâzım ile Piraye"); // romantik     2

            for ( int i=0 ; i< kitap.size() ; i++){
                System.out.println(yazar.get(i) + " - "+kitap.get(i));
                System.out.println("Kütüphaneye ekle ?");
                int cevap =keyboard.nextInt();
                if(cevap == 1){
                    kitapListe[i] = kitap.get(i)+yazar.get(i);
                }
            }
          

        }







}
