abstract class Vehicle {
    abstract void startEngine(); // must be defined by every vehicle
}
interface ElectricSystem {
    void showElectricStatus();

    default void showStatus() {
        System.out.println("Electric System: Battery is fully charged.");
    }
}

interface GPSSystem {
    void showLocation();

    default void showStatus() {
        System.out.println("GPS System: Location is active.");
    }
}
class SmartVehicle extends Vehicle implements ElectricSystem, GPSSystem {
    class Engine {
        void run() {
            System.out.println("Engine is running smoothly.");
        }
    }

    Engine engine = new Engine();
    @Override
    void startEngine() {
        System.out.println("SmartVehicle starts with push-button ignition.");
        engine.run();
    }
    @Override
    public void showElectricStatus() {
        System.out.println("Electric Mode: ON");
    }
    @Override
    public void showLocation() {
        System.out.println("Current Location: Karachi");
    }
    @Override
    public void showStatus() {
        ElectricSystem.super.showStatus();
        GPSSystem.super.showStatus();
        System.out.println("SmartVehicle: All systems functioning properly.");
    }
}
public class MainQ5 {
    public static void main(String[] args) {
        SmartVehicle car = new SmartVehicle();
        car.startEngine();
        car.showElectricStatus();
        car.showLocation();
        car.showStatus();
    }
}
