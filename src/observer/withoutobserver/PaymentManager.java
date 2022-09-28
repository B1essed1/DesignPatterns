package observer.withoutobserver;

import observer.withoutobserver.NotificationManager;
import observer.withoutobserver.PaymentEventLogger;

public class PaymentManager {

    private final NotificationManager notificationManager = new NotificationManager();
    private final PaymentEventLogger paymentEventLogger= new PaymentEventLogger();

    public void pay(){
        notificationManager.sendNotification();
        paymentEventLogger.eventLog();
    }
}
