abstract class Appliance {
    abstract void turnOn();
}
interface VoiceControl {
    void voiceCommand();

    default void executeCommand() {
        System.out.println("Executing command via Voice Control.");
    }
}

interface RemoteControl {
    void remoteCommand();

    default void executeCommand() {
        System.out.println("Executing command via Remote Control.");
    }
}
class SmartDevice extends Appliance implements VoiceControl, RemoteControl {

    // Inner class (belongs to device)
    class Settings {
        void displaySettings() {
            System.out.println("Settings: Brightness medium, Volume low.");
        }
    }

    Settings settings = new Settings();

    @Override
    void turnOn() {
        System.out.println("Device is turning on...");
        settings.displaySettings();
    }

    @Override
    public void voiceCommand() {
        System.out.println("Voice command received.");
    }

    @Override
    public void remoteCommand() {
        System.out.println("Remote command received.");
    }
    @Override
    public void executeCommand() {
        VoiceControl.super.executeCommand();
        RemoteControl.super.executeCommand();
        System.out.println("Command executed successfully.");
    }
}
public class MainQ8 {
    public static void main(String[] args) {

        SmartDevice device = new SmartDevice();
        device.turnOn();
        device.voiceCommand();
        device.remoteCommand();
        device.executeCommand();
    }
}