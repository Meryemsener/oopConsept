package encapsulation;

public class Araba {//pojo class=modal class
    /*
    Bir class'in pojo class olabilmesi icin 1-variable
            2-Constructor
            3-getter-setter
            4-toString metodu olmasi lazim
     */
   private  final String model="honda";
   private  String renk="krem";
   private double motor=2000;
   private  int yil=2022;

    public Araba() {
    }

    public Araba( String renk, double motor, int yil) {
       // this.model = model; hata verir
        //this.renk = renk;
        //this.motor = motor;
        //this.yil = yil;
        setMotor(motor);
        setYil(yil);
    }

    public String getModel() {
        return model;
    }

  /*  public void setModel(String model) {
        this.model = model;
    }

   */

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        if(motor<1000){
            System.out.println("Motor hacmi yanlis girildi");
        }else
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if(yil<1900){
            System.out.println("Hatali veri");
        }else if(yil<0){
            this.yil=(-1)*yil;
            System.out.println("Hatali yil girisi");
        }else
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
