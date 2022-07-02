package TodayReview;

import java.util.*;

public class TodayReview0701_V2 {

	public static void main(String[] args) {
		
		Map<Integer, String>map = new HashMap<>();
		//Key타입, Value타입
		
		map.put(new Integer(1), new String("홍길동"));
		
		map.put(2, "성춘향");
		map.put(3, "이몽룡");
		map.put(4, "이순신");
		
		map.put(1, "홍길순");
		//같은 key객체로 객체를 저장하면 value객체가 대체된다.
		
		System.out.println(("key 객체의 수(Entry) : " + map.size()));
		System.out.println(map);//전체출력
		
		System.out.println(map.get(1));//key객체로  value객체를 얻는다.
		
		System.out.println(map.get(5));
		//key 객체가 존재하지 않으면, null값을 반환
		
		//객체를 하나씩 처리
		Set<Integer> keyset = map.keySet();//모든 key객체의 목록을 Set타입으로 반환
		
		Iterator<Integer> keyIter = keyset.iterator();
		
		while(keyIter.hasNext()) {
			
			int key = keyIter.next();
			String value = map.get(key);
			
			System.out.println("key : " + key + ",value : " + value);
		}
		
		map.remove(1);
		map.remove(2);
		
		System.out.println(map);
		
		map.clear();//전체삭제
		
		if(map.isEmpty()) {
			System.out.println("비어있음");
		}
	}

}
