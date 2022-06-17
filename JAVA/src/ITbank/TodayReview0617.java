package ITbank;


class Car1 { // 차정보를 담굈는 클래스
	
	String kind = "SUV";
	String  name = "Sorento";
	int numboard = 4651;
	int maxSpeed = 200;
	
	
	
	
}

public class TodayReview0617 {

	public static void main(String[] args) {
		//오늘은 자바 클래스에 대해서 배웠다. public클래스 말고 클래스를 생성해서 메인메소드로 불러오는,, 뭐라설명을했는데 용어는 잘모르겠고 
		//어떻게 돌아가는지는 이해를 했기때문에,, 된거아닌가,,? 암튼 해보겠다
		//차의 정보를 입력한 클래스를 만들고 메인메소드로 출력해보겠다.
		
		Car1 car = new Car1();//이거 그냥 솔직히 기억잘안나고 Scanner import 할때랑 비슷한 문법상문맥으로 불러오면 된다. 내 생각에는 public클래스 밖 일반클래스 or 메소드를 불러올때는 저렇게 import를 해줘야하는것같음.
		System.out.println("차종류 : " + car.kind);//저장된값불러오기
		System.out.println("차 이름 : " + car.name);//저장된값불러오기
		System.out.println("차 번호 : " + car.numboard);//저장된값불러오기
		System.out.println("최대 속력 : " + car.maxSpeed);//저장된값불러오기
		
		

	}

}
