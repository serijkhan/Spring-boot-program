package in.sameertech;

public class App {
	
	public static void main(String[] args) {
		
		IPayment p1 = new CredCardPayment();
		//Ipayment p2 = new DebitCardPayment();
		
		//constructor injection
		PaymentServices ps = new PaymentServices(p1);
		//setter injection
		//ps.setPayment(p2);
		
		ps.doPayment(100.00);
	}

}
