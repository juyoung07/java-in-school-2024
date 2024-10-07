package th04;

class Top implements Runnable {
	public void run() {
		for (int i = 1; i < 50; i++) {
			try { Thread.sleep(50); } catch (Exception e) {}
			if (i % 5 != 0) System.out.println(i + " \t");
			else System.out.println(i);
		}
	}
}

public class RunnableEx02 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Top t = new Top();
		
		Thread thd1 = new Thread(t);
		Thread thd2 = new Thread(t);
		
		thd1.start();
		thd2.start();
		
		System.out.println("프로그램 종료");
	}

}
