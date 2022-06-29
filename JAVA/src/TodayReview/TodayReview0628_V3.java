package ITbank;

import java.util.Scanner;

public class TodayReview0628_V3 {

	public static void main(String[] args) {
		
		//이제할꺼는 이게 쓸데가있으니까 배우는거겠지만 이거배우면서 드는생각은,,
		//이거그냥 필요할떄 구글에찾으면 다나오는건데,,라고 생각했다.. 왜냐?
		//내가 20살~21살때 교수님 자바과목들을떄 뭐만들어봐라 하면 구글에 치면 그때그때 필요한 클래스나 함수같은거 너무 잘 설명되있는거를 빼다박은적이 한두번이아니라서 검색에는 자신이있다^^
		//물론 지금은 어느정도는 혼자서 칠수있을것같은데 내가 제출한코드 한번만 다시보고싶다.. 없는게 너무아쉬워욤
		
		//그냥 뭐라고하긴그렇고 이런게 있다~ 정도만 알아보겠다
		
		long time1 = System.currentTimeMillis();
		//현재시간을 읽어서 밀리세컨드값을 long으로 준다.
		System.out.println(time1);
		
		long time2 = System.nanoTime();//자 이거를 어떻게 한번 응용해볼수있느냐? 반복문 같은거 10000번정도 도는데 얼마나 걸리는지 궁금하지않나? 근데 그거는 수업시간에했으니까 나는while로 간다
		System.out.println(time2);
		
		long start = System.nanoTime();
		
		int i = 0;
		while (i<10000) {
			break;
		}
		
		long end = System.nanoTime();
		System.out.println("while문 10000번 돈시간" + (end - start) + "ns");//이렇게하면된다 100ns나오는데 내달리기속도보다 느리다
		
		//그다음은 System.exit(0) 이거는 그냥 딱보면 종료하는거겠쥬? 해보겠삼
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("자~ 골라보세요");
			System.out.println("1.조민수랑 결혼 2.조민수랑 동거 3. 꺼져 안해");
			int a = scan.nextInt();
			if(a==1) {
				System.out.println("결혼식장은 어디로?? 난 서울에서 할랭");
				System.exit(0);
			}else if(a==2) {
				System.out.println("누구 집에서 동거할래? 나밥많이먹는뎅");
				System.exit(0);
			}else {
				System.out.println("서운하지만 안녕,,");
				System.exit(0);
			}
		}//솔직히 이렇게 안해도되는데 그냥 한번 깝쳐봤다 아니 이렇게하는것도 실력이잖아,,?

	}

}
