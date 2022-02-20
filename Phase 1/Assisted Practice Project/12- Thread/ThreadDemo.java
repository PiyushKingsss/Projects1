package Thread;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath math = new MyMath();
		math.print();
		System.out.println("Program Executed");

	}

}

class MyMath {
	public void print() {
		for (int i = 1 ; i<=11;i++) {
			System.out.println(i);
		}
	}
}


