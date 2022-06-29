package variable;

public class Ex07 {

	public static void main(String[] args) {
		//byte a = 128; 지정된 크기보다 더 큰수를 담을수는 없다.
		
		byte b = -128;
		byte c = 127;
		
		System.out.println(b);
		System.out.println(c);
		
		long d =  1234567891234567891L;
		float e = 123456789123456789123f;
		//실수는 더 큰수가 표현이 가능하다.
		System.out.println(d);
		System.out.println(e);
		
		double f = 3e2;//300.0
		double g = 5e-3;//0.005
		System.out.println(f);
		System.out.println(g);
		//부동소수점 방식에서 e,E 는 1의 지수를 나타낸다.3e2 = 3을기준으로 오른쪽으로2칸 ->300, 5e-3 = 5기준으로 왼쪽으로3칸 -> 0.005
	}

}
