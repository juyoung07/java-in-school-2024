package th01;

class Top extends Thread {
	public void run() {
		for (int i = 1; i < 50; i++) {
			if (i % 5 != 0) System.out.print(i + " \t");
			else System.out.println(i);
		}
	}
}

public class ThreadEx01 {
	public static void main(String[] args) {
		// main 스레드 동작
		System.out.println("프로그램 시작");
		Top d = new Top(); 		// Top 스레드 클래스 객체 생성
		d.start();				// d 스레드가 실행되면 start() 메소드가 호출됨
		System.out.println("프로그램 종료");
		// main 스레드 종료되더라도 d 스레드는 실행함
		// main과 d는 별개로 실행된다.
	}

}
