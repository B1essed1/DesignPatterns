package observer.withobserver;

public class Main {
    public static void main(String[] args) {
        PaymentManager paymentManager = new PaymentManager();
        PaymentListener sendNotif = new NotificationManager();
        PaymentListener eventLog = new PaymentEventLogger();
        paymentManager.registerPaymentListener(sendNotif);
        paymentManager.registerPaymentListener((e)-> new NotificationManager());
        paymentManager.registerPaymentListener(eventLog);

    }
}
