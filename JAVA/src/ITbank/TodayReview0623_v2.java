package ITbank;

import java.util.Scanner;

class Food{
	String  food;
	public  Food(String food) {
		this.food  = food;
	}
}

abstract class FoodService{
	public abstract Food[]  insertFood(int foodsu);
	public abstract void foodList(Food[] food);
}

class FoodServiceView extends FoodService{
	
	//insertFood : 음식수를 매개변수로 바아 그 수 만큼의 Food타입의 클래스배열을 만든다.
	//             반복문으로 먹은 음식수만큼 음식이름을 입력받아 Food 객체를 생성하여 배열의 각요소에 저장 후 배열 반환하기
	
	@Override
	public Food[] insertFood(int foodsu) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("음식 가짓수를 입력해주세요");
		foodsu = scan.nextInt();
		
		Food[] Food = new Food[foodsu];
		
		for(int i = 0;i<foodsu;i++) {
			System.out.println("음식입력");
		}
		return Food;
	}
	
	//foodList : Food 배열을 매개변수로 받아 배열안의 Food 객체의 음식이름 출력
	
	@Override
	public void foodList(Food[] food) {
		
	}
}

public class TodayReview0623_v2 {

	public static void main(String[] args) {
		

	}

}
