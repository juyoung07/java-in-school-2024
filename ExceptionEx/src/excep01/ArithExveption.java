package excep01;

public class ArithExveption {

	public static void main(String[] args) {
		String[] name = new String[3];
		
		try {
			for (int i = 0; i <= name.length; i++) {
				System.out.println(name[i]);
			}
		} catch (Exception e) {		// 모든 예외를 받을 수 있음
			System.out.println(e.toString());
			System.out.println("예외발생");
		}
	}

}
