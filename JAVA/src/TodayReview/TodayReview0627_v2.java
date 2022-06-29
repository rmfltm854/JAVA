package ITbank;

import java.util.Scanner;

public class TodayReview0627_v2 {
	public static void main(String[] args) {
		
		//Scanner 를 사용해서 문자열(나이) 를 입력받아
		//정수로 변환한 다음에 20살이 넘으면 성인입니다
		//20살 미만이면 미성년자입니다 
		//를 출력해보자 (No google)
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("몇살이신가요?");
		String name = scan.next();
		
		Integer name1 = Integer.parseInt(name);
		
		if(name1>=20) {
			System.out.println("성인입니다");
		}else {
			System.out.println("미성년자입니당.");
		}//이게사실 제대로 할려면 0보다 작은수입력하면 잘못입력했다 하면서 예외처리 해줘야하는데
		//할줄아는데 사실귀찮다.. 그리고 요구사항만 일단 했다 간단하게^^*/
		
		//문자열을 기본타입 으로 변환할때 타입별로 있는데 그냥 한번 쭈욱 쳐보겠다.
		
		String str = "100";
		System.out.println(Byte.parseByte(str));//Byte형
		System.out.println(Integer.parseInt(str));//int형
		System.out.println(Short.parseShort(str));//short형
		System.out.println(Long.parseLong(str));//Long형
		
		str = "3.14";
		System.out.println(Float.parseFloat(str));//Float형
		System.out.println(Double.parseDouble(str));//Double형
		
		str = "true";
		System.out.println(Boolean.parseBoolean(str));//Boolean 형
		
		//String 생성자로 string객체 생성하기
		
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};//자 이게 숫자일까요 뭘까요
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//배열의 인덱스 위치부터 length만큼 String 객체 생성하기
		String str2 = new String(bytes,6,4);//코드 그대로 해석해봄 -> bytes라는 배열안에 6번째 부터시작해서 4개의 값을 빼와서 출력해라(이거 카운트에 뛰어쓰기 포함임)당연한거지만
		System.out.println(str2);
		
		//문자열을 byte배열로 반환
		String str3 = "Hello Java";
		byte[] array = str3.getBytes();
		//이거출력하기위해서 성능이아주많이 향상된 for문을 써보겠다
		for(byte by : array) {
			System.out.print(by + " ");//이러면 이게값이 숫자로나오는데 이숫자가 그,,아스키코드가아니고 그게이름이 뭐였더라,,아! 유니코드로 반환됩니다이 그러면 곧 위에있는byte배열 = 유니코드였다~
		}
		//요정도~
		
		
	}

}
