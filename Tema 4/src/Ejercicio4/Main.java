package Ejercicio4;

public class Main {

    public static void main(String[] args) {

        SmartPhone samsungGalaxy = new SmartPhone(true, "Black", 905.99, 3894, "Samsung", "S22", true, "Android 12 con One UI 4.1", 70.6, 7.6, "Off", 2, 4, true, true);

        System.out.println("SamsungGalaxy Camera: "+ samsungGalaxy.camera);
        System.out.println("SamsungGalaxy Color: " + samsungGalaxy.color);
        System.out.println("SamsungGalaxy Price: " +samsungGalaxy.price);
        System.out.println("SamsungGalaxy ID: " +samsungGalaxy.id);
        System.out.println("SamsungGalaxy Brand: " +samsungGalaxy.brand);
        System.out.println("SamsungGalaxy Model: " +samsungGalaxy.model);
        System.out.println("SamsungGalaxy Touch Screen: " +samsungGalaxy.touchScreen);
        System.out.println("SamsungGalaxy OS: " +samsungGalaxy.operationalSystem);
        System.out.println("SamsungGalaxy ScreenLength: " +samsungGalaxy.screenSizeLength);
        System.out.println("SamsungGalaxy ScreenWidth: " +samsungGalaxy.screenSizeWidth);
        System.out.println("SamsungGalaxy State: " +samsungGalaxy.state);
        samsungGalaxy.Initiate("Turning on");
        System.out.println("SamsungGalaxy State: " +samsungGalaxy.state);
        samsungGalaxy.TurnOff("Turning off");
        System.out.println("SamsungGalaxy State: " +samsungGalaxy.state);
        System.out.println("SamsungGalaxy Ports: " +samsungGalaxy.ports);
        System.out.println("SamsungGalaxy Number of Cameras: " +samsungGalaxy.cameras);
        System.out.println("SamsungGalaxy Facial Sensor: " +samsungGalaxy.facialSensor);
        System.out.println("SamsungGalaxy Fingerprint Sensor: " +samsungGalaxy.fingerPrintSensor);

        System.out.println("/n");

        SmartWatch appleWatch = new SmartWatch(false, "White", 1509.99, 6711, "Apple", "Serie 8", true, "IOs", 45, 38, "Off", true, "Aluminum", true, true);

        System.out.println("Apple Watch Camera: " + appleWatch.camera);
        System.out.println("Apple Watch Color: " + appleWatch.color);
        System.out.println("Apple Watch Price: " + appleWatch.price);
        System.out.println("Apple Watch ID: " + appleWatch.id);
        System.out.println("Apple Watch Brand: " + appleWatch.brand);
        System.out.println("Apple Watch Model: " + appleWatch.model);
        System.out.println("Apple Watch Touch Screen: " + appleWatch.touchScreen);
        System.out.println("Apple Watch OS: " + appleWatch.operationalSystem);
        System.out.println("Apple Watch Screen Length: " + appleWatch.screenSizeLength);
        System.out.println("Apple Watch Screen Width: " + appleWatch.screenSizeWidth);
        System.out.println("Apple Watch State: " + appleWatch.state);
        appleWatch.Initiate("Turning on");
        System.out.println("Apple Watch State: " + appleWatch.state);
        appleWatch.TurnOff("Turning off");
        System.out.println("Apple Watch State: " + appleWatch.state);
        System.out.println("Apple Watch Water Proof: " + appleWatch.waterProof);
        System.out.println("Apple Watch Strap Material: " + appleWatch.strapMaterial);
        System.out.println("Apple Watch Interchangeable Straps: " + appleWatch.interchangeableStraps);
        System.out.println("Apple Watch Monitors Physical Activity: " + appleWatch.monitorsPhysicalActivities);

    }

}
