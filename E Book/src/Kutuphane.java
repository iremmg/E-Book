import java.util.ArrayList;
import java.util.Scanner;

class Kutuphane extends AnaSayfa{

    @Override
    public void listBook(ArrayList<String> kitapListe1) {
        Scanner keyboard = new Scanner(System.in);
        kitapListe1.addAll(kitapListe);
        System.out.println("kutuphanedeki kitaplar :\n"+kitapListe1);
        for(int i =0 ; i<kitapListe1.size();i++){
            System.out.println(kitapListe1.get(i));
            System.out.println("Kitap sil");
            cevap= keyboard.nextInt();
            if(cevap ==1){
                kitapListe1.remove(i);
            }
        }
        System.out.println(kitapListe1);
    }

}

