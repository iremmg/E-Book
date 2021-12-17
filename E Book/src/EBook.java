import java.util.Scanner;

public class EBook {
    private static kullanıcı kullanıcı;
    AnaSayfa AnaSayfa;
    public static void login(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("------------ HOŞGELDİNİZ ");
        System.out.print("İsim : ");
        String isim = keyboard.nextLine();
        System.out.print("Kullanıcı adı : ");
        String kullanıcıAdı = keyboard.nextLine();
        System.out.print("E-posta : ");
        String mail = keyboard.nextLine();
        System.out.print("Şifre : ");
        String şifre = keyboard.nextLine();
        kullanıcı = new kullanıcı(isim,kullanıcıAdı,mail,şifre); //isim,kullanıcıAdı,mail,şifre


    }

}
