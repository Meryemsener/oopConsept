package classObjectReferanceOlusturma;

public class K01AdresPojo {
    //basina public yazmasak da public classin icinde olduklar icin acces
    // modifierlari publictir
    String cadde;
    String blok;
    String no;
    String sehir;
    String ulke;
    //constructor'lar icin de bir method olusturuyoruz
    //parametresiz constructor mmutlaka olusturulmalidir
    public K01AdresPojo(){

    }
    public K01AdresPojo(String cadde, String blok, String no, String sehir, String ulke){
        this.cadde=cadde;
        this.blok=blok;
        this.no=no;
        this.sehir=sehir;
        this.ulke=ulke;
    }


}
