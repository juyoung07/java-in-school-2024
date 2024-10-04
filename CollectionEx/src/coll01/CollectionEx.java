package coll01;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionEx {
	
	static void printList(LinkedList<String> I) {
		Iterator<String> iterator = I.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if (iterator.hasNext()) separator = "->";
			else separator = "\n";
			System.out.print(e + separator);
		}
	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("하나");
		list.add("둘");
		list.add("셋");
		
		printList(list);
		
		list.add(0, "넷");
		list.add(2, "다섯");
		
		printList(list);
		
		int index1 = Collections.binarySearch(list, "둘") + 1;
		System.out.println("둘은 " + index1 + "번째 요소입니다.");
		
		Collections.sort(list);
		printList(list);
		
		int index2 = Collections.binarySearch(list, "둘") + 1;
		System.out.println("둘은 " + index2 + "번째 요소입니다.");
		
		// 역순 정렬
		Collections.reverse(list);
		printList(list);
		
		// binarySearch는 이분검색으로 데이터가 정렬되어 있어야 함.
		int index3 = Collections.binarySearch(list, "다섯") + 1;
		System.out.println("다섯은 " + index3 + "번째 요소입니다.");

	}

}
