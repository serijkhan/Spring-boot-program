package practce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BuffDemo {
	public static void main(String[] args) {
		File f4 = new File("sameer.txt");
		
		try {
			FileReader fr = new FileReader(f4);
			BufferedReader br = new BufferedReader(fr);
			String Line = br.readLine();
			while(Line != null) {
				System.out.println(Line);
				Line = br.readLine();
			}
			br.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
