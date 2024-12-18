package practce;

public class Scenerio {
	
	public static void main(String[] args) {
		System.out.println("main Method is started...");
		
		try {
			System.out.println("try-block-started");
			int i= 10/0;
			System.out.println("try-block-ended...");
		}finally {
			System.out.println("finally block");
		}
		System.out.println("main-methods is ended..");
	}

}
