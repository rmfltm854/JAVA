package TodayReview;

import java.util.ArrayList;
import java.util.Scanner;

class  Member2 {
	 String name;//이름
	 int age;//나이
	 String tel;//전화번호
	 String ID;//학번
	 
	//여기서 기술들어간다 뭐냐? 자동으로 만들어줌
	public Member2(String name, int age, String tel, String ID) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.ID = ID;
	}
	
	public void profile() {
		System.out.println("*********************************");
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 나이 : " + age);
		System.out.println("학생 전화번호 : " + tel);
		System.out.println("학생 학번 : " + ID);
		System.out.println("*********************************");
	}
	
	
	
}

public class TodayReview0630_V2 {

	public static void main(String[] args) {
		//이거는 profile메소드로 학번이름 학과를 출력하는메소드를 만든다.
		//근데 학원에서 한것보다 한단계올려서 입력을 받아서 출력한다.ㅇㅋ 렛츠기릿
		
		ArrayList<Member2> member = new ArrayList<Member2>();
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 이름,나이,전화번호,학번 을 순서대로 입력해주세욤!!");
		String name = scan.next();
		int age = scan.nextInt();
		String tel = scan.next();
		String ID = scan.next();
		
		member.add(new Member2(name,age,tel,ID));
		
		for(Member2 all : member) {
			all.profile();
		}
		

	}

}
