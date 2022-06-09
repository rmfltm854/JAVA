package variable;

public class Ex08 {

	public static void main(String[] args) {
		
		//자동 타입변환
		byte a = 10;
		int b = a; // 자동 타입변환
		
		//char ch = a;
		//음수가 저장될 수 있는 byte타입을 char 타입으로 자동타입변환 시킬 수 없다.
		System.out.println(b);
		
		byte c = 10;
		byte d = 20;
		
		//byte result1 = c + d; 정수형 연산은 int형 으로 연산을 한다.
		int result2 = c+ d;
		System.out.println(result2);
		
		int e = 10;
		double f = 10.2;
		double result3 = e + f;
		//int 타입 피연산자가 double 타입으로 자동 타입변환되고 연산을 수행
		System.out.println(result3);
		
		char ch1 = 'A';
		int g = ch1; //char는 실제로는 정수로 저장
		//int 타입으로 자동타입 변환이 된다.
		System.out.println(g);
	}

}
