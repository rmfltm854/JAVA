package JAVA;

public class ForEach {

	public static void main(String[] args) {
		/*for.each 을 활용한 배열 순환*/
	String[] numbers = {"one", "two", "three"};
	for(String number : numbers) {//객체형number 에 numbers배열저장
		System.out.println(number);
	}

	}

}
