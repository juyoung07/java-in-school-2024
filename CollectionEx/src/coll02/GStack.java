package coll02;

public class GStack<T> {
	int tos;
	Object []stck;
	
	public GStack() {
		tos = 0;
		// stck 배열 객체변수는 10개의 공간을 확보, Object 클래스 타입은 모든 데이터 저장 가능
		stck = new Object[10];
	}
	
	public void push(T item) {
		if (tos == 10) return;
		stck[tos] = item;
		tos++;
	}
	public T pop() {
		if (tos == 0) return null;
		tos--;
		return (T)stck[tos];	// stck[tos]를 (T)타입으로 형변환
	}

}
