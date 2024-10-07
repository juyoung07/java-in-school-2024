package th06;

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
		
		Thread thd1 = new Thread(t);
		Thread thd2 = new Thread(t);
		
		thd1.setName("new_a");
		thd2.setName("new_b");		
		thd1.setPriority(9);		// thd1의 우선순위를 9로 설정
		thd2.setPriority(thd2.MIN_PRIORITY);	// 우선순의를 최소로 설정
		
		System.out.println("thd1 우선순위 : " + thd1.getPriority());
		System.out.println("thd2 우선순위 : " + thd2.getPriority());
		
		thd1.start();
		thd2.start();
		
		System.out.println("프로그램 종료");
	}

}
