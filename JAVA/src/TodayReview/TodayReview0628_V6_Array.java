package ITbank;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TodayReview0628_V6 {

	public static void main(String[] args) {
		//이번에는 Array 클래스~
		
		int[] array = {1,2,3,4,5};
		
		for(int i = 0;i < array.length;i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(array));
		//Array 클래스는 배열로 쓰는데 있어서 펴리한 기능을 제공해주는 클래스
		//Math 클래스와 마찬가지로 static 메소드들로 구성되어있어서 class로 편하게 접근가능!
		
		int[] array2 = Arrays.copyOf(array, array.length);
		//copyof(복사할배열,길이)
		//길이마늠 새로운 배열이 만들어지고 복사할 배열의 index의 0 부터 복사된다.
		//길이를 복사할 배열보다 길에 설정할경우 디폴트값(0) 으로 설정되는데 생성이 되긴한다.
		
		System.out.println(Arrays.toString(array2));
		//이거배우기전에는 배열에있는값 다 꺼낼려며 for문 돌려야됬는데 이제는 그럴필요가 없다 이건 개꿀 
		
		int[] array3 = Arrays.copyOfRange(array, 0, 4);//4번째는 미포함
		//index2 ~ index3번째 까지길이의 배열이 만들어지고
		//index2 ~ index3번째 까지의 배열이 복사됨.
		System.out.println(Arrays.toString(array3));
		
		int[] intArray = {4,3,2,1,4,5,6,7,};
		
		Arrays.sort(intArray);
		//전달받은 배열의 모든요소를 오름차순으로 정렬
		System.out.println(Arrays.toString(intArray));

	}

}
