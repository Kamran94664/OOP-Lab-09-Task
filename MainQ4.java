interface GPSTracking {
    void trackLocation();
}

interface PaymentSystem {
    void makePayment(double amount);
}

class Ride implements GPSTracking, PaymentSystem {

    @Override
    public void trackLocation() {
        System.out.println("Tracking ride location via GPS...");
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed successfully.");
    }
    static class CompanyRules {
        static void showRules() {
            System.out.println("Company Rules:");
            System.out.println("1. Wear seatbelt");
            System.out.println("2. No smoking in ride");
            System.out.println("3. Follow traffic laws");
        }
    }
}

public class MainQ4 {
    public static void main(String[] args) {

        Ride ride = new Ride();
        ride.trackLocation();
        ride.makePayment(25.5);
       Ride.CompanyRules.showRules();
    }
}