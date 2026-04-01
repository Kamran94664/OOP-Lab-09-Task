interface FraudChecker {
    void checkFraud();
}
interface Auditor {
    void generateReport();
}
public class MainQ3 {
    public static void main(String[] args) {
        FraudChecker fraudChecker = new FraudChecker() {
            @Override
            public void checkFraud() {
                System.out.println("Fraud check completed: No suspicious activity found.");
            }
        };
        Auditor auditor = new Auditor() {
            @Override
            public void generateReport() {
                System.out.println("Auditor report: Financial records are accurate.");
            }
        };
         fraudChecker.checkFraud();
        auditor.generateReport();
    }
}