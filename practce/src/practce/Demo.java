package practce;

public class Demo {
	{
		System.out.println("I am instance block");
	}
	
	public Demo() {
		System.out.println("I am constructor");
	}
	
	static {
		System.out.println("I am static Block");
	}
	
	public static void main(String[] args) {
		System.out.println("I am Main Methods");
		Demo d = new Demo();
	}

}
