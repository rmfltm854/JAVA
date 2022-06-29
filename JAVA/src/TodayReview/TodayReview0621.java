package ITbank;

public class TodayReview0621 {
	
	// 오늘은 이걸뭐라고표현해야할지는 잘모르겠데,, 솔직히 기능은알고 쓸줄아는데 이거이름을 모르겠다,,
   //생성자를 호출할때 조건을 붙힐수있는데 종류가 여러가지다.
	
	
	//모든패키지에서 생성자를 호출할수있다.
	//public 은 그냥 모든 아무떄나 그냥 쓸수있는 어디위치에서든 불러올수있다.
	//그대신 import ITbank.TodayReview0621; 이렇게 import로 패키지와 클래스 주소를 잡아줘야 한다.
	public TodayReview0621() {
		System.out.println("public생성자");
	}
	
	
	//같은패키지와 자식클래스에서 생성자호출
	//protected 는 같은패키지내에만! 있으면 다른 class 파일에서도 불러올수가 있다.
	//자식클래스는 아직안배웠다.
	protected TodayReview0621(int a) {//매개변수 받아오는거는 오버로딩인가 오버라이딩 할려고 일부러넣은거고 의미가없다,
		System.out.println("protected생성자");
	}
	
	//default생성자 = 같은패키지내에서 제한없이 생성자호출
	//default 는 같은 패키지내에서 어디든지 불러올수있다.
	TodayReview0621(int a, int b){   //매개변수 받아오는거는 오버로딩인가 오버라이딩 할려고 일부러넣은거고 의미가없다,
		System.out.println("default생성자");
	}
	
	
	//오로지 클래스내부에서만 생성자 호출가능
	//이건 지금 사용하고있는 클래스 내에서만 호출이 가능하다 다른곳은 안됨
	private TodayReview0621(int a, int b, int c) {   //매개변수 받아오는거는 오버로딩인가 오버라이딩 할려고 일부러넣은거고 의미가없다,
		System.out.println("private생성자");
	}
	
	
	//다음은 정적변수 static
	
	static int count1 = 0;
	//static : 메모리상의 정적이다.(이말은 static변수는 프로그램을 실행하자마자 제일먼저 실행되는 변수이다.
	//공유되는 전역변수
	
	int count2 = 0;
	//인스턴스변수 즉,우리가 흔히들 잘아는 그런변수선언
	//static은 먼저실행되면서 메모리에값을 저장하는데
	//이친구는 호출해주는 사람이있어야 실행된다 로 이해하면되는거아닌가> 무슨 용어있었는데,,
	
	//두개 차이를 보기위해서 메소드하나를 만들어보겠다
	
	public void count() {
		count1++;
		count2++;
		System.out.println(count1);
		System.out.println(count2);
	}
	
	int x = 50;
	static int y = 80;
	
	public static void add() {
		System.out.println(y);//정적메소드는 인스턴스필드나 메소드는 사용못함 그냥 일반적인 변수로는 못쓰고 정적변수->정적메소드, 인스턴스변수->인스턴스메소드 이느낌
		
		//System.out.println(x); //오류 -> 인스턴스변수 사용X
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		TodayReview0621 review1 = new TodayReview0621();
		TodayReview0621 review2 = new TodayReview0621(1);   //매개변수 받아오는거는 오버로딩인가 오버라이딩 할려고 일부러넣은거고 의미가없다,
		TodayReview0621 review3 = new TodayReview0621(1,2);   //매개변수 받아오는거는 오버로딩인가 오버라이딩 할려고 일부러넣은거고 의미가없다,
		TodayReview0621 review4 = new TodayReview0621(1,2,3);   //매개변수 받아오는거는 오버로딩인가 오버라이딩 할려고 일부러넣은거고 의미가없다,
		
		TodayReview0621 review5 = new TodayReview0621();
		TodayReview0621 review6 = new TodayReview0621();
		TodayReview0621 review7 = new TodayReview0621();
		
		review5.count();//count1 = 1,count2 = 1
		System.out.println();
		review6.count();//count1 = 2,count2 = 1
		System.out.println();
		review7.count();//count1 = 3,count2 = 1
		
		
		//위에서는 정적변수였다면 이번에는 정적 메소드를 한번해보겠노라
		
		TodayReview0621.add();//정적메소드는 귀찮은 그뭐필요없이 클래스이름으로 바로접근가능!!
		
		//메인메소드 의 구조를 하나하나 살펴보겠다
		//public static void main(String[]args) {
		  //public : 접근제한자, 누구나 접근가능
		  //static : 지정예약어, 메모리에 미리 올린다
		  //void : 반환형, 반환할 것이 없다고 알려주는 반환형
		  //main : 메소드명, 시작이 main 메소드를 JVM이 찾는다.
		  //String[]args : 매개변수,String 형태의 배열로 arguments 값을 처리한다.
		
		
		
		//이론 Review 는 이정도로 하고 예제 하나 해보고 복습마무리하겠다.
		
		

	}

}
