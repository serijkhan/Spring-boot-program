package in.sameer;

public class Car  {
	
	private IEngine eng;
	
	public Car(IEngine eng) {
		this.eng = eng;
	}

	public void drive() {
		
		int status = eng.start();
		
		if(status >= 1) {
			System.out.println("journey started");
		}else {
			System.out.println("terminated Engine");
		}
	}

}
