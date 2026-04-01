abstract class Order {
    abstract void processOrder();
}
interface OnlinePayment {
    void onlinePay();

    default void pay() {
        System.out.println("Payment made via Online method.");
    }
}

interface CashPayment {
    void cashPay();

    default void pay() {
        System.out.println("Payment made via Cash.");
    }
}
class SmartOrder extends Order implements OnlinePayment, CashPayment {
    class Invoice {
        void generateInvoice() {
            System.out.println("Invoice generated for the order.");
        }
    }

    Invoice invoice = new Invoice();

    @Override
    void processOrder() {
        System.out.println("Processing order...");
        invoice.generateInvoice();
    }

    @Override
    public void onlinePay() {
        System.out.println("Processing online payment...");
    }

    @Override
    public void cashPay() {
        System.out.println("Processing cash payment...");
    }
    @Override
    public void pay() {
        OnlinePayment.super.pay();
        CashPayment.super.pay();
        System.out.println("Payment completed successfully.");
    }
}
public class MainQ9 {
    public static void main(String[] args) {
        SmartOrder order = new SmartOrder();
        order.processOrder();
        order.onlinePay();
        order.cashPay();
        order.pay();
    }
}
