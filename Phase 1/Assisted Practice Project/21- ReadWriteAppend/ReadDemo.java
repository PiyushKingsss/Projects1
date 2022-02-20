package text12;

import java.io.FileReader;

public class ReadDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader("one.txt");
		int number = 0;
		while ((number = reader.read()) != -1) {
			System.out.print((char)number);
		}

	}

}
