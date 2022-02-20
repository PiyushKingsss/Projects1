package HarryP;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter operator");
		String c = sc.next();
		if (c.equals("+")) {
			System.out.println("Additon is"+" "+(a+b));
			}
		else if (c.equals("-")) {
			System.out.println("Subraction is"+" "+(a-b));
		}
		else if (c.equals("*")) {
			System.out.println("Multiplication is"+" "+(a*b));
		}
		else if (c.equals("/")) {
			System.out.println("Division is"+" "+((float) a/(float) b));
		}
		
		else {
			System.out.println("Invalid");
		}
		
	    

	}

}
