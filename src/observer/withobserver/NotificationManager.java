package observer.withobserver;

public class NotificationManager implements PaymentListener {
    private void sendNotification(DataModel dataModel){
        System.out.println("Notification is sent " + dataModel.getSomething()+ "   " + dataModel.getId());
    }

    @Override
    public void makePayment(DataModel dataModel) {
       sendNotification(dataModel);
    }
}
