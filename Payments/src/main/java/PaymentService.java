import Paymentgateway.PaymentGateway;

public class PaymentService {

    private PaymentGateway gateway;

    public PaymentService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public boolean makePayment(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }

        return gateway.pay(amount);
    }
}
