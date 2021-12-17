public class kullanıcı {
    public String KullanıcıAdı;
    private String isim , soyad, mail , şifre;
    private int tel;

    public kullanıcı(String isim,String kullanıcıAdı,String mail,String şifre) {
        KullanıcıAdı = kullanıcıAdı;
        this.isim=isim;
        this.mail=mail;
        this.şifre=şifre;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }

}
