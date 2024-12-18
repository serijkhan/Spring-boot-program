package in.sameertech;

public class CredCardPayment implements IPayment {
	
	public boolean processPayment(double billAmt) {

	System.out.println("Credit Card Payment Processed...");
	return true;
	
	}

}
