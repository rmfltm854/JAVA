package ITbank;

public class TodayReview0608 {

	public static void main(String[] args) {
		char c1 = 'a';//문자는 작은 따옴표
		
		/*byte = 1바이트
		short = 2바이트
		char = 2바이트
		int = 4바이트
		long = 8바이트
		float = 4바이트
		double = 8바이트
		boolean = 1바이트*/
	System.out.println(1 > 3);
	System.out.println(6 < 10);
	System.out.println(10 <= 10);
	//비교연산자 = true or false
	double f = 3e2;
	double g = 5e-3;
	System.out.println(f);//부동소수점방식에서는 e,E 는 1의지수
	System.out.println(g);
	// 3e2 는 3에서 앞으로 2칸 >> 300
	//5e-3 은 5에서 뒤로 3칸 >> 0.005
	
	byte a = 10;
	int b = a;//자동으로 byte > int///
	
	//char ch = a;
	//음수가 저장될수있는 byte타입을 char 타입으로는 자동변환 시킬수없다.
	
	byte c = 10;
	byte d = 20;
	
	int result2 = c+ d;
	System.out.println(result2);
	//결과는 30, byte 형이지만 정수형 연산은 int형으로 연산을진행한다.
	
	int e = 10;
	double h = 10.2;
	double result3 = e + g;
	System.out.println(e + g);
	//int 타입 이 double로 자동변환되면서 연산진행
	//실수형 연산은 double 로 한다.
	
	byte z = 65;
	char ch = (char)a;//캐스팅
	//char 는 음수가없는 자료형
	//강제로 타입을변환해준다 
	//해주는 방법 = 오른쪽 앞에 강제로바꿀 자료형 ()안에 적어준다
	
	int q = 128;
	byte x = (byte)q;
	//byte 값의 범위는 (-128 ~ 127)
	//범위를 넘어갈경우 다시 최소수로 넘어간다//
	System.out.println(x);
	
	float y = 3.14f;
	int o = (int)y;
	System.out.println(o);

	}

}
