package ITbank;

public class TodayReview0614 {

	public static void main(String[] args) {
		//오늘은 while문,do-while,break,continue,Array배열에대해서 배웠다.
		//while문으로 구구단출력해보기
		int a = 1;
		int b = 1;
		while(a<10) {
			while(b<10) {
				System.out.println(a + "*" + b + "=" + a*b);
				b++;
			}
			a++;
			b=1;
		}//이거 응용인데 좀많이헤맸다,, 설계하는건 아직도 익숙치가않다 제대로 이해가안되서그런건가,,
		
		//continue문은 continue를 딱만나면 거기서부터 밑으로 실행중지하고 다시 위로 돌아간다.
		/*while(a<20) {
			System.out.println("a값" + "=" + a );
			a++;
			if(a>5) {
				
				break;
			}
		}
		System.out.println("종료");*/ //이게 break문인데 저기보면 if a가5보다 크면 멈추고 빠져나가서 sysout(종료)문 출력하고 종료 하라는코드이다.
		
		
		//continue문;
		for(a =1;a<10;a++) {
			
			if(a==5) {
				continue;
			}
			System.out.println(a);
		}//a가5일때는 실행하지말고 첨으로 돌아가라는 코드이다. 100%다 그냥 내머릿속으로 코드짜면서 복습하고있는데 되는거보니까 좀신기하다.이래서 내가 코딩을 포기안해,,하,,재밌다,,,
		//다음은 배열인데 배열은 군대에서 이론은 대충이해하고있다.. 칸만들어주고 뭐 넣고 그런건데,, 일단 실습해보겠당
		//베열이란:같은타입의 데이터를 연속된 공간에 나열하고, 각 데이터에 인덱스(index)를 부여해놓은 자료구조이다.
		//배열을 선언할때 타입별로 선언을 해주는데 몇가지만 예로들자면
		int A[] = null;//A라는 배열안에 값은없다고 설정해준건데
		float B[] = null;
		char C[] = null;
		//이런식으로 형별로 배열을 선언해줄수있다.
		
		int D[] = {1,2,3,4};//D배열안에 1,2,3,4가있다는뜻이고 이거를 불러올때는
		System.out.println(D[1]);//이게 저기괄호안에있는 배열들중에 1번째 수를가져오는건데 배열은 0부터시작한다.
		
		//배열변수를 이미선언하고나서는 new연산자없이는 배열생성이안된다
		
		A = new int[] {1,2,3,4,5};//이렇게 이미 만들어놓은 A배열에 값을넣고싶으면 new연산자를 통해서 넣어줘야한다!
		
		//값 이 뭔지는 모르지만 몇개인지는 알것같다 하면 배열크기를 미리지정해줄수있다
		int F[] = new int[5];//이렇게 5칸을 만들어줄수있음!
		
		//F에있는 5칸의 배열에 숫자를 넣어주고싶으면
		F = new int[] {10,20,30,40,50}; //이렇게 넣어주면됩니다!
		
		//베열 안에들어있는값이 너무많으면 몇갠지 카운트가 안될때 배열길이를 알수있는 코드가있다
		System.out.println(F.length);//이렇게하면 5가 나오는데 그러면 안에 5개의값이있다는뜻이다
		
		
}
}


