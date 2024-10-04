package coll01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("윤주영", 97);
		scoreMap.put("윤주일", 88);
		scoreMap.put("윤주이", 98);
		scoreMap.put("윤주삼", 70);
		scoreMap.put("윤주사", 99);
		
		System.out.println("HashMap의 요소 개수" + scoreMap.size());
		
		// key 데이터들만 모아서 keys 객체에 저장
		Set<String> keys = scoreMap.keySet();
		
		// 생성된 객체변수(keys)를 가지고 순차적으로 접근할 수 있는 객체 (it) 생성
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			// key 값 저장
			String name = it.next();
			
			// key 값에 해당하는 value 값 저장
			int score = scoreMap.get(name);
			
			System.out.println(name + " : " + score);
			
			
		}
		
	}

}
