package encapsulation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Adres adr=new Adres("samsun","Kivilcim", "12", "Ankara","Turkiye");
        Ogrenci ogrenci=new Ogrenci("Turkan", "Cavdar",adr);
        //buraya bir list olusturalim
        ArrayList<Adres> adrList=new ArrayList<>();
        adr.setSehir("parijs");
        adr.setUlke("frankrijk");
        adr.setCadde("scha");
        adrList.add(adr);//liste yeni bir adres ekle
        adr=new Adres();
        adr.setSehir("ghent");
        adr.setUlke("belcika");
        adr.setCadde("kioskStraat");
        adrList.add(adr);
        System.out.println(adrList.get(0).getCadde());
        System.out.println(adrList.get(1).getCadde());
        /*
        yukarida iki ayri adres girip listeledigimizi dusunuyorsak yaniiyoruz.
        iki sout un sonu da ayni cadde adi olarak cikar. Bu hatayi ortadan kaldirmak
        icin referansa bir degeri atadik, o referansi kullandik. Ondan sonra tekrar
        deger atamak icin mutlaka o referansin adresini yenilememiz lazim. Yani
        adr=new Adres(); dememiz lazim. bunu belki yuzlerce kez yapmamiz
        gerecektir. Bunu database den alirken loop icerisinde surekli yenilememiz
        gerekecektir.
        System.out.println(adrList.get(0).getCadde());
        System.out.println(adrList.get(1).getCadde());
        */

        adr.setUlke("amerika");
        System.out.println(adr.getUlke()+" ulke adi gette rile");
        Adres.random="lskdjjf";
        System.out.println(Adres.random);
        ogrenci.getOgrenciAdres();
        System.out.println(ogrenci.ogrenciAdres.getCadde()+" getter");

        System.out.println("adres : "+adr.cadde+" caddesi");
        System.out.println(adr.sokak+" sokak");
        System.out.println("no /"+adr.no);
        System.out.print(adr.sehir);
        System.out.println("/"+ adr.ulke);
        System.out.println(ogrenci.ogrenciAdres.sehir);


    }

}
