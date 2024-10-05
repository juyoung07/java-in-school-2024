package coll01;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(10);
		v.add(-4);
		
		// 인덱스 2번쨰에 저장되고 뒤의 데이터는 한 칸씩 밀려남
		v.add(2, 100);
		
		// 백터에 실제 데이터가 저장되어 있는 개수
		System.out.println("백터 내의 요소 객체 수 : " + v.size());
		
		// 백터의 실제 용량
		System.out.println("백터의 실제 용량 : " + v.capacity());

	}

}
