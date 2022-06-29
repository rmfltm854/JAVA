package TodayReview;
import java.util.Scanner;
import java.util.regex.Pattern;

class MemberProfile{
	private static String name;
	private static int age;
	private static String email;
	private static String tel;
	
	public MemberProfile(String name, int age, String email, String tel) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.tel = tel;
	}
	
	public static void profile(){
		System.out.println("*************************************");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("email : " + email);
		System.out.println("전화번호 : " + tel);
		System.out.println("*************************************");
		
	}
}

public class TodayReview0629 {

	public static void main(String[] args) {
		//오늘은 정규표현식 이라는 친구를 배웠는데 이거좀 헷갈린다....사실 다외우기 귀찮은거지,,음,,
		//자자! 이게뭐냐,, 음,,
		//그냥 음,,아 설명이안된다,,난 이게문제다
		//그니까 예를들면 회원가입을 할때보면 이메일을 입력하라고 되있는 칸이있는데 거기에 이메일처럼@ 가 포함된 형식이어야하는데 이상하게막 되있으면
		//이메일형식이 아니라고 다시입력하라고 사용자한테 알려줘야하는데 그걸 뭘로 파악할꺼냐? 이말이지 사람마다 이메일이 다~틀린데
		//그거를 다 입력해놓을수도없고,,그래서 나온게 만약에 email : abcd6631@naver.com 이라고하면 영어 숫자 @ 영어 . 영어 이렇게 미리 입력될꺼다
		//라고 정해놓으면 어떤 알파벳이들어와도 형식대조는 가능하곘쥬>?
		
		//우선 숫자 대조하는거보터 해보겠다
		String pattern = "^[0-9]*";//이게뭔말이냐~하면 0~9까지의 숫자가 0 or 1번이상 온다는 표현식이다
		String num1 = "123456";
		String num2 = "123aaa";
		
		boolean result1 = Pattern.matches(pattern, num1);//이게 패턴을 검사할때 쓰는 생성자?아니그냥 검사하는 친구형식이다
		System.out.println(result1);//저렇게하면 true가 나온다.
		
		boolean result2 = Pattern.matches(pattern, num2);
		System.out.println(result2);//num2에 숫자만들어가야하는데 문자가 있으면 false가 나온다.
		
		//아까 말했던 이메일 형식을 한번 표현식으로 만들어보자 근데 이거 표안보고 만들어라하면,, Surren 바로쳐야겠다
		String mail = "\\w++@\\w+\\.\\w+(\\.\\w+)?$";
		String mail2 = "bill7666@naver.com";
		boolean result3 = Pattern.matches(mail, mail2);
		System.out.println(result3);
		
		//그래서 바로그냥 실습예제 하나 하고 얘외처리로 넘어가겠다.
		
		//생성자의 매개변수로 필드초기화
		//필드를 출력해주는 profile메소드 만들기
		//이름,나이,이메일,전화번호 입력받기
		//4개입력받은값이 형식에 맞는지 비교하기
		//맞다면 string타입의 나이를 int형으로 바꿔주기
		//그리고 입력된 profile메소드 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름,나이,이메일,전화번호 를 순서대로 입력해주세요");
		String name = scan.next();
		String age = scan.next();
		String email = scan.next();
		String tel = scan.next();
		
		boolean namecheck = Pattern.matches("[가-힣]*", name);
		boolean agecheck = Pattern.matches("\\d+", age);
		boolean emailcheck = Pattern.matches("\\w++@\\w+\\.\\w+(\\.\\w+)?$", email);
		boolean telcheck = Pattern.matches("\\d{2,3}-\\d{3,4}-\\d{4}", tel);
		
		
		if(namecheck == true && agecheck == true && emailcheck == true && telcheck == true ) {
			System.out.println("올바른 이름형식입니다.");
			System.out.println("올바른 나이형식입니다.");
			System.out.println("올바른 이메일형식입니다.");
			System.out.println("올바른 전화번호형식입니다.");
			int intage = Integer.parseInt(age);
			MemberProfile member = new MemberProfile(name,intage,email,tel);
			member.profile();
			System.out.println("등록완료띠!");
		}else if(namecheck == false&& agecheck == true && emailcheck == true && telcheck == true ) {
			System.out.println("이름을 잘못입력했어요");
			System.out.println("기술부족으로 처음부터 다시 입력해주세요.");
		}else if(namecheck == true&& agecheck == false && emailcheck == true && telcheck == true ) {
			System.out.println("나이를 잘못입력했어요");
			System.out.println("기술부족으로 처음부터 다시 입력해주세요.");
		}else if(namecheck == true&& agecheck == true && emailcheck == false && telcheck == true ) {
			System.out.println("email을 잘못입력했어요");
			System.out.println("기술부족으로 처음부터 다시 입력해주세요.");
		}else if(namecheck == true&& agecheck == true && emailcheck == true && telcheck == false ) {
			System.out.println("전화번호를 잘못입력했어요");
			System.out.println("기술부족으로 처음부터 다시 입력해주세요.");
			
		}else { //여기도 노가다로 하나하나 다예외처리 해버리고싶은데 너무노가다라서 시간관계상 참는다..
			System.out.println("두개이상 잘못입력해서 첨부터 다시하세요");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
