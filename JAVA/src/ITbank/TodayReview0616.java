package ITbank;

import java.util.Scanner;

public class TodayReview0616 {

public static void hello() {//hello 라는 메소드를 만들었다. --> hello 메소드를 호출하면 "hello"를 출력하라.
	System.out.println("hello");
}


public static int sum(int a, int b) {//이 메소드가 무슨말이냐? sum이라는 메소드를 호출할때 a,b정수 타입을 입력받으면 
	int result;//result라는 정수형타입으로 선언하고
	result = a + b;//result 라는 변수는 입력받은 a,b 를 식에따라 두개를 더한다.
	return(result);//result라는 변수안에있는 값을 return 즉,돌려준다.
}

public static double floating(double a, double b) {//floating이라는 메소드를 호출할때 실수타입 a,b 를 입력받는다
	double result;//실수형으로 result변수 선언
	result = a + b;// 실수 a + b 를 연산
	return(result);	//계산한값을 return 으로 반환띠
}

public static String sen(String a, String b) {//sen이라는 메소드를 호출할때 string타입 a,b 를 입력받는다.
	String result;//문자형으로 string 변수 선언,
	String[] print = new String[2];//이게 여기서부터는 이렇게배우진않았는데,, 문자열 2개를 받아와서 어떻게 한번에 출력할지를 잘몰라서 그냥 배열만들어서 안에넣어서 한번에 출력했다.(이게맞는지는 나도모름,,)
	print = new String[] {a , b};//print 배열안에 string타입입력값 a,b 저장
	result = print[0] + print[1];//result 라는 변수는 print 배열안에 0번째 1번째 문자를 합친것이다.
	return(result);
}

public static int minus(int a, int b) {
	int result;
	result = a-b;
	return(result);
}

public static int h(int a, int b) {
	int result;
	result = a * b;
	return(result);
}


public static int j(int a, int b) {
	int result;
	result = a/b;
	return(result);
}

public static void out(int a) {
	System.out.println("시스템을 종료합니다");
}

	public static void main(String[] args) {
		
		//오늘은 메소드, 오버라이드? 에대해서 배웠다.
		//바로해보겠다.
		
		hello();//메소드 호출 
		
		//자료형 마다 조금씩틀리다
		//정수형은 int byte 이런식으로 바꾸면된다
		//public static int()
		
		//실수형
		//public static double()
		
		//문자형
		//public static char()
		
		//바로 한번 굴려보겠다.
		
		//sum메소드 호출 a값은 5, b값은 6 으로 해보겠다.
		System.out.println(sum(5,6));//이게 처음에 sum(5,6)을 했는데 값이 안나오네?,, 그래서 sysout 을 써서 출력해주니까 정상적으로 출력이됬다.
		
		//실수형을 호출해보겠다.
		System.out.println(floating(2.9,3.7));//실수두개를 입력받아서 더하는 메소드(floating)
		
		//문자형을 호풀해보자.
		System.out.println(sen("하이","바이"));
		
		
		//이제는 입력을 받아서 더하기,빼기,나누기,곱하기 를 해주는거를 만들껀데 이거혼자 할수있을지는 진심1도 모루겠지만 어김없이 그냥 달린다 오늘도. 들이박으면 내머리가터지거나 제대로 되거나 둘중에하겠죠?
		
		int[] number = new int[2]; //입력받을 2개수를 저장할 배열생성
		
		Scanner scan = new Scanner(System.in);//입력받아야하니까 scanner import해준다.
		
		for(int a = 0;a<2;a++) {//이거그냥 손으로 sysout으로 해서 할려했는데,, 그래도 for문 써서 출력해보는게 더 편하지않을까 싶어서 한번 해봤다.. 
			System.out.println((a+1) + "번째수를 입력해주세요");//a+1 이라고 한이유는 a가0 부터 시작이기때문에 a+1 을 해줘야 순서가맞다
			 number[a] = scan.nextInt();//a번째 수를 입력받는다
			 System.out.println((a+1) + "번째 입력하신수 = "  + number[a] );
		}
		
		System.out.println("모드를 선택해주세요!");//모드를 한번에 묵을려고 선택을 받을꺼다.(카카오에 선택받고싶다,,)
		System.out.println("1.더하기, 2.빼기, 3.곱하기, 4.나누기, 5.프로그램종료");
		int c = scan.nextInt();//원하는 모드 선택받기.
		
		switch(c) {//사용자가 1~5번을 고르면 그번호에맞게 찾아가기
			case 1 :
				System.out.println(number[0] + "+"+ number[1] + "=" + sum(number[0],number[1]));
				break;//원하는연산했으면 여기서 멈추고 빠져나가게 설정했다.
				
				
			case 2:
				System.out.println(number[0] + "-"+ number[1] + "=" + minus(number[0],number[1]));
				break;//원하는연산했으면 여기서 멈추고 빠져나가게 설정했다.	
				
			case 3:
				System.out.println(number[0] + "*"+ number[1] + "=" + h(number[0],number[1]));
				break;//원하는연산했으면 여기서 멈추고 빠져나가게 설정했다.
			
			case 4:
				System.out.println(number[0] + "/"+ number[1] + "=" + j(number[0],number[1]));
				break;//원하는연산했으면 여기서 멈추고 빠져나가게 설정했다.
				
			default:
					System.out.println("시스템을 종료합니다");			
					System.exit(0);//시스템을 완전히 종료하는 메소드
		}
		
	}//하면서 느낀점은 아이거 좀만더 짧게할수있는 방법이 없나?? 좀더간편하게 할방법없나?? 를 주로고민했는데 최대한 간략하게 줄인게 123줄이다,, 이걸 반타작시킬방법이 없나,?
		

}

