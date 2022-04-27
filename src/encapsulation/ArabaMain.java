package encapsulation;

public class ArabaMain {
    public static void main(String[] args) {
        Araba honda = new Araba();//parametresiz obje
        honda.setMotor(1600);
        //honda.setModel("civic");
        honda.setRenk("mor");
        honda.setYil(2019);
        Araba toyota = new Araba();//parametreli
        Araba volvo = new Araba();
        System.out.println(honda.getRenk());
        System.out.println(honda.getModel());
        System.out.println(toyota.getYil());
        System.out.println(honda);//tostring methodu olmazsa honda'nin referans degerini verir
        System.out.println(toyota);




    }

    
}
