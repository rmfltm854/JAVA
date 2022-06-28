package ITbank;

import java.util.Random;

public class TodayReview0628_V4 {
	public static void main(String[] args) {
		
		//이제는 그냥 단순히 이런게있다~ 고만 알면되는데 한번 스윽 보곘다
		
		Random r = new Random(System.currentTimeMillis());//Random import해줘야됨
		//종자값 을 설정하여 난수를 발생
		//기본적으로 System.currentTimeMillis() 으로 난수를 발생시킨다 솔직히 걍 범위커서 그런듯
		//종자값을 다르게 설정한다.
		
		System.out.println(r.nextInt());//int범위의 난수 발생
		System.out.println(r.nextInt(45));//0~45 미만의 난수 발생
		System.out.println(r.nextLong());//Long범위의 난수발생
		
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());//0.0~1.0미만의 (float / double)타입의 난수 발생ㄹ
		System.out.println(r.nextBoolean());//true or false 중 랜덤으로 뽑아줌
		//여기까지는 솔직히 next 다음에 붙은거 딱보면 알쥬? 모르면 바아아아~보
		
		byte[] array = new byte[3];
		
		r.nextBytes(array);
		//byte[] 에 byte타입 난수를 발생시켜 칸만큼 채워넣어준다.
		for(byte ar : array) { //성능이 아주 많이 향상된 for문
			System.out.println(ar + " ");
		}
		System.out.println();
		
		int random = number(10);
		System.out.println(random);
		
		
		
	}
	
	//정수하나를 매개변수로 받아서 1~a 까지 중 하나를 반환해주는 메소드
	public static int number(int a) {
		Random r = new Random(System.currentTimeMillis());
		int number =  r.nextInt(a);
		return number;
	}

}
