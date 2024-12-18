package practce;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileData {
	public static void main(String[] args) {
		
		File f = new File("sameer.txt");
		
		try {
			FileWriter fr = new FileWriter(f);
			
			fr.write("welcome to sameerit Software instituate");
			fr.close();
		}catch(IOException e) {
			 e.printStackTrace();
		}
		
		System.out.println("Done.....");
	}

}
