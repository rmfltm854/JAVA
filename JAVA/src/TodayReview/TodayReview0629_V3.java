package TodayReview;

public class TodayReview0629_V3 {
	
	public static void method() throws ClassNotFoundException{
		Class.forName("MINSUHANDSOMEGUY");//이런클래스가 없는데 그냥 찾으라고 메소드를 올리면
		//ClassNotFoundException 이런오류메시지가 떠요
		//근데 저게뜨면 method() 로던지라는거 거든요?
	}
	
	public static void error() throws ArithmeticException{
		System.out.println(1/0);
	}

	public static void main(String[] args) {
		// TodayReview0629_V2 에서 본 예외처리방법이 있고
		//직접처리하라고 throws로 던져줄수있는데 이거는 spring에서 본적이있습니다!
		
		try {
			method();
		}catch(ClassNotFoundException e) {
			System.out.println("해당클래스를 찾을수가 없떠요");
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			
		}finally {
			System.out.println("비슷~한데 별로어렵지않아요");
		}
		
		try {
			error();
		}catch(ArithmeticException e) {
			System.out.println("이렇게 가뿐하게 넘겨주면 되요");
		}finally {
			System.out.println("이거는 학원에서 한거는 아닌데 그냥 한번 실습해봤어요");
		}

	}

}
