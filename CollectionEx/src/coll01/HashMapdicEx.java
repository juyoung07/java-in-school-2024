package coll01;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapdicEx {

	public static void main(String[] args) {
		// key와 value 값을 쌍으로 저장하는 객체 생성
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("love", "사랑");
		dic.put("like", "좋아하다");
		dic.put("sad", "슬픔");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("찾고 싶은 단어는? >> ");
			String eng = sc.next();
			
			if (eng.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String kor = dic.get(eng);	// 저장되어 있지 않은 key를 이용하면 null 반환
			
			if (kor == null) System.out.println(eng + "은(는) 없는 단어입니다.");
			else System.out.println(kor);
			
		}
	}

}
