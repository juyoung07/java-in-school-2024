package excep01;

public class ThrowExam {
	public static void arrayMethod() throws ArrayIndexOutOfBoundsException {
		String[] name = new String[3];
		name[0] = "윤주영";
		name[1] = "윤주양";
		name[2] = "윤주용";
		name[3] = "윤주융";
	}

	public static void main(String[] args) {
		ThrowExam ts = new ThrowExam();
		try {
			arrayMethod();
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.toString());
			System.out.println("배열 예외 발생");
		}
	}

}
