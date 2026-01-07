import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Paymentgateway.PaymentGateway;

class Paymentgateway {

		    // 1️⃣ Successful payment
		    @Test
		    void successfulPayment() {
		        PaymentGateway gateway = mock(PaymentGateway.class);
		        when(gateway.pay(500)).thenReturn(true);

		        PaymentService service = new PaymentService(gateway);

		        assertTrue(service.makePayment(500));
		    }

		    // 2️⃣ Invalid amount
		    @Test
		    void invalidAmountPayment() {
		        PaymentGateway gateway = mock(PaymentGateway.class);
		        PaymentService service = new PaymentService(gateway);

		        assertThrows(IllegalArgumentException.class, () -> {
		            service.makePayment(-100);
		        });
		    }

	}

			@Test
		    void paymentGatewayError() {
		        PaymentGateway gateway = mock(PaymentGateway.class);
		        when(gateway.pay(1000)).thenThrow(new RuntimeException("Gateway down"));

		        PaymentService service = new PaymentService(gateway);

		        assertThrows(RuntimeException.class, () -> {
		            service.makePayment(1000);
		        });
		    }
		}

	}

}
