import java.util.ArrayList;
import java.util.Scanner;

class kutuphane extends AnaSayfa{

    @Override
    public void listBook(ArrayList<String> kitapListe1) {
        Scanner keyboard = new Scanner(System.in);
        kitapListe1.addAll(kitapListe);
        System.out.println("kutuphanedeki kitaplar :\n"+kitapListe1);
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0; i<kitapListe1.size();i++){
            System.out.println(kitapListe1.get(i));
            System.out.println("Kitap sil");
            cevap= keyboard.nextInt();
            if(cevap ==1){
                a.add(i);
            }
            else{
                System.out.println("Oku : ");
                cevap= keyboard.nextInt();
                if (cevap==1){
                    showBook(kitapListe1.get(i)); break;
                }
            }

        }
        for(int i=0 ; i<a.size();i++){
            int b = a.get(i);
            kitapListe1.remove(b);
            System.out.println(kitapListe1);

        }

    }

    private void showBook(String s) {
        System.out.println(s);
    }


}

