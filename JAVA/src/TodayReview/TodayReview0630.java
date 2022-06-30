package TodayReview;

import java.util.*;

class Box<E>{
	private E obj;

	public E getObj() {
		return obj;
	}

	public void setObj(E obj) {
		this.obj = obj;
	}
	
	
}
public class TodayReview0630 {

	public static void main(String[] args) {
		//오늘은 ArrayList랑 LinkedList 등등 컬렉션쪽을 배우고
		//가장 중요하지는않지만 오늘 가장 나에게 충격을주었던 회원관리예제를 이후에 해보겠다
		
		Box<String> box = new Box<String>();
		box.setObj("쉽죠?");
		String str = box.getObj();
		System.out.println(str);
		
		//ArrayList
		ArrayList<String> list = new ArrayList<String>();
		//List : 데이터를 일렬로 늘어놓는 자료구조
		//데이터  중복허용, 순서중요!
		
		list.add("조민수");//리스트에 객체를 넣는 메소드
		list.add(new String("김범수")); //이렇게 new연산자로 넣어야되는데 자동형변환이 된다.
		
		int a = list.size();//배열 크기 알아보는데 반환값이 정수형이라 int로 받았다,.
		System.out.println(a);
		
		for(String name : list){//향상된 for문으로 뽑아올수도있고
			
			System.out.println(name);
			
		}
		System.out.println();
		
		for(int i = 0;i<list.size(); i++) {
			String str2 = list.get(i);
			System.out.println(str2);
		}
		
		list.remove(0);//0번쨰 객체삭제
		list.remove("조민수");
		
		System.out.println(list.contains("김범수"));//list.contains(a) = list안에 a가있는지확인하고 있으면 true 없으면 false 반환
		
		System.out.println();
		
		list.clear(); //list값 전체 삭제
		
		System.out.println(list.isEmpty());//list가 비었으면 true 아니면 false반환
		
		
		//LinkedList
		LinkedList<String> supercar = new LinkedList<String>();
		
		supercar.add("람보르기니");
		supercar.add("부가티");
		supercar.add("페라리");
		
		Iterator<String> iterator = supercar.iterator();
		//반복자 : 컬렉션에 저장된 요소들을 읽ㅇ오는 방법을 표준화 한것.
		//Iterator : 객체는 컬렉션 객체의 iterator() 메소드를 호출하여 얻어올수 있다.
		
		//hasNext : 컬렉션에 요소(객체,데이터) 가 있는 지 확인 후
		//          요소가 있으면 true 없으면 false 반환
		//next : 컬렉션의 다음요소를 가져온다.
		//remove : next메소드로 가져온 요소를 삭제
		
		while(iterator.hasNext()) {
			
			String car = iterator.next();
			System.out.println(car);
		}
		System.out.println();
		
		//iterator는 1회성 이므로 필요하면 다시 불러와서 사용해야한다.
		
		while(iterator.hasNext()) {
			
			String car = iterator.next();
			System.out.println(car);
			iterator.remove();//컬렉션에 저장된요소 삭제
			
		}
		System.out.println(list.isEmpty());

	}

}
