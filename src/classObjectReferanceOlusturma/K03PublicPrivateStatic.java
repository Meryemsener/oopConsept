package classObjectReferanceOlusturma;

public class K03PublicPrivateStatic {

    private String cadde;
    String blok;
    String no;
    String sehir;
    String ulke;
    static String random;


    //basinda acces modifieri static olanlari dogrudan kullanabiliriz.
    //main class ta ya da baska bir class'ta(ayni package icinde olmak sartiyla)
    //Adres.random ="kdkjflkdjflk"; diyerek bkullanabiliriz
    //Math.sqrt(); buradaki sqrt statik bir degiskendir
    //bu degiskenleri main  in disinda tanimlarsak main dahil diger tum methodlar
    //kullanabilirler. Basindaki statik ibaresi silinirse hata verir
    //ancak basindaki statik olmayip class in icinde tanimlanmissa hata vermez ama disarida tanimlanan
    //gecersiz olurBunun icin main class taki 4. ve 15. satirlara bak

    public K03PublicPrivateStatic() {

    }

    public K03PublicPrivateStatic(String cadde, String blok, String no, String sehir, String ulke) {
        this.cadde = cadde;
        this.blok = blok;
        this.no = no;
        this.sehir = sehir;
        this.ulke = ulke;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;

    }
    public String getCadde() {
        return cadde;
    }
}