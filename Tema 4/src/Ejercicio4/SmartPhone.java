package Ejercicio4;

public class SmartPhone extends SmartDevice {

    // 1. Attributes
    int ports;
    int cameras;
    boolean facialSensor;
    boolean fingerPrintSensor;

    // 2. Constructors
    public SmartPhone (){
    }

    public SmartPhone(boolean camera, String color, double price, int id, String brand, String model, boolean touchScreen, String operationalSystem, double screenSizeLength, double screenSizeWidth, String state, int ports, int cameras, boolean facialSensor, boolean fingerPrintSensor) {
        super(camera, color, price, id, brand, model, touchScreen, operationalSystem, screenSizeLength, screenSizeWidth, state);
        this.ports = ports;
        this.cameras = cameras;
        this.facialSensor = facialSensor;
        this.fingerPrintSensor = fingerPrintSensor;
    }
}
