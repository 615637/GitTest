package pack02_trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex05_Throws {
	public static void main(String[] args) {
		try {
			
		}catch() {
			e.printStackTrace();
		}
	}
	public static void errorMethod() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("a");
	}
}
