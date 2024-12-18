package in.sameerit.beans;

public class CreditCardPayment implements IPayment{
	
	public CreditCardPayment() {
	System.out.println("CreditCardPayment :: Constructor");
	}
	
	
	public boolean processPayment(double billAmt) {
       System.out.println("CreditCard Payment sucessfull...");		
		return true;
	}

}
