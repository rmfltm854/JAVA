package TodayReview;

public class TodayReview0629_V2 {

	public static void main(String[] args) {
		//이제는 오류 의 종류에대해서 알아보겠다.
		
		//System.out.println();
		//컴파일 에러 : 컴파일 자체가 안됨.
		//자바 컴파일러 : 번역(구문체크)
		
		//System.out.println(args[0]);
		//실행에러 실행중 발생!
		//실행에러는 일단 돌릴수있기때문에 오류가발생할거를 개발자가 예상해서 처리를해줘야하는데
		//처리를 해주는 방법이 try catch 이다
		
		//System.out.println(1/0); //0으로 못나누는데 오류가안뜨거든요? 그럼 예외처리를 해줘야겠죠 해줄꼐요
		
		try {
		System.out.println(args[0]);//try블럭안에는 에러가 발생할것으로 예상되는 코드를 넣어준다
		}catch(ArrayIndexOutOfBoundsException e) { //ArrayIndexOutOfBoundsException 에러가 발생하면 실행
			System.out.println("ArrayIndexOutOfBoundsException 에러입니다");
			e.printStackTrace();//에러메시지를 출력해주는 코드에요
			System.out.println(e.getMessage());
		}finally { //에러에 상관없이 무조건 돌아가는 코드
			System.out.println("쉽죠? 알아요~");
		}
		
		try {
			System.out.println(1/0); //이게 여기서 오류가 발생하면 밑에코드는 실행을 안해요
			System.out.println("하이!");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException 에러발생!");
		}catch(Exception e) {
			System.out.println("이친구는 오류메시지 뜨는거 다잡아버리기때문에 타켓으로 에러메시지를 잡을꺼면 Exception 은 젤밑에 써야되요");
			
		}finally {
			System.out.println("이거의 핵심은! 어떤오류가 뜰지 미리 알고 부드럽게돌아서 넘어가줘야한다. 그말은곧! 짬이 중요하다!");
		}

	}

}
