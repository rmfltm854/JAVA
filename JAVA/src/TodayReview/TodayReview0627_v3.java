package ITbank;

import java.util.Scanner;

public class TodayReview0627_v3 {

	public static void main(String[] args) {
		//이거는 String 클래스에 딸려있는 메소드 라해야하나 암튼 그런건데 한번 쭉 보자
		
		String str1 = "Hello Java";
		//charAt : 해당위치의 문자하나를 char형으로 반환
		System.out.println("charAt : " + str1.charAt(0));
	
		
		//isEmpty : 해당변수가 비어있으면 true 아니면 false 반환띠
		System.out.println("idEmpty : " + str1.isEmpty());
		
		//length : 문자열 길이 반환 (뛰어쓰기 포함)
		System.out.println("length : " + str1.length());
		
		//toCharArray : 문자열을 한글자씩 char 배열로 반환
		char[] array = str1.toCharArray();
		for(char ch : array) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		//replace : 문자열 교체
		System.out.println(str1.replace("Hello", "Minsu"));
		
		//자~ 여기쯤에서 예제를 하나 풀어보겠습니당.
		//Scanner, charAt, if문 사용
		//주민등록번호 입력받아서 성별맞추기 (1,3 남자 / 2,4 여자)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록번호를 입력해주세요 - 포함");
		String pn = scan.next();
		System.out.println(pn);
		char number = pn.charAt(7);
		System.out.println(number);
		
		if(number == '1' || number == '3') {
			System.out.println("남자입니다");
		}else if(number == '2' || number == '4') {
			System.out.println("여자입니다.");
		}else {
			System.out.println("잘못입력하셨어요");
		}//이거짜는데는 얼마안걸렸는데 number == 1 이거를 1은 int형이고 number는 char형이기때뭄에 형이틀려서 정상적으로 비교가안된다 그래서 1을 int형이아닌 char 형으로 해줘야한다.
		
		
		String str5 = "Hello Java";
		
		//indexof : 문자열에 지정한 문자가 처음 몇번째에 있는지를 반환
		System.out.println("indexof : " + str5.indexOf("a"));
		
		//lastIndexof : 문자열에 지정한 문자가 마지막 몇번째에 있는지를 반환
		System.out.println("lastIndexof : " + str5.lastIndexOf("a"));
		
		//substring : 문자열에 지정한 범위에 속하는 문자열을 반환
		//(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지 않는다.)
		
		String str6 = "ABCDEFG";
		System.out.println("substring : " + str6.substring(0,2));
		
		//toLowerCase : 문자열에 대문자를 소문자로 변환
		String str7 = "ABCDEF";
		System.out.println(str7.toLowerCase());
		
		//toUpperCase : 문자열에 소문자를 대문자로 변환
		String str8 = "abcdef";
		System.out.println(str8.toUpperCase());
		
		//toString() : 문자열을 그래도 반환
		String str9 = "BABO JAVA";
		System.out.println(str9.toString());
		
		//trim : 문자열 앞 뒤 공백을 없애준다 (중간에 뛰어쓰기는 제외)
		String str10 = "      HEllo hello      ";
		System.out.println(str10.trim());
		
		//여기까지가 끝인데
		//오늘 봤더 이런 클래스들은
		//다외울필요가 없는게 자바api 문서들을 참조해서 필요할때 쓸수있다
		//https://docs.oracle.com/javase/18/docs/api
		//이거 몇개외우는거보다 api문서에서 필요한거 빠르게찾는 기술이 더중요하다고 나는생각한다.
		//끝!
				

	}

}
