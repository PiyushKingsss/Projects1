package text12;
import java.io.FileWriter;
import java.io.IOException;

public class Append {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer = null;
	      try {
	        // open file in append mode
	        writer = new FileWriter("one.txt", true);
	        writer.write(" appendedText");
	      } catch (IOException e) {
	        e.printStackTrace();
	      } finally {
	        if (writer != null) {
	          writer.close();
	      }
	   }
	}
}


