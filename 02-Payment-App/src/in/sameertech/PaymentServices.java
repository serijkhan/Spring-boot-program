package in.sameertech;

public class PaymentServices {
	
	private IPayment payment;
	
	public PaymentServices() {
		// TODO Auto-generated constructor stub
	}
	
	
	public PaymentServices(IPayment payment) {
		this.payment = payment;
	}
	
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}
	
	public void doPayment(double billAmt) {
		boolean status = payment.processPayment(billAmt);
		if(status) {
			System.out.println("printing recipt....");
		}else {
			System.out.println("Payment Declined..");
		}
	}

}
