package observer.withobserver;

@FunctionalInterface
public interface PaymentListener {
    void makePayment(DataModel dataModel);
}
