package ITbank;

class Parent{//부모클래스
	int parentField;
	
	public Parent(){
		System.out.println("부모클래스 생성자입니다.");
	}
	
	public void parentMethod() {
		System.out.println("부모클래스 메소드입니당");
	}
}

class Child extends Parent {//자식클래스 생성하고 자식클래스명 exteds 부모클래스명 이렇게하면 상속한다는 의미다.
	
	int childField;
	
	public Child() {
		super();//이거는 보통그냥 만들어준다. 생략가능 첫줄에만올수있다!
		
		System.out.println("자식클래스 생성자입니다.");
		
	}
	
	public void ChildMethod() {
		System.out.println("자식클래스 메소드입니당");
	}
}

public class TodayReview0622_v3 {
	//자 이제 드디어 상속 부모클래스,자식클래스이다
	//내가보기엔 이번수업에서 이게젤중요하다.
	//바로 해보겠다
	public static void main(String[] args) {
	Child child1 = new Child();
	
	child1.childField = 20;
	System.out.println("자식필드 : " + child1.childField);
	
	child1.parentField = 50;
	System.out.println("부모필드 : " + child1.parentField);

}
}
