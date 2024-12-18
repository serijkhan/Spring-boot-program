package practce;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo2 {
	public static void main(String[] args) {
		 File f1 = new File("sameer.txt");
		 
		 try {
			 
			 Scanner sc = new Scanner(f1);
			 while(sc.hasNextLine()) {
				 String nextLine = sc.nextLine();
				 System.out.println(nextLine);
			 }
			  sc.close();
			 
		 }catch(FileNotFoundException e) {
			 e.printStackTrace();
		 }
				 
	}

}
