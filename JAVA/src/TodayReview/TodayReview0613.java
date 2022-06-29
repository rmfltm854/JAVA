package ITbank;

import java.util.Scanner;

public class TodayReview0613 {

	public static void main(String[] args) {
		// 오늘은 for문을 배웠다. 구구단만들기, * 출력하기
		//*문제 변형하기 를했는데 일찍하면 일찍 보내준다했는데 자바몉번해본 사람 같지않게 끝날때까지 하지도못했다,, 현타가너무온다
		//지금 이게문제가아니라 인텔리제이 에 프로젝트를 spring.io 에서 받아와서 열어서 돌렸는데 되지를 않는다
		//몇일째 이거잡고있는지모르겠다,, mriadb 연동을 해서그런가 어디서잚못된거지,, 에러메시지 뜨는거 구글에검색해서 하라는거다해봤는데도 되지가않는다,,
		//진짜 수확도없고 뭐하고있는지도 모르겠다 화가너무나는데 화도나지만 현타가 너무온다,,컴퓨터에나름 자신있었는데 내가 코딩에 재능이없나,,?
		//됬고,,구구단을 만들어보자
		//구구단
		for(int a = 0; a<10; a++) {
			System.out.println();//이거는 그냥 보기쉬우라고 한줄뛰운거다.
			for(int b = 1; b<10; b++) {
				System.out.println(a +"*" + b + "=" + a*b);
			}
		}
    //이제 이구구단을 입력을받아서 만들어볼꺼다.
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("몇단을 알아볼껀가요?");
		a = scan.nextInt();
		for(b = 0;b<10;b++) {
			System.out.println(a+ "X" + b +"=" + a*b);
		}//구구단을 입력받아서 만들어봤는데 더 간단하게 할수도있을것같은데,, 내 지금머리로는 이게 한계다 
	// *출력하기
		for(int e = 0;e<5;e++) {
			System.out.println();
			for(int r = 0;r<5;r++) {
			System.out.print("*");
		  }
		}//이건 * 을 5개 연속 출력하는거고 이거를
		//*
		//**
		//이렇게 출력되게 해보기위해 노력해보겠다..
		
		for(int q = 0;q<5;q++) {
			System.out.println();
			for(int w = 0;w<=q;w++) {
			System.out.print("*");
		  }
		}//이게어떤느낌이냐면 줄이랑 * 개수가 똑같다.ex)1번째*,2번째**
		 //그러니까 *개수를 담당하는 j를 i보다 작거나 같게만들어주면 줄수엠맡게 * 개수가 들어간다
		
		//이번에는 뒤집어서 해볼꺼다
		for(int n = 0;n<5;n++) {
			System.out.println();
			for(int m = n;m<5;m++) {
			System.out.print("*");
		  }
		
	}
	

}
}
