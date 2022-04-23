package encapsulation;

public class Ogrenci {
    private String isim;
    private String soyIsim;
    Adres ogrenciAdres;

    public Ogrenci() {
    }

    public Ogrenci(String isim, String soyIsim, Adres ogrenciAdres) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.ogrenciAdres = ogrenciAdres;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public Adres getOgrenciAdres() {
        return ogrenciAdres;
    }

    public void setOgrenciAdres(Adres ogrenciAdres) {
        this.ogrenciAdres = ogrenciAdres;
    }
}
/*
getterlar:Bilgileri getirmek icin
setterlar:bilgileri duzenlemek, eklemek vs icin kullanilir
 */

