import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {
    int num[] = new int [5];
    ArrayList<String> yazar = new ArrayList<>();
    ArrayList<String> kitap = new ArrayList<>();

    public void start() {
        yazar.add("Dan Brown");
        yazar.add("Victor Hugo");
        yazar.add("Nazım Hikmet");
        kitap.add("Başlangıç"); // macera              0
        kitap.add("Sefiller"); // klasik               1
        kitap.add("Nâzım ile Piraye"); // romantik     2

            for ( int i=0 ; i< kitap.size() ; i++){
                System.out.println(yazar.get(i) + " - "+kitap.get(i));
            }

       /* public void bookadd() {
            Scanner keyboard = new Scanner(System.in);
            for (int i = 0; i < yazar.size(); i++) {
                System.out.println(yazar.get(i) + " - " + kitap.get(i));
                System.out.println("Kütüphaneye eklenen kitap");
                num[i] = keyboard.nextInt();
            }
        } */

    }






}
