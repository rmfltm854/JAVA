package ITbank;

import java.util.Scanner;

public class TodayReview0609 {

	public static void main(String[] args) {
		/* escape문자*/
		
		// \ -> 이 문자 붙은 것을 이스케이프 문자 라고합니당.
		String str = "java의 \"이스케이프\" 문자입니다.";//\를쓰면 문자열안에 특정문자 포함가능
		System.out.println(str);//--> ava의 \"이스케이프\" 문자입니다.
        
		// \t // 탭만큼 뛰움 (외우기)
		// \n - 줄 빠굼(외우기)
		// \r - 캐리지리턴(줄 바꿈)
		// \" - "출력 (본적없음)
		// \' - '출력 (본적없음)
		// \ \ - \출력 (본적없음)
		// \ u16진수 - 16진수 유니코드에 해당하는 문자출력 (코드긁어올때도 한번도 본적없음ㅋㅋ)
		
		//printf 란 무엇인가?
		
		// System.out.println(내용); -->괄호안의 내용을 출력하고 행변경
		//System.out.print(내용); --> 괄호안의 내용만 출력
		//System.out.printf("형식문자열", 값1,값2,...); --> 괄호안의 첫 번째 문자열 형식대로 내용을 출력 (요친구는 좀이해안가는데)
		
		System.out.printf("정수 : %d\n", 1); // %d???????? 그냥 외워야할듯....S
		System.out.printf("실수 : %f\n", 1.2); // %f 는 float 줄임말이니까 외우기쉬움
		System.out.printf("문자 : %c\n", 'a');// %c 는 char 줄임말이니까 외우기쉬움
		System.out.printf("문자열 : %s\n", "Hello~~JAVA");// %s 는 sentence줄임말이니까 외우기쉬움
		
		//System.in 이거는 별볼일없고, 나는 그냥 Scanner 쓸꺼다!
		
		
		//Scanner (이거는 정확히뭔지모르지만 과제할때 코드긁어오면 젤많이보던 거다!)
		//Scanner 클래스는 한글을 읽어올때 유용하다이!
		
		//Scanner scan -> scan이라는 Scanner변수 선언 
		//new Scanner(System.in); -> 시스템의 입력장치로부터 읽는 Scanner 생성
		//scan.next(); -> 공백 이전까지 입력된 숫자(정수)를 읽음
		//scan.nextLine(); -> enteer키 이전까지 라인전체(공백포함) 데이터를 읽음.
		//scanner 클래스쓸떄 import 하나하나 치지말고 ctrl + shift + o 하면 자동으로됨 개꿀띠!
		
		Scanner scan = new Scanner(System.in);//이거는 외워둡시다
		
		System.out.println("이름뭡니까?");
		String b = scan.next();//이게 받는형식에따라서 string,float,boolean 뭐이런거 해도됨.
		System.out.println(b);
		
		//연산자띠
		//증감연산자 --> (++, --) 피연산자값을 1식 증감 또는 감소!
		//*문자열결합연산자
		//이거는바로예제로 들겠음
		System.out.println(2 + "항" + "연산자");
		//*비교 연산자
		// (==, !=, >, >=, <, <=) 이거는 보면 읽을수있다이!
		//*논리연산자
		// &&, & --> 이거는and연산자 즉, 둘다 값이 true일때만 true 아니면 다false
		// ||, | --> 이거는 or연산자 즉, 둘중에 하나만 true, 둘다true 이면 true
		// ^ --> 이거는 설명하기좀애매한테 둘중에하나만 true 면 그냥 true임
		// ! --> 이거는 피연산자 를 결과를 바꾸는거임 true 이면 false로 false이면 true로
		
		
	}

}
