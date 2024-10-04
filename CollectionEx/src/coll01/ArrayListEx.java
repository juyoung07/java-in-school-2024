package coll01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// 문자열 데이터만 저장하는 collection 객체 생성
		ArrayList<String> st = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 : ");
			st.add(sc.next());
		}
		for (int i = 0; i < st.size(); i++) {
			System.out.print(st.get(i) + " ");
		}
		
		int longestIndex = 0; 
		for (int i = 1; i < st.size(); i++) {
			if (st.get(longestIndex).length() < st.get(i).length())
				longestIndex = i;
		}
		
		System.out.println("\n가장 긴 이름은 : " + st.get(longestIndex));
		
		sc.close();
	}

}
