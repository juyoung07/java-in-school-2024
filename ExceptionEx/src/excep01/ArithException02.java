package excep01;

public class ArithException02 {
	public static void main(String []args) {
		String[] name = new String[3];
		name[0] = "윤";
		name[1] = "주";
		name[2] = "영";
		int a = 123, b = 0, c;
		
		try {
			c = a/b;	// 이 문장에서 예외가 발생하면 아래 문장은 실행 X
			
			System.out.println(c);
			for (int i = 0; i < name.length; i++)
				System.out.println(name[i]);
			
		} catch (ArithmeticException ar) {	// 예외가 발생하지 않으면 finally 실행
			System.out.println("0으로 나누었음");
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("배열 범위 벗어난 예외 발생");
		} catch (Exception e) {
			System.out.println("예외발생");
			System.out.println(e.toString());
		} finally {
			System.out.println("무조건 실행");
		}
	}
}
