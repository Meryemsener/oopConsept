package encapsulation;

public class Adres {
    /*1-encapsulation data saklamak demektir. "data hiding"

       2-Bizden izinsiz kimse degistiremesin, kimse
        goremesin diye bu islem yapilir
        3-Encapsulation yapmak icin variable'lari  private yapariz
        4-Bu kapsullemeyi okumak ve degistirmek icin acabiliriz.
        */
    String cadde;
    String sokak;
    String no;
    String sehir;
    String ulke;
    static String random;

    public Adres() {
    }

    public Adres(String cadde, String sokak, String no, String sehir, String ulke) {
        this.cadde = cadde;
        this.sokak = sokak;
        this.no = no;
        this.sehir = sehir;
        this.ulke = ulke;
    }
    /*
    degisiklik ve kontolleri get ve set ler icinde yapal-biliriz.
    //encapsulation yaptiginiz variable'in baska class'lardan okunabilmesi
    //isterseniz getter methodu olusturmaniz gerekir. Getter methodin acces modifier'i
    // kesinlikle public olur,
    //retur type konur.variable ne ise return type de o olur.Bu kisim okumak icin olusturulur
    //degistirmek icin de setter olusturulur
    //setter olusturulurken return type'i void olur.Voidlerde return olmaz
    //parantez icine de degistirmek istedigimiz variable i data turu ile birlikte yazilir

     */

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        //cadee adi nasil girilirse girilsin buyuk harf olsun diyorsak
        cadde=cadde.substring(0,1).toUpperCase()+cadde.substring(1).toLowerCase();//ilk harfini al buyuk yaz sonra geri kalanlari ekle
        this.cadde = cadde;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

}
