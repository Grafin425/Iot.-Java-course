package ua.lviv.iot.firstLab;

public class RadiatorProducer {
    public static void main(String[] args) {
        Radiator.numberOfParts=3;
       Radiator firstRadiator = new Radiator();
        Radiator secondRadiator = new Radiator(150, "White", "UA", 1500, 35000, "outdoor");
        Radiator thirdRadiator = new Radiator(150, "black", "UA", 2000, 55000);
        System.out.println(firstRadiator);
        System.out.println(secondRadiator);
        System.out.println(thirdRadiator);

        Radiator.setMaterial("aluminum");

        System.out.println("***After Static is Set***");

        System.out.println(firstRadiator);
        System.out.println(secondRadiator);
        System.out.println(thirdRadiator);

        Radiator cycleRadiator = null;
        Radiator arrayOfRadiator[]= new Radiator[4];

        int iterator=0;
        while (iterator<4) {
           arrayOfRadiator[iterator]= new Radiator();
           System.out.println("Radiator"+ iterator);
           System.out.println(arrayOfRadiator[iterator]);
           iterator++;
        }
    }




}
