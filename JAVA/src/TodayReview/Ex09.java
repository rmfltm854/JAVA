package variable;

public class Ex09 {

	public static void main(String[] args) {
		
		byte a = 65;
		char ch = (char)a;//캐스팅
		//char는 음수가 없는 특수자료형이기 때문에
		//자동 타입변환 예외이다. 강제 타입변환 형식으로 해준다.
		System.out.println(ch);
		
		int b = 128;
		byte c = (byte)b;
		//지정된 타입보다 값이 더 클 경우 강제 타입변환을 하면 
		//(Overflow) : 가장 작은값으로 되돌아간다.
		System.out.println(c);
		
		float d = 3.14f;
		int e = (int)d;
		//실수로 정수로 강제 타입변환을 하면 정수부분만 저장된다
		System.out.println(e);

	}

}
