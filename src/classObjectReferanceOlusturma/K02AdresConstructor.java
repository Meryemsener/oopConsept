package classObjectReferanceOlusturma;

public class K02AdresConstructor {
    String cadde;
    String blok;
    String no;
    String sehir;
    String ulke;
    //constructor'lar icin de bir method olusturuyoruz
    //parametresiz constructor mmutlaka olusturulmalidir
    //constructolr'lari tek tek elle yazmak da zaman kaybirid
    //bu yuzden sag tus yapiyp generate i tikliyoruz. Ilk satira cift tikladigimizda parametresiz contructorumuz create ediliyor
    //bir daha ayni yolu izleyip ordaki parametrelerden istedigimizi seciyoruz ve contructorumuz this. leri ile birlikte
    // zahmetsizce olusuyor.


    public K02AdresConstructor() {
    }

    public K02AdresConstructor(String cadde, String blok, String no, String sehir, String ulke) {
        this.cadde = cadde;
        this.blok = blok;
        this.no = no;
        this.sehir = sehir;
        this.ulke = ulke;
    }
}
