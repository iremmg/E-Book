import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class EBook {
    private static kullanıcı kullanıcı;
    AnaSayfa AnaSayfa;
    public static void login(){
        Scanner keyboard = new Scanner(System.in);//"ISO-8859-9"
          System.out.println("kayıt olmak ister misiniz?");
        int istek = keyboard.nextInt();
        PrintWriter girdi = null;
        if(istek==1){
            System.out.println("------------ HOŞGELDİNİZ ");
            String bosluk = keyboard.nextLine();
            System.out.print("İsim : ");
            String isim = keyboard.nextLine();
            System.out.print("Kullanıcı adı : ");
            String kullanıcıAdı = keyboard.nextLine();
            System.out.print("E-posta : ");
            String mail = keyboard.nextLine();
            System.out.print("Şifre : ");
            String şifre = keyboard.nextLine();
            kullanıcı = new kullanıcı(isim,kullanıcıAdı,mail,şifre); //isim,kullanıcıAdı,mail,şifre


            File dosya = new File("C:/Users/Asus/Desktop/kullanıcı/"+kullanıcıAdı+".txt");
            try

            {
                girdi = new PrintWriter(new FileOutputStream(dosya,true));
            }
            catch(FileNotFoundException ex)
            {
                System.out.println(kullanıcıAdı+".txt dosyası oluşturulurken hata oldu");
                System.exit(0);
            }


            girdi.print(isim+"\n"+kullanıcıAdı+"\n"+şifre+"\n"+mail+"\n");



            girdi.close();

            System.out.println("kayıt olma işlemi başarıyla tamamlandı");




        }


    }

}
