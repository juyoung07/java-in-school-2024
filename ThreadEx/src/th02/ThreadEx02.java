package th02;

class DerivedThread extends Thread {
	public void run() {
		for (int i = 1; i < 50; i++) {
			if (i % 5 != 0) System.out.print(i + " \t");
			else System.out.println(i);
		}
	}
}

public class ThreadEx02 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		DerivedThread d1 = new DerivedThread();
		DerivedThread d2 = new DerivedThread();
		
		d1.start();
		d2.start();
		
		System.out.println("프로그램 종료");
		
		// 2개의 스레드가 작동하고 run() 메소드를 호출하기 때문에 출력 값이 이상하게 나옴
	}

}
