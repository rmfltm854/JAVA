package ITbank;

public class TodayReview0627 {

	public static void main(String[] args) {
		//오늘은 Wrapper클래스와 다른여러가지 String 클래스에대해서 알아보았다.
		//뒤로가면서 이해가 안될줄알았는데 그냥,,쉽다 라고 생각이드는데
		//내가앞에꺼를 이해하면서 넘어와서 그런건지,, 아니면 빙산의일각인데 이거보고 쉽다고하는건지,,나도모르겠다,,
		//하긴,, 지금나한테 프로그램 하나 만들어봐 하면 구글안키고는 자신도없다,,
		//앞으로 더 노력해야겠다,, 퍼킹 정진
		
		//Wrapper클래스를 알아보곘다
		//Wrapper 클래스는 객체간의 비교가 필요한경우에 쓰인다.
		//자바collection 인터페이스는 객체만취급하기때문에, 기본타입을 객체로 사용해야하는경우가 많다.
		
		int a = 10;
		
		Integer b = new Integer(a);
		//기본타입 값을 포장객체로 만든다. -> 박싱 이라고 한다.
		//이게 무슨말이냐?
		//int a로 선언된변수를 객체타입으로 만들어줄려면 저렇게 포장을 해줘야한다.
		
		int c = b.intValue();
		//이거는 언박싱인데 말그래도 객체로저장된값을 int형으로 다시꺼내온다는말이다.
		//쓰는법 -->  객체.기본타입이름 + value()
		System.out.println(c);//출력
		
		//박싱이랑 언박싱은 자동으로 되기는 하지만 그래도 이렇게 박싱이된다~언박싱이된다~ 는 알아둬야할필요가 괴애애앵장히 있다.
		
		Integer d = 100;//자동박싱
		//이게 곧 뭐냐? -> Integer d = new Integer(100); 이말이다.
		int e = d;//자동 언박싱
		//이게 곧 뭐냐? --> int e = d.intValue(); 이말이다
		System.out.println(e);
		
		//Double형으로도 해보기
		Double r = new Double(3.14);//박싱\
		printDouble(r);
		printDouble(3.145);
		
		//포장객체 비교띠
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);
		//자 위에있는 obj1 과 obj2가 과연 같을까??
		System.out.println(obj1 == obj2);//정답은 땡!
		//이유는 100이라는값을 저장하는데 저거를 obj1이라는 방하고 obj2 라는 방 다른방에 값을 저장해서 틀리다
		//안에있는 값을 비교를 하려면 Wrapper객체이있는 equals 를 사용해야한다.
		System.out.println(obj1.equals(obj2));//이렇게하면 객체를비교하는게 아니라 객체안에있는 값을 비교한다.
		
		//문자열을 기본형(값) 으로 바꿀떄
		//Wrapper클래스.parse + 기본타입이름("변환할 문자열");
		
		String str = "314";//문자열로 314선언
		Integer str1 = Integer.parseInt("314");//int형으로 문자형314 변경
		
		

	}
	
	public static void printDouble(Double d) {
		double dd = d.doubleValue();//언박싱
		System.out.println(dd);
		System.out.println(d);
	}

}
