package ua.lviv.iot.firstLab;

public class RadiatorProducer {
    public static void main(String[] args) {
       Radiator radiator = new Radiator(200, "black", "USA", 1500, 50000, "outdoor");
        System.out.println(radiator);
        System.out.println(Radiator.GOOD_RADIATOR);
    }



}
