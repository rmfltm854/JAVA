package ITbank;

class audi {
	
	public int speed;
	public void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("현재속도(Car클래스) : " + this.speed);
	}
	
}

class Genesis extends audi{
	
	@Override
	public void upSpeed(int speed) {
		this.speed += speed;
		if(speed>200) {
			System.out.println("최고 속도는200입니다. 기본셋팅 100으로 설정합니다");
			speed = 100;
			System.out.println("Genesis 현재속도 : " + speed);
		}else if(speed<0) {
			System.out.println("속도가 음수일수는 없습니다.최저속도 20으로 설정합니다");
			speed = 20;
			System.out.println("Genesis 현재 속도 : " + speed);
		}else {
			System.out.println("Genesis 현재속도 : " + super.speed);
		}
	}
}

class Porter extends audi{
	
	@Override
	public void upSpeed(int speed) {
		this.speed += speed;
		if(speed>100) {
			System.out.println("최고 속도는100입니다. 기본셋팅 100으로 설정합니다");
			speed = 100;
			System.out.println("포터 현재속도 : " + speed);
		}else if(speed<0) {
			System.out.println("속도가 음수일수는 없습니다.최저속도 20으로 설정합니다");
			speed = 20;
			System.out.println("포터 현재 속도 : " + speed);
		}else {
			System.out.println("포터 현재속도 : " + super.speed);
		}
	}
}

public class TodayReview0623_v3 {

	public static void main(String[] args) {
		// Car 클래스를 상속받는 Genesis 클래스를 만든다.
		// upSpeed 메소드를 오버라이딩 하여 재정의 해보자
		// 속도는 최고속도 200제한
		
		// Car 클래스를 상속받는 Porter 클래스를 만든다.
		// upSpeed 메소드르르 오버라이딩하여 재정의 해보자
		// 속도는 최고속도 100제한
		
		audi car = new audi();
		car.upSpeed(50);
		
		Genesis genesis = new Genesis();
		genesis.upSpeed(200);
		
		Porter porter = new Porter();
		porter.upSpeed(80);

	}

}
