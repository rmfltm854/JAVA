package ITbank;

//자 두번째는 this라는 걸 쓰는건데

class Car{
	int speed;
	
	public void setSpeed(int speed) {//int형으로 speed를 입력받고
		this.speed = speed;//Car클래스에서 정의한 speed 에 입력받은speed를 넣는다.
		System.out.println(this.speed);//저장되어있는 speed 출력
	}
}



public class TodayReview0617_v2 {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setSpeed(100);
		
		
	}

}
