package excep01;

import java.io.FileReader;
import java.io.FileWriter;

public class FileEx {

	public static void main(String[] args) {
		try {
			// 아래 문장에서 예외가 발생하지 않으면 모두 실행한다
			FileReader fr = new FileReader("data.txt");
			FileWriter fw = new FileWriter("dataw.txt");
			int c;
			while ((c = fr.read()) != -1) {	// -1은 파일의 끝을 의미
				fw.write(c);				// dataw.txt 파일에 출력
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("예외 발생");
		}
	}

}
