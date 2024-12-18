package in.sameertech;

public class SodexoPayment implements IPayment {
	
	@Override
	public boolean processPayment(double billAmt) {
		//logic
        System.out.println("Sedoxo  Payment processed...");
		return true;
	}
	
	

}
