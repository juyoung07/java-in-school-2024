package th10;

// 동기화를 하지 않은 예제
// 공유 데이터 클래스 정의
class Bank {
	private int money = 10000;
	
	public int getMoney() { return this.money; }
	public void setMoney(int money) { this.money = money; }
	
	public void saveMoney(int save) {
		int m = this.getMoney();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 기존 금액에서 입금 금액을 합한 후 저장
		this.setMoney(m + save);
	}
	
	public void minusMoney(int minus) {
		int m = this.getMoney();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 기존 금액에서 출금 금액을 뺀 나머지를 저장
		this.setMoney(m - minus);
	}
}

class Family1 extends Thread {
	public void run() {
		BankEx02.mybank.saveMoney(5000);
		System.out.println("saveMoney(5000) : " + BankEx02.mybank.getMoney());
	}
}
class Family2 extends Thread {
	public void run() {
		BankEx02.mybank.minusMoney(2000);
		System.out.println("minusMoney(2000) : " + BankEx02.mybank.getMoney());
	}
}

public class BankEx02 extends Thread {
	public static Bank mybank = new Bank();
	
	public static void main(String[] args) {
		System.out.println("원금: " + mybank.getMoney());
		
		Family1 f1 = new Family1();
		Family2 f2 = new Family2();
		
		f1.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		f2.start();
	}

}
