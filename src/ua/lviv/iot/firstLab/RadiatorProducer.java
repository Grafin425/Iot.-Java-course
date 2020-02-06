package ua.lviv.iot.firstLab;

public class RadiatorProducer {
    public static void main(String[] args) {
       Radiator firstRadiator = new Radiator(200, "black", "USA", 1500, 50000, "outdoor");
        Radiator secondRadiator = new Radiator(150, "White", "UA", 1500, 35000, "outdoor");
        Radiator thirdRadiator = new Radiator(150, "black", "UA", 2000, 55000, "built in");
        System.out.println(firstRadiator);
        System.out.println(secondRadiator);
        System.out.println(thirdRadiator);

        Radiator.setMaterial("aluminum");

        System.out.println("***After Static is Set***");
        System.out.println(firstRadiator);
        System.out.println(secondRadiator);
        System.out.println(thirdRadiator);
    }



}
