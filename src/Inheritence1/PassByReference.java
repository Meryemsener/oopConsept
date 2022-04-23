package Inheritence1;

public class PassByReference {
    public static void main(String[] args) {
        String hazine="Altin";
        hazineCal(hazine);
        System.out.println(hazine);//altin
    }
    public static String hazineCal(String hazine){
        return hazine + "calindi";
    }

}
