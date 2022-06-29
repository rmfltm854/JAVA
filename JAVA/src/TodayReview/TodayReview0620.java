package ITbank;


class Test{
	
	String name = "조민수";//이건 고정값을 미리 준거다 밖에서 값을 입력받아오지못한다.
	int score;
	String title;
	
	public Test(String title) {
		this(title,60);
	}
	

	public Test(String title, int score){
		//System.out.println("하이요");
		this.title = title;
		this.score = score;
		//System.out.println("과목명은 : " + title);
		//System.out.println("점수는 : " + score);
	
	}
}

public class TodayReview0620 {

	public static void main(String[] args) {
		//0620 복습
		//오늘은 생성자, 클래스(객체) 배열 에대해서 배웠다.
		//아니 근데 JAVA 배우면서 느끼는건데 하는건는 별것도아닌데 이름이 너무 어렵다
		//내가 하고있는게 뭔지 말하라고하면 뭐,,배열만들고있다 뭐 하고있다
		//이렇게 말을할줄알아야 될것같은데
		//용어가 너무어렵다,, 기본적인 배열이나 반복문 이런건 말할수있는데
		//선언하고 뭐 초기화하고 블라블라~ 이게 너무 어렵다,,그냥,, 코딩하고있습니다,, 라고 하면안되나,,?
		//서론은 여기까지하고 본격적으로 복습을 해보겠다.
		
		
		//생성자 란?
		//new 연산자로 클래스로부터 객체를 생성할때 호출되어 객체의 초기화 역할을 한다.
		//객체초기화란? --> 필드를 초기화 하거나 메소드를 호출해서 객체를사용할 준비를 하는것.
		//new연산자에 의해  생성자가 성공적으로 실행되면 힙(heap)영역에 객체가 생성되고
		//객체의 번지가 리턴된다. ---> heap 이라는 영역이 정확이 뭔지는 잘모르겠고 그냥 그런공간에 생성이된다~
		
		
		
		Test test = new Test("국어",60);//이게뭐냐? 그냥 간단하게 Test라는 클래스를 불러온다~ 라고 생각하면 되지않을까?
	    
		//System.out.println(test.name + "님" + test.title + "과목의점수는" + test.score);
		
		
		
		//다른 생성자 호출 this() 이게뭐냐 장황하게 하지말고 그냥 딱 간단하게 한놈이 복잡한거다하고 나머지는 그냥 받아서쓰는거다.
		
		

	}

}
