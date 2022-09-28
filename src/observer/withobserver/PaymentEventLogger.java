package observer.withobserver;

public class PaymentEventLogger implements PaymentListener {

    private void eventLog( DataModel dataModel){
        System.out.println("some events is logged  >" + dataModel.getId() + "  " + dataModel.getSomething() );
    }

    @Override
    public void makePayment(DataModel dataModel) {
        eventLog(dataModel);
    }
}
