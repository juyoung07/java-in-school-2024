package th05;

class Top implements Runnable {
	public void run() {
		for (int i = 1; i < 30; i++) {
			// 현재 실행되고 이쓴 스레드의 이름 출력
			System.out.print((Thread.currentThread()).getName() + i + " \t");
		}
	}
}

public class RunnableEx03 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Top t = new Top();
		
		Thread thd1 = new Thread(t, "a");
		Thread thd2 = new Thread(t, "b");
		
		System.out.println("thd1 우선순위 : " + thd1.getPriority());
		System.out.println("thd2 우선순위 : " + thd2.getPriority());
		
		thd1.start();
		thd2.start();
		
		System.out.println("프로그램 종료");
	}

}
