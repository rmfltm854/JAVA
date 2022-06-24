package ITbank;

abstract class Review{
	
	String color;
	int speed;
	
	public Review(String color, int speed) {
		this.color = color;
		this.speed = speed;
		
	}
	public abstract void work();
	
	public abstract void color();
}

class Sedan extends Review{
	
	public Sedan(String color, int speed) {
		super(color , speed);
	}
	
@Override
public  void work() {
	System.out.println("세단 이 사람을 태우는중");
}

@Override
public void color() {
	System.out.println("세단의 색상은 : " + color);
	System.out.println("세단의 속도는 : " + speed);
}
}

class Truck extends Review{

	public Truck(String color, int speed) {
		super(color, speed);
}
	@Override
	public void work() {
		System.out.println("Truck 움직이는중");
	}
	
	@Override
	public void color() {
		System.out.println("Truck 색상은 : " + color);
		System.out.println("Truck 속도는 : " + speed);
	}
}
public class TodayReview0623 {

	public static void main(String[] args) {
		
		Sedan sedan = new Sedan("빨강", 200);
		sedan.work();
		sedan.color();
		
		Truck truck = new Truck("파랑", 300);
		truck.work();
		truck.color();
		
		

	}

}
