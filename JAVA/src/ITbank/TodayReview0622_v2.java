package ITbank;

//Outer 클래스에서 Inner 클래스멤버 접근 
class Outer2{
	
	private int x = 100;
	public void innerMember() {
		
		System.out.println(x);
		//System.out.println(y);//y선언이 안되서 못함.
	}
	
	class Inner2{
		
		private int y = 200;
		
		public void innerMethod1() {
			System.out.println("public 안쪽 클래스 메소드");
		}
		
		private void innerMethod2() {
			System.out.println("private 안쪽클래스 메소드");
		}
	}
}
public class TodayReview0622_v2 {
	
	public static void main(String[] args) {
		
		
		Outer2 out = new Outer2();
		out.innerMember();
		Outer2.Inner2 inner = out.new Inner2();
		
		inner.innerMethod1();
//		inner.innerMethod2();//private 이라서 불러올수 없다.
		
		
		
		
		
		
		
	}

}
