package classObjectReferanceOlusturma;

public class K03PublicPrivateStaticMain {
    public static void main(String[] args) {
        K03PublicPrivateStatic adres=new K03PublicPrivateStatic("Sparrendhofdreef","3","12","Sint-Niklaas","Belgie");
        K01Ogrenci ogrenci2=new K01Ogrenci();
        adres.setCadde("Sparrendhofdreef");//adr.cadde ="sparrendhofdreef"; ile ayni


        //System.out.println(setCadde);//buranin icine setCadde diyince bilgiyi okutamayiz
        //bu yuzden pojo class'a geri gidip bir de getter olusturmaliyiz ki okyabilelim

    }
}
