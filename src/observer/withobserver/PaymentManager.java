package observer.withobserver;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {
    List<PaymentListener> makePaymentList = new ArrayList<>();


    void registerPaymentListener(PaymentListener paymentListener){
        makePaymentList.add(paymentListener);
    }

    void unregisterPaymentListener(PaymentListener paymentListener){
        makePaymentList.remove(paymentListener);
    }
    void pay(DataModel dataModel) {
        for ( PaymentListener job  :  makePaymentList ) {
            job.makePayment(dataModel);
        }

    }

}
