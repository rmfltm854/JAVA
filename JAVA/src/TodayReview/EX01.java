package operation;

public class EX01 {

	public static void main(String[] args) {
		
		int i, j;
		
		i = +100; //부호연산자
		j = -200;
		System.out.println(i + j);//산술연산자
		
		//증감연산자 독립사용일때
		int x = 1;
		int y = 1;
		
		x++;
		y = x;
		System.out.printf("결과 >> x: %d, y : %d\n\n", x, y);
		
		--x;
		y = x;
		System.out.printf("결과 >> x: %d, y : %d\n\n", x, y);
		
		//증가연산자의 독립사용이 아닐떄
		
		y = ++x;
		//연산과정 : x를 1증가 후 y = x를 실행
		System.out.printf("결과 >> x: %d, y : %d\n\n", x, y);
		
		y = x++;
		//연산과정 : y = x를 실행후 x를 1증가
		System.out.printf("결과 >> x: %d, y : %d\n\n", x, y);
		
	}

}
