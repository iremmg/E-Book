import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {


    Scanner keyboard = new Scanner(System.in);

    ArrayList<String> kitapListe = new ArrayList<>();
    ArrayList<String> kitap = new ArrayList<>();
    int cevap;
    public void start() {
        kitap.add("Dan Brown - Baslangıc"); // aksiyon
        kitap.add("Victor Hugo - Sefiller"); // klasik
        kitap.add("Nazim Hikmet - Nazim ile Piraye"); //romantik
        for ( int i=0 ; i< kitap.size() ; i++){
            int temp =0;
            System.out.println(kitap.get(i));
            System.out.println("Kutuphaneye ekle ?");
            cevap =keyboard.nextInt(); // Kütüphaneye eklenecek kitaplar konsoldan 1 ve 0 değerleriyle belirlenir
            if(cevap == 1){
                temp ++;
                kitapListe.add(kitap.get(i));  // Girilen deper 1 ise kitap kütüphaneye eklenilir. 1 = buton olacak şekilde
                // arayüz yapılacaktır.
            }
        }

        listBook(kitapListe);
        searchBook(kitapListe);
    }

    public void listBook(ArrayList<String> kitapListe) {

    }
    public void searchBook(ArrayList<String> kitapListe){

    }
