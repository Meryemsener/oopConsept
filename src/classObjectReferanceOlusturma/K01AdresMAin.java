package classObjectReferanceOlusturma;

public class K01AdresMAin {
    // static double sayi;
    public static void main(String[] args) {
        //pojo class'taki varibalelara ulasmak icin obje uretiyoruz
        //1-Adres sinifindan bir referans
        K01AdresPojo adr=new K01AdresPojo();
                 //yukaridaki kod satirinin okunusu=> obje olusturma classindan yeni bir
                 //obje urettim. Bu class in referansi adr.
                 //adr ile ilgili ObjeOlusturma class'indaki bilgilere ulasabilir ve islem
                 //yapabiliirm
        //2-Ogrenci class'indan bir referans olusturalim
        K01Ogrenci ogrenci=new K01Ogrenci();
        //double sayi=13;

        adr.no               = "3";
        adr.cadde            = "Kerkstraat";
        adr.blok             = "12";
        adr.sehir            = "Sint-Niklaas";
        adr.ulke             = "Belgie";
        ogrenci.isim         = "Evaline";
        ogrenci.soyIsim      = "Peter";
        ogrenci.ogrenciAdres = adr;
        //System.out.println(ogrenci.ogrenciAdres);bu referansa goturur
        System.out.println(ogrenci.ogrenciAdres.sehir);

        //bunlari bu sekilde olusturmak yazdirmak icin yeterli olmadigindan
        //sout ile bilgileri yazdiriyoruz

        //System.out.println("adres : " + adr);//bu bize bellekte olusturulan alanin adresini verir
        System.out.println("adres : " + adr.ulke);
    }
}
