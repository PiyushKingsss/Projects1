package text12;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("one.txt");
			writer.write("Hell0 all,welcome to shark tank");
			writer.write("Today is the first day");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
