package practce;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File f2 = new File("sameer.txt");
		
		if(f2.delete()) {
			System.out.println("I have Delete"+"--"+f2.getName());
		}else {
			System.out.println("Some problem Occured");
		}
	}

}
