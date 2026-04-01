abstract class Patient {
    abstract void getTreatment();
}
interface InsuranceService {
    void showCoverage();

    default void showStatus() {
        System.out.println("Insurance: Coverage is active.");
    }
}

interface EmergencyService {
    void emergencyResponse();

    default void showStatus() {
        System.out.println("Emergency: Immediate assistance available.");
    }
}
class SmartPatient extends Patient implements InsuranceService, EmergencyService {
    class MedicalHistory {
        void displayHistory() {
            System.out.println("Medical History: No major illnesses.");
        }
    }

    MedicalHistory history = new MedicalHistory();

    @Override
    void getTreatment() {
        System.out.println("Patient receiving specialized treatment.");
        history.displayHistory();
    }

    @Override
    public void showCoverage() {
        System.out.println("Insurance covers 80% of expenses.");
    }

    @Override
    public void emergencyResponse() {
        System.out.println("Emergency team dispatched immediately.");
    }
    @Override
    public void showStatus() {
        InsuranceService.super.showStatus();
        EmergencyService.super.showStatus();
        System.out.println("Patient services are fully operational.");
    }
}
public class MainQ7 {
    public static void main(String[] args) {

        SmartPatient patient = new SmartPatient();
          patient.getTreatment();
        patient.showCoverage();
        patient.emergencyResponse();
        patient.showStatus();
    }
}