package Thread2;

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		Thread th = new Thread(t);
		th.start();
		System.out.println("Program Executed");
		
	}

}
class Test implements Runnable {
	
	public void run() {
		for(int i = 1 ; i<11;i++) {
			System.out.println(i);
		}
	}
}
