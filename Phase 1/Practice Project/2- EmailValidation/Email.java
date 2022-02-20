package EmailValidation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	

	public static void main(String[] args) {
		//Reading String from user
	      System.out.println("Enter a String");
	      Scanner sc = new Scanner(System.in);
	      String input = sc.nextLine();
	      //Regular expression to match any character
	      String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	      //Compiling the regular expression
	      Pattern pattern = Pattern.compile(regex);
	      //Retrieving the matcher object
	      Matcher matcher = pattern.matcher(input);
	      if(matcher.matches()) {
	         System.out.println("Match occurred");
	      } else {
	         System.out.println("Match not occurred");
	      }

	}

}
