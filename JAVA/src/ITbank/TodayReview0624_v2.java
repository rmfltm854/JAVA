package ITbank;

import java.util.Scanner;

class Suit{
	public void suit() {
		System.out.println("수트를 입습니다.");	
	}
}

interface Suitkind {
	public abstract void suitkind();
}

class Mark24 implements Suitkind{

	@Override
	public void suitkind() {
		System.out.println("Mark24를 착용합니다");		
	}
	
}

class Mark42 implements Suitkind{

	@Override
	public void suitkind() {
		System.out.println("Mark42 를 착용합니다.");	
	}
	public void attack() {
		System.out.println("razer 공격도 가능합니다.");
	}
	
}

class Utility extends Mark42{
	public void utility() {
		System.out.println("날기 기능도 있습니다.");
	}
}

interface Fly{
	public abstract void fly();
}

class Mark42fly implements Fly{

	@Override
	public void fly() {
		System.out.println("Mark42 비행을 시작합니다.");
		
	}
	
}

public class TodayReview0624_v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Suit a = new Suit();
		Mark24 mark24 = new Mark24();
		Mark42 mark42 = new Mark42();
		Utility utility = new Utility();
		Mark42fly flying = new Mark42fly();
	
		System.out.println("어떤종류의 수트를 입습니까?? 1.Mark24 2.Mark42");
		int name = scan.nextInt();
		if(name ==1 ) {
			mark24.suitkind();
			
		}else if(name == 2){
			mark42.suitkind();
			mark42.attack();
			utility.utility();
			System.out.println("날기기능을 사용하시려면 1번을눌러주시고 아니면 2번을눌러주세요");
			int y = scan.nextInt();
			if(y==1) {
				System.out.println("날기기능을 사용합니다");
				flying.fly();
			}else if(y==2){
				System.out.println("날리기능을 사용하지않습니다");
			}else {
				System.out.println("명령이 잘못되었습니다. 시스템을 종료합니다");
				System.exit(0);
			
			}
			
			
			
			
		
		}else {
			System.out.println("명령이 잘못되었습니다 주인님.");
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
		

	}

}
