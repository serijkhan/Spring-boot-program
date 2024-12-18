package practce;

public class Try {
	
	public static void main(String[] args) {
		System.out.println("Main Methods is Started...");
		
		try {
			System.out.println("Try Block is Started..");
			int i = 10/2;
			System.out.println("try block is ended..");
			
//		}catch(Arithematic Exception e) {
//			System.out.println("catch block statred");
//			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("catch block");
			e.printStackTrace();
		}finally {
			System.out.println("Finally- block");
		}
		System.out.println("main method is ended");
	}

}
