package excep01;

import java.io.*;

public class Echo02Ex {

	public static void main(String[] args) {
		InputStream is = System.in;
		try {
			while(true) {
				int i = is.read();
				if (i == -1) 	// ctrl + z를 입력하면 true
					break;
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
