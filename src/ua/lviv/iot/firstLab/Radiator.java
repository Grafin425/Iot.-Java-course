package ua.lviv.iot.firstLab;

public class Radiator {

    public static final String GOOD_RADIATOR = "very good radiator";

    static int numberOfParts;

    private int powerInWatts;

    private String color;

    private String producer;

    private int distanceInMillimeters;

    protected int weightInGrams;

    private static String material;

    protected String type;

    public Radiator (){
        this(0,"Unknown","Unknown",0,0,"Unknown");
    }

    public Radiator(int powerInWatts, String color, String producer, int distanceInMillimeters, int weightInGrams, String type) {
        this.powerInWatts = powerInWatts;
        this.color = color;
        this.producer = producer;
        this.distanceInMillimeters = distanceInMillimeters;
        this.weightInGrams = weightInGrams;
        this.type = type;
    }

    public Radiator(int powerInWatts, String color, String producer, int distanceInMillimeters, int weightInGrams) {
        this(powerInWatts, color, producer, distanceInMillimeters, weightInGrams, "GOOD_RADIATOR");

    }

    public Radiator(int powerInWatts, String color, String producer, int distanceInMillimeters) {
        this(powerInWatts, color, producer, distanceInMillimeters, 0);
    }

    public int getPowerInWatts() {
        return powerInWatts;
    }

    public void setPowerInWatts(int powerInWatts) {
        this.powerInWatts = powerInWatts;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getDistanceInMillimeters() {
        return distanceInMillimeters;
    }

    public void setDistanceInMillimeters(int distanceInMillimeters) {
        this.distanceInMillimeters = distanceInMillimeters;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public static void setMaterial (String material){
        Radiator.material= material;
    }

    @Override
    public String toString() {
        return "Radiator{" +
                "powerInWatts=" + powerInWatts +
                ", color='" + color + '\'' +
                ", producer='" + producer + '\'' +
                ", distanceInMillimeters=" + distanceInMillimeters +
                ", weightInGrams=" + weightInGrams +
                ", type='" + type + '\'' +
                ", ***Static material "+
                Radiator.material +
                '}';
    }
    public static String printStaticNumbOfMembers() {
        return "numberOfMembers ( it`s a static ):" + numberOfParts;
    }

    public String printNumbOfMembers() {
        return "numberOfMembers ( it isn`t a static ) :" + numberOfParts;
    }
    public void resertValues(int powerInWatts,String color,String producer, int distanceInMillimeters,int weightInGrams,String type){
        this.powerInWatts= powerInWatts;
        this.color=color;
        this.producer=producer;
        this.distanceInMillimeters=distanceInMillimeters;
        this.weightInGrams=weightInGrams;
        this.type=type;
    }

}