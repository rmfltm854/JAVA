package ITbank;

import java.util.Scanner;

public class TodayReview0628_V5 {

	public static void main(String[] args) {
		//이번에는 Math 클래스인데 그냥 쭉 적어놓으면 나중에 보기편할것같아서 적어놓는당.
		//솔직히 github 에 있는거 복사붙혀넣기해도되는데 그래도 한번은 손으로 쳐봐야지 안쳐본것보다는 머리에 더 잘 남지 않겠나?
		
		int a = Math.abs(-10);
		//인자로 넘긴 데이터의 절댓값 반환
		System.out.println(a);
		
		int b = Math.max(1, 9);
		//두개중 더큰 수 반환
		System.out.println(b);
		
		int c = Math.min(8, 9);
		//두개중에 더작은수 반환
		System.out.println(c);
		
		double d = Math.random();
		System.out.println(d);
		
		double e = Math.ceil(1.1);
		//전달된데이터를 올림하여 반환
		System.out.println(e);
		
		double f = Math.floor(1.2);
		//전달된 데이터를 버림하여 반환
		System.out.println(f);
		
		long g = Math.round(5.3);
		long h = Math.round(5.7);
		System.out.println(g);
		System.out.println(h);
		//반올림
		
		//Scanner 로 3개의 값을 입력받아서 최댓값 최솟값 구하기띠
 		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수로 3개 입력해주세요");
		
		int max,min;
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		max = Math.max(num1,num2);
		max = Math.max(max,num3);
		System.out.println("최댓값 : " + max);
		
		min = Math.min(num1, num2);
		min = Math.min(min, num3);
		System.out.println("최솟값 : " + min);
		//첨에 학원에서 할때는 if로 돌려서했는데 학원에서는 이렇게하더라고,, 근데 결과는 똑같은데 컴퓨터가 컴파일 하는 속도나 메모리잡아먹는거 생각하면 이게 맞다~결과만 생각할때는 지났잖아,,
		
		

	}

}
