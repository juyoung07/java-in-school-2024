package coll01;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		int sum = 0;
		// v 객체의 처음 데이터를 가리킴
		it = v.iterator();
		
		while(it.hasNext()) {
			sum += it.next();
		}
		
		System.out.println("벡터에 있는 정수의 합 : " + sum);
	}

}
