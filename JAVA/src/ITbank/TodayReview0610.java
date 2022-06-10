package ITbank;

import java.util.Scanner;

public class TodayReview0610 {

	public static void main(String[] args) {
		//오늘 배운거는 if문 을 배웠는데 그거배우는데30분 가지고노는데 2시간30분,,, 계속 뭐만들어봐라 뭐만들어봐라 하는데
		//머리이론은 되는데 직접할려고하니까 그때필요한게 뭔지 기억이안나서 너무 짜증났다,, 어려운게아니라 그냥 생각되로 안되니까 짜증났다,,.,ㅠ
		
		//만들어보라고한게 다기억은 안나지만 일단 몇개 끄적여보겠다.
		// 1번 문제 코인 뽑기?동전 뭐라뭐라였는데 뭔지잘모르겠고 그냥 일단해보겠다.
		
		Scanner scan =  new Scanner(System.in);//입력받을려면 scanner선언하고
		int money,result;//자 500원짜리,100원짜리,50원짜리,10원짜리 변수선언 을 해주고
		System.out.println("금액을입력해주세욤.!");
		 money = scan.nextInt();
		 
		 result = money/500;
		 money = money%500;
		 if(result>0) {
			 System.out.println("500원짜리:" + result);
		 }
		 result = money/100;
	     money = money%100;
		 if(money > 0) {
			 System.out.println("100원짜리:" + result);
		 }
		 result = money/50;
		 money = money%50;
		 if(result>0) {
			 System.out.println("50원짜리:" + result);
		 }
		 result = money/10;
		 money = money%10;
		 if(result>0) {
			 System.out.println("10원짜리:" + result);
		 }
			 System.out.println("남은돈은:" + money);
		
			 
		//이거하나 혼자만드는데 1시간 걸리는거 진짜 실화냐,,머리가나쁜건지 뭔지모르겠다,,
		//조만간 백준알고리즘을 시작해야겠다,,
		//다짜고 알게된거지만 이거 if로 하는게 아니라 그냥 코드치는건데 혼자서if로만들겠다고 이러고있었다,, 하,,
		 }
		 
}


