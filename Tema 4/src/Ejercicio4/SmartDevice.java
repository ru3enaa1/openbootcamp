package Ejercicio4;

public class SmartDevice {

    // 1. Attributes
    protected String color;
    protected double price;
    protected int id;
    protected String operationalSystem;
    protected boolean touchScreen;
    protected double screenSizeLength;
    protected double screenSizeWidth;
    protected String brand;
    protected boolean camera;
    protected String model;
    protected String state;

    // 2. Constructors
    public SmartDevice(){
    }

    public SmartDevice(boolean camera, String color, double price, int id, String brand, String model, boolean touchScreen, String operationalSystem, double screenSizeLength, double screenSizeWidth, String state){
        this.price = price;
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.touchScreen = touchScreen;
        this.operationalSystem = operationalSystem;
        this.screenSizeLength = screenSizeLength;
        this.screenSizeWidth = screenSizeWidth;
        this.state = "Off";
        this.color = color;
        this.camera = camera;

    }

    // 3. Methods
    public void Initiate (String message){

        this.state = message;

    }

    public void TurnOff(String message){

        this.state = message;

    }
}
