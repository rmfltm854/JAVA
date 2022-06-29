package ITbank;

public class TodayReview0616Ver2 {
	
public static void typeFinder(int a) {
	System.out.println("int 형입니다");
}

public static void typeFinder(long a) {
	System.out.println("long 형입니다");
}

public static void typeFinder(short a) {
	System.out.println("short 형입니다");
}

public static void typeFinder(byte a) {
	System.out.println("byte 형입니다");
}

public static void typeFinder(double a) {
	System.out.println("double 형입니다");
}

public static void typeFinder(float a) {
	System.out.println("float 형입니다");
}

public static void typeFinder(boolean a) {
	System.out.println("boolean 형입니다");
}

public static void typeFinder(char a) {
	System.out.println("char 형입니다");
}

public static void typeFinder(String a) {
	System.out.println("String 형입니다");
}

	public static void main(String[] args) {
		
		//복습 한거는 한장안에 최대한 넣어보려하는데 나의 자료구조 이해 부족으로 아무리짧게 간략하게 하려고해도 구글 안찾아보고 혼자 코딩치는 걸로는 이상태가 한계다,, 매일 벽을 느끼는중
		//이번에 해볼 것은 오버라이드?딩? 뭐 아무튼 그건데 
		//오늘 학원에서 이거 문제내고 푸는사람 30분먼저 마쳐준다고 했는데 비대면학생까지 20명? 정도되는데 거기서 3등함^^
		//매일 새로배우고 예재로 해서 응용해보라고 하면 맨날 못해가지고 해메다가 이번에 혼자 힘으로 바로 풀어냈는데 기분이 너무좋다
		//이런 재미 때문에 코딩이나 프로그래밍 이런게 질리지가않는다 그냥 매일이 새롭다,,(난 새로운거 배우는게 너무좋아^^)
		
		//이번 예제는 위에 메소드이름을 하나로 하면서 입력값이 int,double,String 뭐이런식으로 입력하면 자동으로 자료형 말해주는 메소드 구성하기이다.
		//처음에 문제 들었을때 나는 좀 이상하게 생각해서 byte범위 int 범위, long범위 뭐 이런거 모르니까구글에 검색을 하고 앉아있었는데
		//생각해보니까 그거 컴퓨터한테 판단하라는 거잖아? 라는생각이 들어서 컴퓨터 한테 판단을 맡기는 식으로 메소드를 만들어보자 생각하고 하니까 맞았다.
		//바로 해보겠다.
	    //메소드 이름은 typeFinder 로 하겠다이
		
		typeFinder(15000000000L);//아니이게 정상적으로되긴하는데 아무쓸때가 없는게 int값이 다른애들 값을 다포함하고 있어서 정수입력하면 전부다int형 나온다,, 젠장,,long같은경우는 15000000000L뭐한 이정도넣어주면 나온다 ㅋ

	}

}
