package Ejercicio4;

public class SmartWatch extends SmartDevice{

    // 1. Attributes
    boolean waterProof;
    String strapMaterial;
    boolean interchangeableStraps;
    boolean monitorsPhysicalActivities;

    // 2. Constructors
    public SmartWatch(){
    }

    public SmartWatch(boolean camera, String color, double price, int id, String brand, String model, boolean touchScreen, String operationalSystem, double screenSizeLength, double screenSizeWidth, String state, boolean waterProof, String strapMaterial, boolean interchangeableStraps, boolean monitorsPhysicalActivities) {
        super(camera, color, price, id, brand, model, touchScreen, operationalSystem, screenSizeLength, screenSizeWidth, state);
        this.waterProof = waterProof;
        this.strapMaterial = strapMaterial;
        this.interchangeableStraps = interchangeableStraps;
        this.monitorsPhysicalActivities = monitorsPhysicalActivities;
    }
}
