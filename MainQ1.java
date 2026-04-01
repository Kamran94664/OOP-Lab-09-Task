interface WiFi {
    default void connect() {
        System.out.println("Connecting via WiFi...");
    }
}
interface Bluetooth {
    default void connect() {
        System.out.println("Connecting via Bluetooth...");
    }
}
class SmartDevices implements WiFi, Bluetooth {
    @Override
    public void connect() {
        WiFi.super.connect();
        Bluetooth.super.connect();
        System.out.println("SmartDevice connected using both WiFi and Bluetooth.");
    }
}

class FAST {
    String universityName = "FAST University";
    class Department {
        String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }
        void display() {
            System.out.println("Department: " + deptName);
            System.out.println("University: " + universityName);
        }
    }
}
public class MainQ1 {
    public static void main(String[] args) {
        SmartDevices device = new SmartDevices();
        device.connect();
        FAST fast = new FAST();
        FAST.Department dept = fast.new Department("Computer Science");
        dept.display();
    }
}