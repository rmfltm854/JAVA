package ITbank;

import java.util.Scanner;

class Member{
	 private String name;
	 private int age;
	 private String tel;
	
	public Member(String name, int age, String tel){
		this.name = name;
		this.age = age;
		this.tel = tel;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
	class MemberService{
		Member[] member;
		Scanner scan = new Scanner(System.in);
		
		public void memberInsert() {
		
		System.out.println("몇명의 회원을 만드시겠습니까?");
		Member[] member = new Member[scan.nextInt()];
		
		for(int i = 0;i<member.length;i++) {
			System.out.println(i+1 + "번째 학생 이름을 입력해주세요");
			String name = scan.next(); 
			
			System.out.println(i + 1 + "회원의 나이");
			int age  = scan.nextInt();
			
			System.out.println(i + 1 + "전화번호");
			String tel = scan.next();
			
			member[i] = new Member(name,age,tel);
		}
	}
		public void memberPrint() {
			for(int i = 0; i<member.length;i++) {
				System.out.println(i+1+" 번째 회원의 이름은 " + member[i].getName() +  "나이" + 
			                       member[i].getAge() + "전화번호" + member[i].getTel());
			}
		}
		
}



public class TodayReview0620_v3 {

	public static void main(String[] args) {
		
		
		// 3번째 버전은 수업시간에 마지막에 예제로 준건데
		//수업시간에는 완성못했다.. 처음부터 혼자 다시 해보겠다
		//Member클래스를 만든다.
		//필드는 name age tel 로 하고 외부접근금지
		//생성자의 매개변수로 매개값을 받아 필드초기화
		//필드에 대한 getter setter 만들기
		//회원수(정수) 입력받아 그 수 만큼의 Member배열 생성하고 필드에 저장
		//2.반목문으로 회원의 이름,나이,전화번호를 입력받아 Member객체 생성 후
		//Member배열의 각 요소에 저장하기
		//memberPrint메소드에 반복문으로 배열안에 Member객체의
		//회원의 이름, 나이,전화번호 출력하기
		
		MemberService service = new MemberService();
		service.memberInsert();
		
		service.memberPrint();
		

	}

}




