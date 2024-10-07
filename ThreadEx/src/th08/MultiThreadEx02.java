package th08;

class Summing {
	private int sum;
	
	public synchronized void sumTo(int num) {
		// 동기화를 하지 않은 경우
		// 어떤 스레드가 sumTo() 메소드에 진입하여서 메소드 실행이 끝나기 전에
		// 또 다른 스레드가 sumTo() 메소드에 진입할 수 있기 때문에
		// 스레드 A, 스레드 B가 비정상적으로 합계를 출력함
		
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

public class MultiThreadEx02 extends Thread {
	private Summing sum;
	private int num;
	
	public MultiThreadEx02(String s, Summing sum, int num) {
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
		
		MultiThreadEx02 a = new MultiThreadEx02("A", sum, 5);
		MultiThreadEx02 b = new MultiThreadEx02("B", sum, 5);
		
		a.setPriority(8);
		b.setPriority(10);
		
		a.start();
		b.start();
	}

}
