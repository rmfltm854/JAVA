package ITbank;

class Outer {
	private int x = 100;
	private static int y = 200;
	
	public void outerMethod1() {
		System.out.println("public 바깥클래스 메소드");
	}
	
	private void outerMethod2() {
		System.out.println("private 바깥클래스 메소드");
	}
	
	class inner1{
		
		private int y = 300;
		
		
		public void outMember() {
			System.out.println("outer 의 x " + x);
			System.out.println("inner 의 y " + y);
			System.out.println("outer 의 y " + Outer.y);//이렇게 클래스명.변수 로불러와야한다.
			outerMethod1();
			outerMethod2();
		}
	}
}



public class TodayReview0622 {
	
	private TodayReview0622() {}
	
	private static TodayReview0622 instance = new TodayReview0622 ();
	
	public static TodayReview0622 getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		
		//오늘은 여러가지 그,, 부모자식 이랑 상속 같은건가? 암튼그거랑 싱클톤 이라는친구,그리고 메소드 오버라이딩 뭐 다양하게 배웠는데
		//이름을 다모르겠다 근데 어떻게하는건지는 안다,, 참,,아이러니하다 그죠?
		//우선 pdf자료에 이름들을 참고해서 한번 진행해보겠다.
		//첫번째로 싱글톤
		
		//싱글톤
		//싱글톤 이란?--->어떤 클래스가 최초 한번만 메모리를 할당하고(Static) 그 메모리에 객체를 만들어 사용하는 디자인 패턴
		//그냥 쉽게말하면 한번값을정해놓고 안바꾼다 뭐그런것같은데 해보겠다
		
		TodayReview0622 ex1 = TodayReview0622.getInstance();
		
		
		
		TodayReview0622 ex2 = TodayReview0622.getInstance();
		
		
		if(ex1 == ex2) {
			System.out.println("같은거임");
		}else {
			System.out.println("다른거임");
		}
		//이거 돌리면 같은거임 이나오는데
		//이말은 곧 뭐냐 -->ex1 이랑 ex2 가 같은 객체를 공유한다는 거겠죠?
		
		//inner 클래스에서  outer 클래스 멤버 접근해보기
		
		Outer out = new Outer(); //우선 Outer클래스의 객체생성
		
		
		Outer.inner1 out2 = out.new inner1();//이거 그냥 경로라고생각하면 편함--> Outer 클래스 안에 inner1클래스 안에객체생성 = Outer클래스안에객체에 inner1클래스 객체를넣는다
		
		out2.outMember();
		
		

		

	}

}
