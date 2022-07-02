package TodayReview;

import java.util.*;

class Number{
	int  num;
	
	public Number(int num) {
		this.num = num;
	}
	
	@Override
	public int hashCode() {
		return num;
	}
	
	@Override
	
	public boolean equals(Object obj) {
		if(obj instanceof Number) {
			Number number = (Number)obj;
			return number.num == this.num;
		}else {
			return false;
		}
	}
}

public class TodayReview0701 {

	public static void main(String[] args) {
		// 오늘은 Set클래스에대해서 배우고 다른 예제를 했다.
		//나한테는 학원에서 듣는 마지막 자바수업이었는데 일주일정도 고향에내려갈예정이다
	    //그래도 복습은 해야지...
		
	    //set : 데이터의 저장순서를 유지하지 않는다, 데이터의 중복저장을 허용하지 않는다.
		
		HashSet<String> set = new HashSet<>();
		
		set.add(new String("홍길동"));
		//new 연산자를 이용해 객체를 넣는다.
		set.add("성춘향");
		set.add("이몽룡");
		
		System.out.println("총 객체 수 : " + set.size());
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			
			//컬렉션에 요소(객체, 데이터)가 있는지 확인후 있으면 true반환
			
			String str = iter.next();
			System.out.println(str);
		}
		set.remove("홍길동");
		set.remove("성춘향");
		
		iter = set.iterator();//Iterator 는 1회성이므로 필요하면 객체를 얻어와야한다.
		
		 while(iter.hasNext()) {
			 System.out.println(iter.next());
		 }
		 
		 set.clear();
		 
		 if(set.isEmpty()) {
			 //set컬렉션 안이 비어있으면true 
			 System.out.println("비어있음!");
		 }
		 
		 HashSet<Number> number = new HashSet<Number>();
		 
		 number.add(new Number(100));
		 number.add(new Number(200));
		 
		 number.add(new Number(100));
		 number.add(new Number(200));
		 
		 System.out.println("총 객체 의 수 : " + number.size());
		 
		 Iterator<Number> numiter = number.iterator();
		 
		 while(numiter.hasNext()) {
			 
			 Number num = numiter.next();
			 System.out.println(num.num);
		 }

	}

}
