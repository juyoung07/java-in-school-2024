package coll01;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentEx {

	public static void main(String[] args) {
		// key는 문자열 데이터, value는 Student 클래스 객체를 저장
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		map.put("윤주일", new Student(1, "010-1111-1111"));
		map.put("윤주이", new Student(2, "010-2222-2222"));
		map.put("윤주삼", new Student(3, "010-3333-3333"));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 이름? >> ");
			String name = sc.nextLine();
			
			if (name.equals("exit")) break;
			
			// 실제로 여기서 객체가 생성됨
			Student student = map.get(name);
			
			if(student == null) System.out.println(student + "은(는) 없는 사람입니다.");
			else System.out.println("id : " + student.getId() + "\n전화번호 : " + student.getTel());
		}
	}

}
