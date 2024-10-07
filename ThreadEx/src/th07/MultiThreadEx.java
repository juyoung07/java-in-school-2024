package th07;

class Summing {
	private int sum;
	
	public synchronized void sumTo(int num) {
		// 동기화한 경우에 먼저 sumTo() 메소드에 진입한 스레드가 
		// sumTo() 메소드를 종료한 후에 다른 스레드가 진입할 수 있음
		// 이 경우에는 스레드 A, 스레드 B가 정상적으로 합계를 출력함
		
		sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.print("스레드 : " + Thread.currentThread().getName());		// 현재 스레드의 이름 출력
			System.out.println("의 1 ~ " + i + "까지 합은 " + sum);
			
			try {
				Thread.sleep(500);		// 0.5초씩 실행 지연
			} catch (InterruptedException e) {}
		}
	}
	public int getSum() { return sum; }
}

public class MultiThreadEx extends Thread {
	private Summing sum;
	private int num;
	
	public MultiThreadEx(String s, Summing sum, int num) {
		super(s);		// 스레드 이름 설정
		this.sum = sum;
		this.num = num;
		System.out.println("스레드 : " + this.getName() + "가 시작됨");
	}
	
	public void run() {
		sum.sumTo(num);		// sumTo(5) 메소드가 호출됨
		System.out.println("스레드 : " + getName() + "가 종료됨");
	}
	
	public static void main(String[] args) {
		Summing sum = new Summing();
		
		MultiThreadEx a = new MultiThreadEx("A", sum, 5);
		MultiThreadEx b = new MultiThreadEx("B", sum, 5);
		
		a.setPriority(8);
		b.setPriority(10);
		
		a.start();
		b.start();
	}

}
