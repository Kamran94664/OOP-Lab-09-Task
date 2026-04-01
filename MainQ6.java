interface IoTDevice {
    default void update() {
        System.out.println("Updating device firmware...");
    }
    static void info() {
        System.out.println("IoT Device: Smart connected device.");
    }
}
class SmartSensor implements IoTDevice {
}
public class MainQ6 {
    public static void main(String[] args) {
        SmartSensor device = new SmartSensor();
        device.update();
       IoTDevice.info();
    }
}
