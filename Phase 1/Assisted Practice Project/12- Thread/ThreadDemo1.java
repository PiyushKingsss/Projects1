package Thread2;

public class ThreadDemo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MyMath math = new MyMath();
			math.start();
			System.out.println("Program Executed");

		}

	}

	class MyMath extends Thread {
		
		public void run() {
			print();
		}
		public void print() {
			for (int i = 1 ; i<=11;i++) {
				System.out.println(i);
			}
		}
		
	}

	